package br.com.fiap.checkpoint2.api.services;

import br.com.fiap.checkpoint2.api.assemblers.ProdutoMapper;
import br.com.fiap.checkpoint2.api.models.Produto;
import br.com.fiap.checkpoint2.api.repositories.ProdutoRepository;
import br.com.fiap.checkpoint2.api.resources.ProdutoResource;
import br.com.fiap.checkpoint2.api.utils.ValidationUtils;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static br.com.fiap.checkpoint2.api.utils.MessagesConstants.PRODUTO_NOT_FOUND;
import static br.com.fiap.checkpoint2.api.utils.ValidationUtils.validateIfProdutoExists;

@Service
@RequiredArgsConstructor
public class ProdutoService {

    private final ProdutoRepository repository;

    private final ProdutoMapper mapper;

    public Produto getById(Long id) {
        validateIfProdutoExists(this.repository.findById(id).isEmpty());
        return this.repository.getReferenceById(id);
    }

    public List<Produto> getAll() {
        return this.repository.findAll();
    }

    public void save(ProdutoDTO resource) {
        Produto model = mapper.toModel(resource);
        this.repository.save(model);
    }

    public void put(ProdutoResource resource, Long id) {
        validateIfProdutoExists(this.repository.findById(id).isEmpty());
        Produto model = mapper.toModel(resource);
        model.setId(id);
        this.repository.save(model);
    }

    public void delete(Long id) {
        validateIfProdutoExists(this.repository.findById(id).isEmpty());
        Produto modelToDelete = this.repository.getReferenceById(id);
        this.repository.delete(modelToDelete);
    }

}
