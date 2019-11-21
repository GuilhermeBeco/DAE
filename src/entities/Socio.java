package entities;

import org.jetbrains.annotations.NotNull;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import java.io.Serializable;
import java.util.Set;

@NamedQueries({@NamedQuery(
        name = "obterSocios",
        query = "SELECT s FROM Socio s ORDER BY  s.name")
})
@Entity
public class Socio extends User implements Serializable {

    @ManyToMany
    @NotNull
    private Set<Modalidade> modalidades;

    public Socio(){

    }

    public Socio(String username, String password, String name, String email, Set<Modalidade> modalidades){
        super(username, password, name, email);
        this.modalidades = modalidades;
    }

    public void addModalidade(Modalidade modalidade){
        if()
    }
}
