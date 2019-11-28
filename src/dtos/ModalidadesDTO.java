package dtos;



import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedHashSet;

public class ModalidadesDTO implements Serializable {

    private int codModalidade;
    private String nome;
    private Collection<TreinadorDTO> treinadores;
    private Collection<AtletaDTO> atletas;
    private Collection<EscalaoDTO> escaloes;
    private Collection<SocioDTO> socios;
    private String dayWeek;
    private double startTime;
    private int duration;

    public ModalidadesDTO(int codModalidade, String nome, String dayWeek, double startTime, int duration) {
        this.codModalidade = codModalidade;
        this.nome = nome;
        this.dayWeek = dayWeek;
        this.startTime = startTime;
        this.duration = duration;
        this.treinadores = new LinkedHashSet<TreinadorDTO>();
        this.atletas = new LinkedHashSet<AtletaDTO>();
        this.escaloes = new LinkedHashSet<EscalaoDTO>();
        this.socios = new LinkedHashSet<SocioDTO>();
    }

    public ModalidadesDTO() {
        this.treinadores = new LinkedHashSet<TreinadorDTO>();
        this.atletas = new LinkedHashSet<AtletaDTO>();
        this.escaloes = new LinkedHashSet<EscalaoDTO>();
        this.socios = new LinkedHashSet<SocioDTO>();
    }

    public ModalidadesDTO(int codModalidade, String nome, LinkedHashSet<TreinadorDTO> treinadores, LinkedHashSet<AtletaDTO> atletas, LinkedHashSet<EscalaoDTO> escaloes, LinkedHashSet<SocioDTO> socios, String dayWeek, double startTime, int duration) {
        this.codModalidade = codModalidade;
        this.nome = nome;
        this.treinadores = treinadores;
        this.atletas = atletas;
        this.escaloes = escaloes;
        this.socios = socios;
        this.dayWeek = dayWeek;
        this.startTime = startTime;
        this.duration = duration;
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

    public Collection<TreinadorDTO> getTreinadores() {
        return treinadores;
    }

    public void setTreinadores(Collection<TreinadorDTO> treinadores) {
        this.treinadores = treinadores;
    }

    public Collection<AtletaDTO> getAtletas() {
        return atletas;
    }

    public void setAtletas(Collection<AtletaDTO> atletas) {
        this.atletas = atletas;
    }

    public Collection<EscalaoDTO> getEscaloes() {
        return escaloes;
    }

    public void setEscaloes(Collection<EscalaoDTO> escaloes) {
        this.escaloes = escaloes;
    }

    public Collection<SocioDTO> getSocios() {
        return socios;
    }

    public void setSocios(Collection<SocioDTO> socios) {
        this.socios = socios;
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
