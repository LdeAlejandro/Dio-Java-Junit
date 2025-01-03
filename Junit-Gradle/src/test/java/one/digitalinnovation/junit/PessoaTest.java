package one.digitalinnovation.junit;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {


     @Test
     void validarCalculoDeIdade(){
          Pessoa pessoa = new Pessoa ("Julia", LocalDate.of(2024, 1, 1));
          Assertions.assertEquals(1, pessoa.getIdade());
     }

}
