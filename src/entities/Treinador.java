package entities;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import java.io.Serializable;

@NamedQueries({@NamedQuery(
        name = "obterTreinadores",
        query = "SELECT t FROM Treinador t ORDER BY  t.name")
})
@Entity
public class Treinador extends User implements Serializable {
    public Treinador(String username, String password, String name, String email) {
        super(username, password, name, email);
    }

    public Treinador() {
    }
}
