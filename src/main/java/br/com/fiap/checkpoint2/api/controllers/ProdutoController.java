package br.com.fiap.checkpoint2.api.controllers;

import br.com.fiap.checkpoint2.api.models.Produto;
import br.com.fiap.checkpoint2.api.resources.ProdutoResource;
import br.com.fiap.checkpoint2.api.services.ProdutoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static br.com.fiap.checkpoint2.api.utils.ConstantsUtils.V1_PRODUTOS;

@Slf4j
@RestController
@RequestMapping(V1_PRODUTOS)
@RequiredArgsConstructor
public class ProdutoController {

    private final ProdutoService service;

    @GetMapping("/{id}")
    public ResponseEntity<Produto> getById(@PathVariable Long id) {
        log.info("GET | Iniciado | {} | id: {}", V1_PRODUTOS, id);
        Produto produtoFinded = this.service.getById(id);
        log.info("GET | Finalizado | {} | id: {}", V1_PRODUTOS, id);
        return ResponseEntity.ok(produtoFinded);
    }

    @GetMapping
    public ResponseEntity<List<Produto>> getAll() {
        log.info("GET | Iniciado | {}", V1_PRODUTOS);
        List<Produto> produtosFinded = this.service.getAll();
        log.info("GET | Finalizado | {}", V1_PRODUTOS);
        return ResponseEntity.ok(produtosFinded);
    }

    @PostMapping("/save")
    public ResponseEntity<Produto> save(@RequestBody @Valid ProdutoResource resource) {
        log.info("POST | Iniciado | {} | /save | {}", V1_PRODUTOS, resource);
        this.service.save(resource);
        log.info("POST | Finalizado | {} | /save | {}", V1_PRODUTOS, resource);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<Produto> edit(@RequestBody @Valid ProdutoResource resource, @PathVariable Long id) {
        log.info("PUT | Iniciado | {} | /edit/{} | {}", V1_PRODUTOS, id, resource);
        this.service.put(resource, id);
        log.info("PUT | Finalizado | {} | /edit/{} | {}", V1_PRODUTOS, id, resource);
        return ResponseEntity.ok().build();
    }



}
