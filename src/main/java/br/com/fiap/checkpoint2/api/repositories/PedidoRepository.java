package br.com.fiap.checkpoint2.api.repositories;

import br.com.fiap.checkpoint2.api.models.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
