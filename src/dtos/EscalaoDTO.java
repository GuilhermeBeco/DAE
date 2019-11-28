package dtos;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedHashSet;

public class EscalaoDTO  implements Serializable {

    private int id;
    private String name;
    private int startAge;
    private int endAge;
    private Collection<ModalidadesDTO> modalidades;

    public EscalaoDTO() {
        this.modalidades= new LinkedHashSet<ModalidadesDTO>();
    }

    public EscalaoDTO(int id, String name, int startAge, int endAge, LinkedHashSet<ModalidadesDTO> modalidades) {
        this.id = id;
        this.name = name;
        this.startAge = startAge;
        this.endAge = endAge;
        this.modalidades= new LinkedHashSet<ModalidadesDTO>();
    }

    public EscalaoDTO(int id, String name, int startAge, int endAge, Collection<ModalidadesDTO> modalidades) {
        this.id = id;
        this.name = name;
        this.startAge = startAge;
        this.endAge = endAge;
        this.modalidades = modalidades;
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

    public Collection<ModalidadesDTO> getModalidades() {
        return modalidades;
    }

    public void setModalidades(Collection<ModalidadesDTO> modalidades) {
        this.modalidades = modalidades;
    }
}
