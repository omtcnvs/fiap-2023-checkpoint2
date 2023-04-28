package br.com.fiap.checkpoint2.api.controllers;

import br.com.fiap.checkpoint2.api.services.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static br.com.fiap.checkpoint2.api.utils.ConstantsUtils.V1_PRODUTOS;

@RestController
@RequestMapping(V1_PRODUTOS)
@RequiredArgsConstructor
public class ProdutoController {

    private final ProdutoService service;

}
