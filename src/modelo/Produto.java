package modelo;

public class Produto {

	private int id;
	private String nomeProduto;
	private Double valor;
	private Double peso;
	private String unidadeMedida;
	private String setor;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public String toString() {
		return "Nome: " + this.getNomeProduto() + "\nValor: " + this.getValor() + "\nPeso: "
				+ this.getPeso() + "\nUnidade de medida: " + this.getUnidadeMedida() + "\nSetor: " + this.getSetor();
	}

}
