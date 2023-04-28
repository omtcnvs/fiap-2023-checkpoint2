package br.com.fiap.checkpoint2.api.repositories;

import br.com.fiap.checkpoint2.api.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
