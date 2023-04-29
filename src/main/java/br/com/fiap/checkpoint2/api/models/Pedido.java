package br.com.fiap.checkpoint2.api.models;

import jakarta.persistence.*;
import lombok.*;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Date;

import static org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString;

@Entity
@Table(name = "pedidos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(of = "numeroPedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "numero_pedido", nullable = false)
    private Long numeroPedido;

    @Column(name = "codigo_cliente")
    private String codigoCliente;

    @Column(name = "data_pedido")
    private Date dataPedido;

    @Override
    public String toString() {
        return reflectionToString(this);
    }
}
