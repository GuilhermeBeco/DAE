package entities;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.util.Collection;
import java.util.LinkedHashSet;

@Entity
@Table(name = "PRODUTOS")
@NamedQueries({
        @NamedQuery(
                name = "getAllProdutos",
                query = "SELECT p FROM Produto p ORDER BY p.name" // JPQL
        )
})
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Produto {
    @Id
    private int id;
    @NotNull
    private String tipo;
    @NotNull
    private String descricao;
    @NotNull
    private float valorBase;

    public Produto() {
    }

    public Produto(int id, String tipo, String descricao, int valorBase) {
        this.id = id;
        this.tipo = tipo;
        this.descricao = descricao;
        this.valorBase = valorBase;
    }

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

    public void setValorBase(int valorBase) {
        this.valorBase = valorBase;
    }
}
