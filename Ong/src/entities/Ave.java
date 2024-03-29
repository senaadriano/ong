package entities;


public class Ave extends Animal {

	private String raca;
	private String tamanho;
	private String plumagem;
	private String alimentacao;
	
	public Ave() {}
	public Ave(Integer id, String nome, Double idade, Double peso, String genero, String raca,
			String tamanho, String plumagem, String alimentacao) {
		super(id, nome, idade, peso, genero);
		this.raca = raca;
		this.tamanho = tamanho;
		this.plumagem = plumagem;
		this.alimentacao = alimentacao;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getPlumagem() {
		return plumagem;
	}
	public void setPlumagem(String plumagem) {
		this.plumagem = plumagem;
	}
	public String getAlimentacao() {
		return alimentacao;
	}
	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}
	@Override
	public String toString() {
		return "Ave raca: " + raca + ", tamanho: " + tamanho + ", plumagem: " + plumagem + ", alimentacao: " + alimentacao;
	}
}
