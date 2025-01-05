

package com.github.willyancaetano.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.condition.JRE.JAVA_11;
import static org.junit.jupiter.api.condition.JRE.JAVA_17;

public class CondicionaisTeste {

    @Test
    //@EnabledIfEnvironmentVariable(named = "USER", matches = "willyan")  // Executar apenas se o usuario for willyan (ambiente de desenvolvimento)
   // @EnabledForJreRange(min = JAVA_11, max = JAVA_17) // Executar apenas se o JRE estiver entre 11 e 17
    //@DisabledIfEnvironmentVariable(named = "USER", matches = "root")
    //@EnabledOnOs(OS.WINDOWS)
    void validarAlgoSomenteNoUsuarioWillyan() {

        Assertions.assertEquals(10, 5 + 5);
    }
}
