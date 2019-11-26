package dtos;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedHashSet;

public class AtletaDTO implements Serializable {

    private String username, password, email, name;
    private Collection<TreinadorDTO> treinadores;
    public AtletaDTO(String username, String password, String email, String name) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
    }
    public AtletaDTO(String username, String password, String email, String name, LinkedHashSet<TreinadorDTO> trinadores) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
        this.treinadores = trinadores;
    }

    public AtletaDTO(){
        this.treinadores = new LinkedHashSet<TreinadorDTO>();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }
}
