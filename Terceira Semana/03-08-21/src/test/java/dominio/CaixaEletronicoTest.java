package dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaixaEletronicoTest {

	
	@Tests
	
	void deveSerpossivelSacar () {
		CaixaEletronico teste = new CaixaEletronico();
		int[] quantidadeDeNotas = teste.retirar(100);
		Assertions.assertTrue(teste.retirar(100)[0] == 1);
	}
}
