package entities;


abstract class Animal {

	private Integer id;
	private String nome;
	private Double idade;
	private Double peso;
	private String genero;

	public Animal() {}
	public Animal(Integer id, String nome, Double idade, Double peso, String genero) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.genero = genero;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getIdade() {
		return idade;
	}
	public void setIdade(Double idade) {
		this.idade = idade;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	@Override
	public String toString() {
		return "Animal [id=" + id + ", nome=" + nome + ", idade=" + idade + ", peso=" + peso
				+ ", genero=" + genero + "]";
	}



}
