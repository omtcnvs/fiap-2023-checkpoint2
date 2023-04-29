package br.com.fiap.checkpoint2.api.services;

import br.com.fiap.checkpoint2.api.assemblers.ItemPedidoMapper;
import br.com.fiap.checkpoint2.api.dtos.ItemPedidoDTO;
import br.com.fiap.checkpoint2.api.models.ItemPedido;
import br.com.fiap.checkpoint2.api.repositories.ItemPedidoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static br.com.fiap.checkpoint2.api.utils.ValidationUtils.validateIfProdutoExists;

@Service
@RequiredArgsConstructor
public class ItemPedidoService {

    private final ItemPedidoRepository repository;

    private final ItemPedidoMapper mapper;

    public ItemPedido getById(Long id) {
        validateIfProdutoExists(this.repository.findById(id).isEmpty());
        return this.repository.getReferenceById(id);
    }

    public List<ItemPedido> getAll() {
        return this.repository.findAll();
    }

    public void save(ItemPedidoDTO resource) {
        ItemPedido model = mapper.toModel(resource);
        this.repository.save(model);
    }

    public void put(ItemPedidoDTO resource, Long id) {
        validateIfProdutoExists(this.repository.findById(id).isEmpty());
        ItemPedido model = mapper.toModel(resource);
        model.setId(id);
        this.repository.save(model);
    }


    public void delete(Long id) {
        validateIfProdutoExists(this.repository.findById(id).isEmpty());
        ItemPedido modelToDelete = this.repository.getReferenceById(id);
        this.repository.delete(modelToDelete);
    }

}
