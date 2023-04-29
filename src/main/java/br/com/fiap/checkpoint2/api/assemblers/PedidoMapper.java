package br.com.fiap.checkpoint2.api.assemblers;

import br.com.fiap.checkpoint2.api.models.Pedido;
import br.com.fiap.checkpoint2.api.dtos.PedidoDTO;
import org.springframework.stereotype.Component;

import static br.com.fiap.checkpoint2.api.utils.MessagesConstants.METHOD_NOT_IMPLEMENTED;

@Component
public class PedidoMapper implements AssemblerMapper<PedidoDTO, Pedido> {
    @Override
    public PedidoDTO toResource(Pedido pedido) {
        throw new UnsupportedOperationException(METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public Pedido toModel(PedidoDTO pedidoResource) {
        return Pedido.builder()
                .numeroPedido(pedidoResource.numeroPedido())
                .codigoCliente(pedidoResource.codigoCliente())
                .dataPedido(pedidoResource.dataPedido())
                .build();
    }
}
