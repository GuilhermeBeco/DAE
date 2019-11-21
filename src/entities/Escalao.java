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
    private String name;
    @NotNull
    private int startAge;
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
        this.modalidades= new LinkedHashSet<Modalidade>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStartAge() {
        return startAge;
    }

    public void setStartAge(int startAge) {
        this.startAge = startAge;
    }

    public int getEndAge() {
        return endAge;
    }

    public void setEndAge(int endAge) {
        this.endAge = endAge;
    }

    public Collection<Modalidade> getModalidades() {
        return modalidades;
    }

    public void addModalidade(Modalidade modalidade){
        modalidades.add(modalidade);
    }
}
