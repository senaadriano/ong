package entities;


public class Gato extends Animal {

	private String cor;
	private Boolean vacinado;
	private Boolean castrado;
	private String habilidade;

	
	public Gato() {
		super();
	}
	public Gato(Integer id, String nome,  Double idade, Double peso, String genero) {
		super(id, nome,  idade, peso, genero);
	}
	public Gato(Integer id, String nome,  Double idade, Double peso, String genero, String cor,
			Boolean vacinado, Boolean castrado, String habilidade) {
		super(id, nome,  idade, peso, genero);
		this.cor = cor;
		this.vacinado = vacinado;
		this.castrado = castrado;
		this.habilidade = habilidade;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Boolean getVacinado() {
		return vacinado;
	}
	public void setVacinado(Boolean vacinado) {
		this.vacinado = vacinado;
	}
	public Boolean getCastrado() {
		return castrado;
	}
	public void setCastrado(Boolean castrado) {
		this.castrado = castrado;
	}
	public String getHabilidade() {
		return habilidade;
	}
	public void setHabilidade(String habilidade) {
		this.habilidade = habilidade;
	}
	@Override
	public String toString() {
		return "Gato cor: " + cor + ", vacinado: " + vacinado + ", castrado: " + castrado + ", habilidade: " + habilidade;
	}

}
