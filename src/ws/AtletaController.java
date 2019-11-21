package ws;

import dtos.AtletaDTO;
import ejbs.AtletaBean;
import entities.Atleta;

import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.stream.Collectors;

@Path("/atletas") // relative url web path of this controller
@Produces({MediaType.APPLICATION_JSON}) // injects header “Content-Type: application/json”
@Consumes({MediaType.APPLICATION_JSON}) // injects header “Accept: application/json”

public class AtletaController {

    @EJB
    private AtletaBean atletaBean;

    public AtletaDTO toDTO(Atleta atleta){
        return new AtletaDTO(
                atleta.getUsername(),
                atleta.getPassword(),
                atleta.getEmail(),
                atleta.getName(),
        );
    }

    public List<AtletaDTO> toDTOs(List<Atleta> atletas){
        return atletas.stream().map(this::toDTO).collect(Collectors.toList());
    }

    @GET
    @Path("/")
    public List<AtletaDTO> all(){
        try{
            return toDTOs(atletaBean.all());
        }catch(Exception e){
            throw new EJBException("ERROR_GET_ATLETAS", e);
        }
    }

    @POST
    @Path("/")
    public Response createNewAtleta (AtletaDTO atletaDTO){
        Atleta atleta = atletaBean.create(atletaDTO.getUsername(), atletaDTO.getPassword(), atletaDTO.getEmail(), atletaDTO.getName());
    }
}
