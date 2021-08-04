package util;

public class Validador { 
	
	String cliente[];
	String cpf[] = {"123456789"};

	public static void validaCPF(String cpf) {
		if(cpf.length() != 11) {
			throw new IllegalArgumentException("CPF Invalido");
		}

	}

}
