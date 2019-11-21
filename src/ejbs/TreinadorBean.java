package ejbs;

import entities.Modalidade;
import entities.Socio;
import entities.Treinador;

import javax.ejb.EJBException;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless(name = "TreinadorEJB")
public class TreinadorBean {

    @PersistenceContext
    private EntityManager em;

    public Treinador create(String username, String password, String email, String name){
        Treinador treinador = new Treinador(username, password, email, name);
        em.persist(treinador);
        return treinador;
    }

    public List<Treinador> all(){
        try{
            return (List<Treinador>) em.createNamedQuery("obterTreinadores").getResultList();
        }catch (Exception e){
            throw new EJBException("ERROR_RETREIVING_TREINADORES", e);
        }
    }

    public Treinador findTreinador(String username){
        try{
            return em.find(Treinador.class, username);
        }catch (Exception e){
            throw new EJBException("ERROR_FINDING_TREINADOR", e);
        }
    }

}
