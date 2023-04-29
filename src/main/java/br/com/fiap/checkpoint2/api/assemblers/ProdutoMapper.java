package br.com.fiap.checkpoint2.api.assemblers;

import br.com.fiap.checkpoint2.api.models.Produto;
import br.com.fiap.checkpoint2.api.dtos.ProdutoDTO;
import org.springframework.stereotype.Component;

import static br.com.fiap.checkpoint2.api.utils.MessagesConstants.METHOD_NOT_IMPLEMENTED;

@Component
public class ProdutoMapper implements AssemblerMapper<ProdutoDTO, Produto> {
    @Override
    public ProdutoDTO toResource(Produto produto) {
        throw new UnsupportedOperationException(METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public Produto toModel(ProdutoDTO produtoResource) {
        return Produto.builder()
                .codigo(produtoResource.codigo())
                .nome(produtoResource.nome())
                .dataGarantia(produtoResource.dataGarantia())
                .dataValidade(produtoResource.dataValidade())
                .preco(produtoResource.preco())
                .emEstoque(produtoResource.emEstoque())
                .build();
    }
}
