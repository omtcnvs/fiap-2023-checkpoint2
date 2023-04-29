package br.com.fiap.checkpoint2.api.assemblers;

import br.com.fiap.checkpoint2.api.models.Cliente;
import br.com.fiap.checkpoint2.api.resources.ClienteResource;
import br.com.fiap.checkpoint2.api.utils.MessagesConstants;
import ch.qos.logback.core.net.server.Client;
import org.springframework.stereotype.Component;

import static br.com.fiap.checkpoint2.api.utils.MessagesConstants.METHOD_NOT_IMPLEMENTED;

@Component
public class ClienteMapper implements AssemblerMapper<ClienteResource, Cliente> {
    @Override
    public ClienteResource toResource(Cliente cliente) {
        throw new UnsupportedOperationException(METHOD_NOT_IMPLEMENTED);
    }
    
    @Override
    public Cliente toModel(ClienteResource clienteResource) {
        return Cliente.builder()
                .codigo(clienteResource.codigo())
                .nome(clienteResource.nome())
                .inscricaoFederal(clienteResource.incricaoFederal())
                .cep(clienteResource.cep())
                .build();
    }
}
