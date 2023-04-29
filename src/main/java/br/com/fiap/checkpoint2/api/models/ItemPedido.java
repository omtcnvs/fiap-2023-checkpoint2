package br.com.fiap.checkpoint2.api.models;

import jakarta.persistence.*;
import lombok.*;
import org.apache.commons.lang3.builder.ToStringBuilder;

import static org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString;

@Entity
@Table(name = "itens_pedidos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(of = "id")
public class ItemPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "sequencia")
    private Long sequencia;

    @Column(name = "numero_pedido")
    private Long numeroPedido;

    @Column(name = "codigo_produto")
    private String codigoProduto;

    @Column(name = "quantidade")
    private Integer quantidade;

    @Column(name = "valor_total")
    private Double valorTotal;

    @Override
    public String toString() {
        return reflectionToString(this);
    }
}
