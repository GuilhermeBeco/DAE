package entities;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashSet;

@Entity
@Table(name = "SOCIOS")
@NamedQueries({
        @NamedQuery(
                name = "getAllSocios",
                query = "SELECT s FROM Socio s ORDER BY s.name" // JPQL
        )
})
public class Socio extends Pessoa {
    @NotNull
    private int socioCode;
    @NotNull
    private Date dataAdesao;
    @ManyToMany(mappedBy = "socios")
    private Collection<Modalidade> modalidades;

    public Socio(String username, String password, String email, String name, int socioCode, Date dataAdesao) {
        super(username, password, email, name);
        this.socioCode = socioCode;
        this.dataAdesao = dataAdesao;
        this.modalidades = new LinkedHashSet<Modalidade>();
    }

    public Socio() {
        this.modalidades = new LinkedHashSet<Modalidade>();
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
    public void addModalidades(Modalidade modalidade) {
        this.modalidades.add(modalidade);
    }
}
