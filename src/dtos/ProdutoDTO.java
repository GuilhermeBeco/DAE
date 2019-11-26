package dtos;

import java.io.Serializable;

public class ProdutoDTO implements Serializable {
    private int id;
    private String tipo;
    private String descricao;
    private float valorBase;

    public ProdutoDTO(int id, String tipo, String descricao, float valorBase) {
        this.id = id;
        this.tipo = tipo;
        this.descricao = descricao;
        this.valorBase = valorBase;
    }

    public ProdutoDTO() { }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValorBase() {
        return valorBase;
    }

    public void setValorBase(float valorBase) {
        this.valorBase = valorBase;
    }
}
