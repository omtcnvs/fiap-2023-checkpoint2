package br.com.fiap.checkpoint2.api.controllers;

import br.com.fiap.checkpoint2.api.dtos.ClienteDTO;
import br.com.fiap.checkpoint2.api.dtos.ItemPedidoDTO;
import br.com.fiap.checkpoint2.api.models.Cliente;
import br.com.fiap.checkpoint2.api.models.ItemPedido;
import br.com.fiap.checkpoint2.api.services.ItemPedidoService;
import br.com.fiap.checkpoint2.api.utils.ConstantsUtils;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static br.com.fiap.checkpoint2.api.utils.ConstantsUtils.V1_CLIENTES;
import static br.com.fiap.checkpoint2.api.utils.ConstantsUtils.V1_ITENS_PEDIDOS;

@Slf4j
@RestController
@RequestMapping(value = V1_ITENS_PEDIDOS)
@RequiredArgsConstructor
public class ItemPedidoController {

    private final ItemPedidoService service;

    @GetMapping("/{id}")
    public ResponseEntity<ItemPedido> getById(@PathVariable Long id) {
        log.info("GET | Iniciado | {} | id: {}", V1_ITENS_PEDIDOS, id);
        ItemPedido itemPedidoFinded = this.service.getById(id);
        log.info("GET | Finalizado | {} | id: {}", V1_ITENS_PEDIDOS, id);
        return ResponseEntity.ok(itemPedidoFinded);
    }

    @GetMapping
    public ResponseEntity<List<ItemPedido>> getAll() {
        log.info("GET | Iniciado | {}", V1_ITENS_PEDIDOS);
        List<ItemPedido> ItensPedidosFinded = this.service.getAll();
        log.info("GET | Finalizado | {}", V1_ITENS_PEDIDOS);
        return ResponseEntity.ok(ItensPedidosFinded);
    }

    @PostMapping("/save")
    public ResponseEntity<ItemPedido> save(@RequestBody @Valid ItemPedidoDTO resource) {
        log.info("POST | Iniciado | {} | /save | {}", V1_ITENS_PEDIDOS, resource);
        this.service.save(resource);
        log.info("POST | Finalizado | {} | /save | {}", V1_ITENS_PEDIDOS, resource);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<ItemPedido> edit(@RequestBody @Valid ItemPedidoDTO resource, @PathVariable Long id) {
        log.info("PUT | Iniciado | {} | /edit/{} | {}", V1_ITENS_PEDIDOS, id, resource);
        this.service.put(resource, id);
        log.info("PUT | Finalizado | {} | /edit/{} | {}", V1_ITENS_PEDIDOS, id, resource);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ItemPedido> delete(@PathVariable Long id) {
        log.info("DELETE | Iniciado | {} | /delete/{}", V1_ITENS_PEDIDOS, id);
        this.service.delete(id);
        log.info("DELETE | Finalizado | {} | /delete/{}", V1_ITENS_PEDIDOS, id);
        return ResponseEntity.noContent().build();
    }

}
