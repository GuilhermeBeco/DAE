package ejbs;

import entities.Atleta;
import entities.Modalidade;
import entities.Socio;

import javax.ejb.EJBException;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless(name = "SocioEJB")
public class SocioBean {

    @PersistenceContext
    private EntityManager em;

    public Socio create(String username, String password, String email, String name){
        Socio socio = new Socio(username, password, email, name);
        em.persist(socio);
        return socio;
    }

    public List<Socio> all(){
        try{
            return (List<Socio>) em.createNamedQuery("obterSocios").getResultList();
        }catch (Exception e){
            throw new EJBException("ERROR_RETREIVING_SOCIOS", e);
        }
    }

    public Socio findSocio(String username){
        try{
            return em.find(Socio.class, username);
        }catch (Exception e){
            throw new EJBException("ERROR_FINDING_SOCIO", e);
        }
    }
}
