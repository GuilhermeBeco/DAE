package entities;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.util.Collection;
import java.util.LinkedHashSet;

@Entity
@Table(name = "MODALIDADES")

@NamedQueries({
        @NamedQuery(
                name = "getAllPessoas",
                query = "SELECT m FROM Modalidade m ORDER BY m.name" // JPQL
        )
})
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Modalidade {
    @Id
    private int codModalidade;
    @NotNull
    private String nome;
    @ManyToMany
    @JoinTable(name = "MODALIDADES_TREINADORES",
            joinColumns = @JoinColumn(name = "MODALIDADE_CODE", referencedColumnName = "codModalidade"),
            inverseJoinColumns = @JoinColumn(name = "USERNAME_TREINADOR", referencedColumnName =
                    "username"))
    private Collection<Treinador> treinadores;

    @ManyToMany
    @JoinTable(name = "MODALIDADES_ATLETAS",
            joinColumns = @JoinColumn(name = "MODALIDADE_CODE", referencedColumnName = "codModalidade"),
            inverseJoinColumns = @JoinColumn(name = "USERNAME_ATLETA", referencedColumnName =
                    "username"))
    private Collection<Atleta> atletas;

    @ManyToMany
    @JoinTable(name = "MODALIDADES_ESCALOES",
            joinColumns = @JoinColumn(name = "MODALIDADE_CODE", referencedColumnName = "codModalidade"),
            inverseJoinColumns = @JoinColumn(name = "EscalaoId", referencedColumnName =
                    "id"))
    private Collection<Escalao> escaloes;

    @ManyToMany
    @JoinTable(name = "MODALIDADES_SOCIOS",
            joinColumns = @JoinColumn(name = "MODALIDADE_CODE", referencedColumnName = "codModalidade"),
            inverseJoinColumns = @JoinColumn(name = "USERNAME_SOCIO", referencedColumnName =
                    "username"))
    private LinkedHashSet<Socio> socios;

    @NotNull
    private String dayWeek;
    @NotNull
    private double startTime;
    @NotNull
    private int duration;

    public Modalidade(int codModalidade, String nome, LinkedHashSet<Treinador> treinadores, LinkedHashSet<Atleta> atletas, LinkedHashSet<Escalao> escaloes, String dayWeek, double startTime, int duration) {
        this.codModalidade = codModalidade;
        this.nome = nome;
        this.treinadores = treinadores;
        this.atletas = atletas;
        this.escaloes = escaloes;
        this.dayWeek = dayWeek;
        this.startTime = startTime;
        this.duration = duration;
        this.treinadores = new LinkedHashSet<Treinador>();
        this.atletas = new LinkedHashSet<Atleta>();
        this.escaloes = new LinkedHashSet<Escalao>();
        this.socios = new LinkedHashSet<Socio>();
    }

    public Modalidade() {
        this.treinadores = new LinkedHashSet<Treinador>();
        this.atletas = new LinkedHashSet<Atleta>();
        this.escaloes = new LinkedHashSet<Escalao>();
        this.socios = new LinkedHashSet<Socio>();
    }

    public int getCodModalidade() {
        return codModalidade;
    }

    public void setCodModalidade(int codModalidade) {
        this.codModalidade = codModalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Collection<Treinador> getTreinadores() {
        return treinadores;
    }

    public void addTreinadores(Treinador treinador) {
        this.treinadores.add(treinador);
    }

    public Collection<Atleta> getAtletas() {
        return atletas;
    }

    public void addAtletas(Atleta atleta) {
        this.atletas.add(atleta);
    }

    public Collection<Escalao> getEscaloes() {
        return escaloes;
    }

    public void addEscaloes(Escalao escalao) {
        this.escaloes.add(escalao);
    }

    public String getDayWeek() {
        return dayWeek;
    }

    public void setDayWeek(String dayWeek) {
        this.dayWeek = dayWeek;
    }

    public double getStartTime() {
        return startTime;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
