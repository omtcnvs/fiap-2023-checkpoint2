package br.com.fiap.checkpoint2.api.services;

import br.com.fiap.checkpoint2.api.models.Produto;
import br.com.fiap.checkpoint2.api.repositories.ProdutoRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static br.com.fiap.checkpoint2.api.utils.MessagesConstants.PRODUTO_NOT_FOUND;

@Service
@RequiredArgsConstructor
public class ProdutoService {

    private final ProdutoRepository repository;

    public Produto getById(Long id) {
        if (this.repository.findById(id).isEmpty()) {
            throw new EntityNotFoundException(PRODUTO_NOT_FOUND);
        }
        return this.repository.findById(id).get();
    }

    public List<Produto> getAll() {
        return this.repository.findAll();
    }
}
