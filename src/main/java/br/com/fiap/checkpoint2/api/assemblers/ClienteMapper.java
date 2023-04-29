package br.com.fiap.checkpoint2.api.assemblers;

import br.com.fiap.checkpoint2.api.models.Cliente;
import br.com.fiap.checkpoint2.api.dtos.ClienteDTO;
import org.springframework.stereotype.Component;

import static br.com.fiap.checkpoint2.api.utils.MessagesConstants.METHOD_NOT_IMPLEMENTED;

@Component
public class ClienteMapper implements AssemblerMapper<ClienteDTO, Cliente> {
    @Override
    public ClienteDTO toResource(Cliente cliente) {
        throw new UnsupportedOperationException(METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public Cliente toModel(ClienteDTO clienteResource) {
        return Cliente.builder()
                .codigo(clienteResource.codigo())
                .nome(clienteResource.nome())
                .inscricaoFederal(clienteResource.incricaoFederal())
                .cep(clienteResource.cep())
                .build();
    }
}
