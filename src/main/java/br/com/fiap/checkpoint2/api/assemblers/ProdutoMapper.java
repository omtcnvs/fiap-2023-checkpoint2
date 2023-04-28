package br.com.fiap.checkpoint2.api.assemblers;

import br.com.fiap.checkpoint2.api.models.Produto;
import br.com.fiap.checkpoint2.api.resources.ProdutoResource;
import org.springframework.stereotype.Component;

@Component
public class ProdutoMapper implements AssemblerMapper<ProdutoResource, Produto> {
    @Override
    public ProdutoResource toResource(Produto produto) {
        throw new UnsupportedOperationException("Método ainda não implementado.");
    }

    @Override
    public Produto toModel(ProdutoResource produtoResource) {
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
