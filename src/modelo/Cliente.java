package modelo;

public class Cliente extends Pessoa {

	private String email;
	private int codigo;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String toString() {
		return "Nome: " + this.getNome() + "\nCPF: " + this.getCPF() + "\nData de nascimento: " + this.getDataNasc()
				+ "\nE-mail: " + this.getEmail() + "\nCódigo: " + this.getCodigo();
	}

}
