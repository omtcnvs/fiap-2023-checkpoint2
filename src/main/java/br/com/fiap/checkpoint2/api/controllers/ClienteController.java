package br.com.fiap.checkpoint2.api.controllers;

import br.com.fiap.checkpoint2.api.models.Cliente;
import br.com.fiap.checkpoint2.api.resources.ClienteResource;
import br.com.fiap.checkpoint2.api.services.ClienteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static br.com.fiap.checkpoint2.api.utils.ConstantsUtils.V1_CLIENTES;
import static br.com.fiap.checkpoint2.api.utils.ConstantsUtils.V1_PRODUTOS;

@Slf4j
@RestController
@RequestMapping(value = V1_CLIENTES)
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService service;

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getById(@PathVariable Long id) {
        log.info("GET | Iniciado | {} | id: {}", V1_CLIENTES, id);
        Cliente clienteFinded = this.service.getById(id);
        log.info("GET | Finalizado | {} | id: {}", V1_CLIENTES, id);
        return ResponseEntity.ok(clienteFinded);
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> getAll() {
        log.info("GET | Iniciado | {}", V1_CLIENTES);
        List<Cliente> clientesFinded = this.service.getAll();
        log.info("GET | Finalizado | {}", V1_CLIENTES);
        return ResponseEntity.ok(clientesFinded);
    }

    @PostMapping("/save")
    public ResponseEntity<Cliente> save(@RequestBody @Valid ClienteDTO resource) {
        log.info("POST | Iniciado | {} | /save | {}", V1_CLIENTES, resource);
        this.service.save(resource);
        log.info("POST | Finalizado | {} | /save | {}", V1_CLIENTES, resource);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<Cliente> edit(@RequestBody @Valid ClienteDTO resource, @PathVariable Long id) {
        log.info("PUT | Iniciado | {} | /edit/{} | {}", V1_CLIENTES, id, resource);
        this.service.put(resource, id);
        log.info("PUT | Finalizado | {} | /edit/{} | {}", V1_CLIENTES, id, resource);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Cliente> delete(@PathVariable Long id) {
        log.info("DELETE | Iniciado | {} | /delete/{}", V1_CLIENTES, id);
        this.service.delete(id);
        log.info("DELETE | Finalizado | {} | /delete/{}", V1_CLIENTES, id);
        return ResponseEntity.noContent().build();
    }

}
