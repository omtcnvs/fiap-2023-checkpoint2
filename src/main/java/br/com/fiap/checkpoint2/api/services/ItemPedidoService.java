package br.com.fiap.checkpoint2.api.services;

import br.com.fiap.checkpoint2.api.assemblers.ItemPedidoMapper;
import br.com.fiap.checkpoint2.api.repositories.ItemPedidoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemPedidoService {

    private final ItemPedidoRepository repository;

    private final ItemPedidoMapper mapper;

}
