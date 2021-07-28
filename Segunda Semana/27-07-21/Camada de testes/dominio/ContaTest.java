package dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContaTest {
	
	@Test
	void deveSerPossivelCriarUmaContaSemParametros() {
		
		Conta novaConta = new Conta ();
		Assertions.assertTrue(novaConta != null);
	}
	
	@Test
	void deveSerPossivelCriarContaComSaldoNumeroAgenciaNumeroConta() {
		Conta conta = new Conta(300,"001","00001");
		Assertions.assertTrue(conta.saldo == 300);
		Assertions.assertTrue(conta.agencia.equal("001"));
		Assertions.assertTrue(conta.numeroConta.equals("00001"));
	}


}
