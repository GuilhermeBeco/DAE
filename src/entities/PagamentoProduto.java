package entities;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.util.Collection;
import java.util.LinkedHashSet;

@Entity
@Table(name = "PAGAMENTO_PRODUTOS")
@NamedQueries({
        @NamedQuery(
                name = "getAllPagamentos",
                query = "SELECT p FROM Pagamento_Produto p ORDER BY p.id" // JPQL
        )
})
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class PagamentoProduto {
    @Id
    private int id;
    @Id
    private int idProduto;
    @Id
    private int idPessoa;
    @NotNull
    private String estado;
    @NotNull
    private float precoFinal;

    //todo PDF_RECIBO
    // preciso de dar setup a datas
}
