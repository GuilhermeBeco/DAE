package entities;


import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "ATLETAS")
@NamedQueries({
        @NamedQuery(
                name = "getAllAtletas",
                query = "SELECT a FROM Atleta a ORDER BY a.name" // JPQL
        )
})
public class Atleta extends Socio{
    @ManyToMany(mappedBy = "atletas")
    private Collection<Modalidade> modalidadesPraticadas;

    private Collection<Treinador> treinadores;

    public Atleta(String username, String password, String email, String name, int socioCode, Date dataAdesao) {
        super(username, password, email, name, socioCode, dataAdesao);
        this.modalidadesPraticadas = new LinkedHashSet<Modalidade>();

    }

    public Atleta(List<Modalidade> modalidades) {
        this.modalidadesPraticadas = new LinkedHashSet<Modalidade>();
    }

    public Collection<Modalidade> getModalidades() {
        return modalidadesPraticadas;
    }

    public void addModalidadesPraticadas(Modalidade modalidade) {
        this.modalidadesPraticadas.add(modalidade);
        super.addModalidades(modalidade);
    }
}
