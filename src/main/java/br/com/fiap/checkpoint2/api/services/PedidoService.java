package br.com.fiap.checkpoint2.api.services;

import br.com.fiap.checkpoint2.api.assemblers.PedidoMapper;
import br.com.fiap.checkpoint2.api.dtos.PedidoDTO;
import br.com.fiap.checkpoint2.api.models.Pedido;
import br.com.fiap.checkpoint2.api.repositories.PedidoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static br.com.fiap.checkpoint2.api.utils.ValidationUtils.validateIfProdutoExists;

@Service
@RequiredArgsConstructor
public class PedidoService {

    private final PedidoRepository repository;

    private final PedidoMapper mapper;

    public Pedido getById(Long id) {
        validateIfProdutoExists(this.repository.findById(id).isEmpty());
        return this.repository.getReferenceById(id);
    }

    public List<Pedido> getAll() {
        return this.repository.findAll();
    }

    public void save(PedidoDTO resource) {
        Pedido model = mapper.toModel(resource);
        this.repository.save(model);
    }

    public void put(PedidoDTO resource, Long id) {
        validateIfProdutoExists(this.repository.findById(id).isEmpty());
        Pedido model = mapper.toModel(resource);
        model.setId(id);
        this.repository.save(model);
    }

    public void delete(Long id) {
        validateIfProdutoExists(this.repository.findById(id).isEmpty());
        Pedido modelToDelete = this.repository.getReferenceById(id);
        this.repository.delete(modelToDelete);
    }

}
