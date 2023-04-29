package br.com.fiap.checkpoint2.api.dtos;

import lombok.Builder;

import java.util.Date;

@Builder
public record PedidoDTO(

        Long numeroPedido,
        String codigoCliente,
        Date dataPedido

) {
}
