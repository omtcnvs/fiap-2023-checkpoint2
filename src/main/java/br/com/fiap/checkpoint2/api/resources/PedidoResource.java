package br.com.fiap.checkpoint2.api.resources;

import lombok.Builder;

import java.util.Date;

@Builder
public record PedidoResource(

        Long numeroPedido,
        String codigoCliente,
        Date dataPedido

) {
}
