package br.com.fiap.checkpoint2.api.controllers;

import br.com.fiap.checkpoint2.api.services.ItemPedidoService;
import br.com.fiap.checkpoint2.api.utils.ConstantsUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static br.com.fiap.checkpoint2.api.utils.ConstantsUtils.V1_ITENS_PEDIDOS;

@RestController
@RequestMapping(value = V1_ITENS_PEDIDOS)
@RequiredArgsConstructor
public class ItemPedidoController {

    private final ItemPedidoService service;

}
