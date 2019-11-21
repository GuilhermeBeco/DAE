package entities;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.util.Collection;
import java.util.LinkedHashSet;

@Entity
@Table(name = "ESCALOES")
@NamedQueries({
        @NamedQuery(
                name = "getAllEscaloes",
                query = "SELECT e FROM Escalao e ORDER BY e.name" // JPQL
        )
})
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Escalao {
    @Id
    private int id;
    @NotNull
    private String tipo;
    @NotNull
    private String descricao;
    @NotNull
    private int endAge;
    @ManyToMany(mappedBy = "escaloes")
    private Collection<Modalidade> modalidades;

    public Escalao() {
        this.modalidades= new LinkedHashSet<Modalidade>();
    }

    public Escalao(int id, String name, int startAge, int endAge, LinkedHashSet<Modalidade> modalidades) {
        this.id = id;
        this.name = name;
        this.startAge = startAge;
        this.endAge = endAge;
        this.modalidades=modalidades;
    }
}
