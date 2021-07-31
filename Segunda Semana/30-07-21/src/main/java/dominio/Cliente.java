package dominio;

public class Cliente {

	protected String cpfCorrentista;
	protected String nomeCorrentista;
	
	public Cliente(String cpfCorrentista, String nomeCorrentista) {
		super();
		this.cpfCorrentista = cpfCorrentista;
		this.nomeCorrentista = nomeCorrentista;
	}

	public String getCpfCorrentista() {
		return cpfCorrentista;
	}

	public void setCpfCorrentista(String cpfCorrentista) {
		this.cpfCorrentista = cpfCorrentista;
	}

	public String getNomeCorrentista() {
		return nomeCorrentista;
	}

	public void setNomeCorrentista(String nomeCorrentista) {
		this.nomeCorrentista = nomeCorrentista;
	}
	
	
}
