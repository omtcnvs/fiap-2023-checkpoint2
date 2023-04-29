package br.com.fiap.checkpoint2.api.repositories;

import br.com.fiap.checkpoint2.api.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
