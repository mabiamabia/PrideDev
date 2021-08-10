package dominio;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import util.Validador;

public class ClientTest extends Validador {
	
	@Test
	void deveSerPossivelCriarClientePassandoValores {
		Cliente dadosCliente = new Cliente("Ana", "123456789");
		
		Assertions.assertTrue(dadosCliente.getNome().equals("Ana"));
		Assertions.assertTrue(dadosCliente.getNome().equals("Ana"));
	}

}
