package br.com.fiap.checkpoint2.api.controllers;

import br.com.fiap.checkpoint2.api.dtos.PedidoDTO;
import br.com.fiap.checkpoint2.api.models.Pedido;
import br.com.fiap.checkpoint2.api.services.PedidoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static br.com.fiap.checkpoint2.api.utils.ConstantsUtils.V1_PEDIDOS;
import static br.com.fiap.checkpoint2.api.utils.ConstantsUtils.V1_PRODUTOS;

@Slf4j
@RestController
@RequestMapping(value = V1_PEDIDOS)
@RequiredArgsConstructor
public class PedidoController {

    private final PedidoService service;

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> getById(@PathVariable Long id) {
        log.info("GET | Iniciado | {} | id: {}", V1_PEDIDOS, id);
        Pedido pedidoFinded = this.service.getById(id);
        log.info("GET | Finalizado | {} | id: {}", V1_PEDIDOS, id);
        return ResponseEntity.ok(pedidoFinded);
    }

    @GetMapping
    public ResponseEntity<List<Pedido>> getAll() {
        log.info("GET | Iniciado | {}", V1_PEDIDOS);
        List<Pedido> pedidosFinded = this.service.getAll();
        log.info("GET | Finalizado | {}", V1_PEDIDOS);
        return ResponseEntity.ok(pedidosFinded);
    }

    @PostMapping("/save")
    public ResponseEntity<Pedido> save(@RequestBody @Valid PedidoDTO resource) {
        log.info("POST | Iniciado | {} | /save | {}", V1_PEDIDOS, resource);
        this.service.save(resource);
        log.info("POST | Finalizado | {} | /save | {}", V1_PEDIDOS, resource);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<Pedido> edit(@RequestBody @Valid PedidoDTO resource, @PathVariable Long id) {
        log.info("PUT | Iniciado | {} | /edit/{} | {}", V1_PEDIDOS, id, resource);
        this.service.put(resource, id);
        log.info("PUT | Finalizado | {} | /edit/{} | {}", V1_PEDIDOS, id, resource);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Pedido> delete(@PathVariable Long id) {
        log.info("DELETE | Iniciado | {} | /delete/{}", V1_PEDIDOS, id);
        this.service.delete(id);
        log.info("DELETE | Finalizado | {} | /delete/{}", V1_PEDIDOS, id);
        return ResponseEntity.noContent().build();
    }

}
