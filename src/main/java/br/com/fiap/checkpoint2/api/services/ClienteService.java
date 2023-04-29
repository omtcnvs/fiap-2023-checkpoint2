package br.com.fiap.checkpoint2.api.services;

import br.com.fiap.checkpoint2.api.repositories.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository repository;

}
