package ejbs;

import entities.Atleta;
import entities.Modalidade;

import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date;
import java.util.List;

@Stateless(name = "AtletaEJB")
public class AtletaBean {

    @PersistenceContext
    private EntityManager em;

    @EJB
    private ModalidadeBean modalidadeBean;

    public Atleta create(String username, String password, String email, String name, int socioCode, Date dataAdesao){
        Atleta atleta = new Atleta(username, password, email, name,socioCode,dataAdesao);
        em.persist(atleta);
        return atleta;
    }

    public List<Atleta> all(){
        try{
            return (List<Atleta>) em.createNamedQuery("obterAtletas").getResultList();
        }catch (Exception e){
            throw new EJBException("ERROR_RETREIVING_ATLETAS", e);
        }
    }

    public Atleta findAtleta(String username){
        try{
            return em.find(Atleta.class, username);
        }catch (Exception e){
            throw new EJBException("ERROR_FINDING_ATLETA", e);
        }
    }


}
