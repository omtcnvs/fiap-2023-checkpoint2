package br.com.fiap.checkpoint2.api.assemblers;

import br.com.fiap.checkpoint2.api.dtos.ItemPedidoDTO;
import br.com.fiap.checkpoint2.api.models.ItemPedido;
import br.com.fiap.checkpoint2.api.utils.MessagesConstants;
import org.springframework.stereotype.Component;

import static br.com.fiap.checkpoint2.api.utils.MessagesConstants.METHOD_NOT_IMPLEMENTED;

@Component
public class ItemPedidoMapper implements AssemblerMapper<ItemPedidoDTO, ItemPedido> {
    @Override
    public ItemPedidoDTO toResource(ItemPedido itemPedido) {
        throw new UnsupportedOperationException(METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public ItemPedido toModel(ItemPedidoDTO itemPedidoDTO) {
        return ItemPedido.builder()
                .sequencia(itemPedidoDTO.sequencia())
                .numeroPedido(itemPedidoDTO.numeroPedido())
                .codigoProduto(itemPedidoDTO.codigoProduto())
                .quantidade(itemPedidoDTO.quantidade())
                .valorTotal(itemPedidoDTO.valorTotal())
                .build();
    }
}
