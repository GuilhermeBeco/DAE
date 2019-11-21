package ejbs;

import entities.Administrador;
import entities.Atleta;
import entities.Modalidade;
import exceptions.*;

import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.LockModeType;
import javax.persistence.PersistenceContext;
import javax.validation.ConstraintViolationException;
import java.util.List;

@Stateless(name = "AdministratorEJB")
public class AdministratorBean {
    @PersistenceContext
    private EntityManager em;

    public Administrador create(int adminCode, String username, String password, String name, String email) throws MyEntityAlreadyExistsException, MyConstraintViolationException, MyIllegalArgumentException {

        if(findAdministrador((username)) != null){
            throw new MyEntityAlreadyExistsException("Username '"+ username +"' já existe");
        }

        try{
            Administrador administrador = new Administrador(adminCode, username, password, name, email);
            em.persist(administrador);
            return administrador;
        }catch (ConstraintViolationException e){
            throw new MyConstraintViolationException(Utils.getConstraintViolationMessages(e));
        }
    }

    public void delete(String username){
        Administrador administrador = findAdministrador(username);

        if(administrador == null){
            return;
        }

        em.remove(administrador);
    }

    public Administrador update(String username, String password, String name, String email) throws MyEntityNotFoundException{
        try{
            Administrador administrador = em.find(Administrador.class, username);

            if(administrador == null){
                throw  new MyEntityNotFoundException("Administrador '"+ username +"' não foi encontrado");
            }

            em.lock(administrador, LockModeType.OPTIMISTIC);

            administrador.setUsername(username);
            administrador.setPassword(password);
            administrador.setName(name);
            administrador.setEmail(email);

            em.merge(administrador);

            return administrador;
        }catch(MyEntityNotFoundException e){
            throw e;
        }catch (Exception e){
            throw new EJBException("ERROR UPDATING ADMINISTRADOR", e);
        }
    }

    public List<Administrador> listAll(){
        try{
            return (List<Administrador>) em.createNamedQuery("obterAdministradores").getResultList();
        }catch (Exception e){
            throw new EJBException("ERROR_RETREIVING_ADMINISTRADORES", e);
        }
    }

    public Administrador findAdministrador(String username){
        try{
            return em.find(Administrador.class, username);
        }catch (Exception e){
            throw new EJBException("ERROR_FINDING_ATLETA", e);
        }
    }


}
