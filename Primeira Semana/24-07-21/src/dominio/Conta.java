package dominio;

public class Conta {

	public String numeroAgencia;
	public String numeroConta;
	public Correntista correntista;
	public String chavePix;
	public float saldo;
	public String nomeBanco = "BancoPrideDev";
	public String tipoDeConta;
	public float valorPadraoSaque = 50;
	public float chequeEspecial = 10;

	public Conta() {
	}

	public Conta(String numeroAgencia, String NumeroConta, float saldo) {
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	public void saqueAmanda(float x) {
		System.out.println("Saldo = R$" + this.saldo);
		if (this.saldo > x) {
			this.saldo -= x;
		} else {
			if (this.saldo + chequeEspecial > x) {
				this.saldo -= x;
				System.out.println("Saldo está negativo");
				System.out.println("Saldo = R$" + this.saldo);
			} else {
				System.out.println("Saldo está insuficiente");
				System.out.println("Saldo = R$" + this.saldo);
			}
		}
	}

	public void saqueErick(float valorSaque) {
		System.out.println("Saldo Anterior: R$" + this.saldo);
		if (valorSaque <= this.saldo) {
			this.saldo -= valorSaque;
		} else {
			System.out.println("Saldo insuficiente para saque");
			if (valorSaque <= (this.chequeEspecial + this.saldo)) {
				System.out.println("Saque realizado no Cheque Especial");
				System.out.println("Cheque Especial Anterior: R$" + this.chequeEspecial);
				valorSaque -= this.saldo;
				this.saldo = 0;
				this.chequeEspecial -= valorSaque;
				System.out.println("Você utilizou R$" + valorSaque + " do Cheque Especial\n"
						+ "Cheque Especial Atual: R$" + this.chequeEspecial);
			} else {
				System.out.println("Não foi possível realizar saque com Cheque Especial");
			}
		}

		System.out.println("Saldo Atual: R$" + this.saldo);
	}

}
