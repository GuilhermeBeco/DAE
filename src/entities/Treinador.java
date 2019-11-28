package entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

@Entity
@Table(name = "TREINADORES")
@NamedQueries({
        @NamedQuery(
                name = "getAllTreinadores",
                query = "SELECT t FROM Treinador t ORDER BY t.name" // JPQL
        )
})
public class Treinador extends Pessoa {
    @ManyToMany(mappedBy = "treinadores")
    private Collection<Modalidade> modalidades;
    private Collection<Atleta> atletas;

    public Treinador(String username, String password, String email, String name) {
        super(username, password, email, name);
        this.modalidades = modalidades;
        this.atletas = atletas;
        this.modalidades = new LinkedHashSet<Modalidade>();
        this.atletas = new LinkedHashSet<Atleta>();
    }

    public Treinador() {
        this.modalidades = new LinkedHashSet<Modalidade>();
        this.atletas = new LinkedHashSet<Atleta>();
    }



    public void addModalidade(Modalidade modalidade) {
        this.modalidades.add(modalidade);
    }

    public Collection<Modalidade> getModalidades() {
        return modalidades;
    }

    public Collection<Atleta> getAtletas() {
        return atletas;
    }

    public void addAtleta(Atleta atleta) {
        this.atletas.add(atleta);
    }


}
