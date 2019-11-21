package entities;

import org.hibernate.validator.constraints.Email;
import org.intellij.lang.annotations.Pattern;
import org.jetbrains.annotations.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@NamedQueries({@NamedQuery(
        name = "obterAtletas",
        query = "SELECT a FROM Atleta a ORDER BY  a.name")
})
@Entity
public class Atleta extends Socio implements Serializable {

    public Atleta(){

    }

    public Atleta(String username, String password, String email, String name, Set<Modalidade> modalidades){
        super(username, password, name, email, modalidades);
    }

    public void addModalidadePraticada(Modalidade modalidade){

    }
}
