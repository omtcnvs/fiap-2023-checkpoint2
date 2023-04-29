package br.com.fiap.checkpoint2.api.services;

import br.com.fiap.checkpoint2.api.assemblers.ClienteMapper;
import br.com.fiap.checkpoint2.api.models.Cliente;
import br.com.fiap.checkpoint2.api.models.Produto;
import br.com.fiap.checkpoint2.api.repositories.ClienteRepository;
import br.com.fiap.checkpoint2.api.resources.ClienteResource;
import br.com.fiap.checkpoint2.api.resources.ProdutoResource;
import br.com.fiap.checkpoint2.api.utils.ValidationUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static br.com.fiap.checkpoint2.api.utils.ValidationUtils.validateIfProdutoExists;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository repository;

    private final ClienteMapper mapper;

    public Cliente getById(Long id) {
        validateIfProdutoExists(this.repository.findById(id).isEmpty());
        return this.repository.getReferenceById(id);
    }

    public List<Cliente> getAll() {
        return this.repository.findAll();
    }

    public void save(ClienteResource resource) {
        Cliente model = mapper.toModel(resource);
        this.repository.save(model);
    }

    public void put(ClienteResource resource, Long id) {
        validateIfProdutoExists(this.repository.findById(id).isEmpty());
        Cliente model = mapper.toModel(resource);
        model.setId(id);
        this.repository.save(model);
    }


    public void delete(Long id) {
        validateIfProdutoExists(this.repository.findById(id).isEmpty());
        Cliente modelToDelete = this.repository.getReferenceById(id);
        this.repository.delete(modelToDelete);
    }
}