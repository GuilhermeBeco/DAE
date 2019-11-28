package dtos;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedHashSet;

public class TreinadorDTO implements Serializable {

    private String username, password, email, name;
    private Collection<ModalidadesDTO> modalidades;
    private Collection<AtletaDTO> atletas;

    public TreinadorDTO(String username, String password, String email, String name) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
        this.modalidades = new LinkedHashSet<ModalidadesDTO>();
        this.atletas = new LinkedHashSet<AtletaDTO>();
    }
    public TreinadorDTO(String username, String password, String email, String name, LinkedHashSet<ModalidadesDTO> modalidades,LinkedHashSet<AtletaDTO> atletas ) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
        this.modalidades = modalidades;
        this.atletas = atletas;
    }

    public TreinadorDTO(){
    this.atletas = new LinkedHashSet<AtletaDTO>();
    this.modalidades = new LinkedHashSet<ModalidadesDTO>();
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

    public Collection<ModalidadesDTO> getModalidades() {
        return modalidades;
    }

    public void setModalidades(Collection<ModalidadesDTO> modalidades) {
        this.modalidades = modalidades;
    }

    public Collection<AtletaDTO> getAtletas() {
        return atletas;
    }

    public void setAtletas(Collection<AtletaDTO> atletas) {
        this.atletas = atletas;
    }
}
