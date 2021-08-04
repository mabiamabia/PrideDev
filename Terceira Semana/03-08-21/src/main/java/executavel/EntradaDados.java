package executavel;

import dominio.Cliente;
import dominio.Conta;
import dominio.ContaCorrente;

public class EntradaDados {

	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente();
		conta.depositar(100);
		
		try {
			Cliente cliente = new Cliente();
		} catch (Exception e) {
			
		}
	}
}
