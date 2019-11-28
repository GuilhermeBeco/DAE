package dtos;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashSet;

public class SocioDTO implements Serializable {
    private int socioCode;
    private Date dataAdesao;
    private Collection<ModalidadesDTO> modalidades;
    private String username, password, email, name;

    public SocioDTO(int socioCode, Date dataAdesao, LinkedHashSet<ModalidadesDTO> modalidades, String username, String password, String email, String name) {
        this.socioCode = socioCode;
        this.dataAdesao = dataAdesao;
        this.modalidades = modalidades;
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
    }

    public SocioDTO() {
        this.modalidades = new LinkedHashSet<ModalidadesDTO>();
    }

    public SocioDTO(int socioCode, Date dataAdesao, String username, String password, String email, String name) {
        this.socioCode = socioCode;
        this.dataAdesao = dataAdesao;
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
        this.modalidades = new LinkedHashSet<ModalidadesDTO>();
    }

    public int getSocioCode() {
        return socioCode;
    }

    public void setSocioCode(int socioCode) {
        this.socioCode = socioCode;
    }

    public Date getDataAdesao() {
        return dataAdesao;
    }

    public void setDataAdesao(Date dataAdesao) {
        this.dataAdesao = dataAdesao;
    }

    public Collection<ModalidadesDTO> getModalidades() {
        return modalidades;
    }

    public void setModalidades(Collection<ModalidadesDTO> modalidades) {
        this.modalidades = modalidades;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
