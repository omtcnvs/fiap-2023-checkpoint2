package br.com.fiap.checkpoint2.api.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;

@Builder
public record ClienteDTO(

        @NotBlank(message = "Codigo do cliente deve ser informado.")
        String codigo,
        String nome,
        String incricaoFederal,
        String cep

) {
}
