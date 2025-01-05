
package com.github.willyancaetano.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {

    @Test
    void validarCenarioDeExcecaoNaTransferencia() {
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("456548", 100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        // exceção esperada no cenario de teste com o valor -20
        Assertions.assertThrows(IllegalArgumentException.class, () -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, -20));

        // cenario de teste sem exceção com o valor 20
        Assertions.assertDoesNotThrow(() -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, 20));
    }
}
