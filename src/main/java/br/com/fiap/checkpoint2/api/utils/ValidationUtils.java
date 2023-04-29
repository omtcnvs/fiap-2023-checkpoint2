package br.com.fiap.checkpoint2.api.utils;

import jakarta.persistence.EntityNotFoundException;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import static br.com.fiap.checkpoint2.api.utils.MessagesConstants.PRODUTO_NOT_FOUND;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ValidationUtils {

    public static void validateIfProdutoExists(Boolean exists) {
        if (exists) {
            return;
        }
        throw new EntityNotFoundException(PRODUTO_NOT_FOUND);
    }

}
