package br.com.fiap.checkpoint2.api.controllers;

import br.com.fiap.checkpoint2.api.services.ClienteService;
import br.com.fiap.checkpoint2.api.utils.ConstantsUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static br.com.fiap.checkpoint2.api.utils.ConstantsUtils.V1_CLIENTES;

@RestController
@RequestMapping(value = V1_CLIENTES)
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService service;

}
