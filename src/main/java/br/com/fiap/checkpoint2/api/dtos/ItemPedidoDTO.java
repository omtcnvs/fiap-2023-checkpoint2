package br.com.fiap.checkpoint2.api.dtos;

import jakarta.validation.constraints.NotNull;

public record ItemPedidoDTO(
        @NotNull(message = "Sequencia do pedido deve ser informada.")
        Long sequencia,
        Long numeroPedido,
        String codigoProduto,
        Integer quantidade,
        Double valorTotal
) {
}
