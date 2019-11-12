package entities;

public class Produto {
	
	private String nome;
	private String descricao;
	private double preco;
	private int id;
	

	public Produto(String nome, String descricao, double preco, int id) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
	
}
