package br.com.fiap.checkpoint2.api.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;

import java.util.Date;

@Builder
public record ProdutoDTO(
        @NotBlank(message = "Codigo deve ser informado.")
        String codigo,
        Double preco,
        String nome,
        Date dataValidade,
        Date dataGarantia,
        Boolean emEstoque
) {
}
