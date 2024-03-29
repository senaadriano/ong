package entities;


public class Cachorro extends Animal {

	private String raca;
	private String cor;
	private Boolean vacinado;
	private Boolean castrado;

	public Cachorro() {}
	public Cachorro(Integer id, String nome,  Double idade, Double peso, String genero) {
		super(id, nome, idade, peso, genero);
	}
	public Cachorro(Integer id, String nome,  Double idade, Double peso, String genero, String raca,
			String cor, Boolean vacinado, Boolean castrado) {
		super(id, nome, idade, peso, genero);
		this.raca = raca;
		this.cor = cor;
		this.vacinado = vacinado;
		this.castrado = castrado;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
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
	@Override
	public String toString() {
		return "Cachorro raca: " + raca + ", cor: " + cor + ", vacinado: " + vacinado + ", castrado: " + castrado;
	}


}
