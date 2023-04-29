package br.com.fiap.checkpoint2.api.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

import java.util.Date;

@Builder
public record PedidoDTO(

        @NotNull(message = "Numero do pedido deve ser informado.")
        Long numeroPedido,
        String codigoCliente,
        Date dataPedido

) {
}
