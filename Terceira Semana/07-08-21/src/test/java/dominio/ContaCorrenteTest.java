package dominio;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ContaCorrenteTest {

	@Test
	void deveSerPossivelSacarUtilizandoChequeEspecial() {
		//preparacao
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.depositar(100);
		
		contaCorrente.sacar(101);
		
		assertTrue(contaCorrente.getSaldo() == -1);
	}
	@Test
	voi
	
}

