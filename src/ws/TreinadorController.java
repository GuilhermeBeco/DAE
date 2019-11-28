package ws;


import dtos.TreinadorDTO;
import ejbs.TreinadorBean;

import entities.Treinador;

import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.stream.Collectors;

@Path("/treinadores") // relative url web path of this controller
@Produces({MediaType.APPLICATION_JSON}) // injects header “Content-Type: application/json”
@Consumes({MediaType.APPLICATION_JSON}) // injects header “Accept: application/json”

public class TreinadorController {

    @EJB
    private TreinadorBean treinadorBean;

    public TreinadorDTO toDTO(Treinador treinador){
        return new TreinadorDTO(
                treinador.getUsername(),
                treinador.getPassword(),
                treinador.getEmail(),
                treinador.getName()
        );
    }

    public List<TreinadorDTO> toDTOs(List<Treinador> treinadores){
        return treinadores.stream().map(this::toDTO).collect(Collectors.toList());
    }

    @GET
    @Path("/")
    public List<TreinadorDTO> all(){
        try{
            return toDTOs(treinadorBean.all());
        }catch(Exception e){
            throw new EJBException("ERROR_GET_ATLETAS", e);
        }
    }

    @POST
    @Path("/")
    public Response createNewTreinador (TreinadorDTO treinadorDTO){
        Treinador treinador = treinadorBean.create(treinadorDTO.getUsername(), treinadorDTO.getPassword(), treinadorDTO.getEmail(), treinadorDTO.getName());
        return Response.ok().build();
    }
}
