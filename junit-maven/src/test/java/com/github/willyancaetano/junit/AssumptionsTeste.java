

package com.github.willyancaetano.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {

    @Test
    void validarAlgoSomenteNoUsuarioWillyan() {
        Assumptions.assumeFalse("root".equals(System.getenv("USER"))); // Nao executar se o usuario for root
        Assertions.assertEquals(10, 5 + 5);
    }
}
