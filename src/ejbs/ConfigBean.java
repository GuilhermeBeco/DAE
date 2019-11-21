package ejbs;

import entities.Atleta;

import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.annotation.PostConstruct;

@Startup
@Singleton(name = "ConfigEJB")
public class ConfigBean {

    @EJB
    private AtletaBean atletaBean;

    @EJB
    private ModalidadeBean modalidadeBean;

    @PostConstruct
    public void populateDB(){
        Modalidade modalidade = modalidadeBean.create(1, "futebol");
        Atleta atleta = atletaBean.create("xico", "xicodias", "xicodias1999@gmail.com", "Francisco Dias", modalidade);
    }
}
