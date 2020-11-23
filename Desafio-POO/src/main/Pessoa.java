package main;

public class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	private String rg; 
	private String dataNacimento;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
<<<<<<< HEAD
	public String getEndereco() {
=======
	public String getEnderecao() {
>>>>>>> 8e967a88d30b5a83d5f8f8bc67e7563919af0da9
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getDataNacimento() {
		return dataNacimento;
	}
	public void setDataNacimento(String dataNacimento) {
		this.dataNacimento = dataNacimento;
	}
	
	
	
	public Pessoa(String nome, String endereco, String telefone, String rg, String dataNacimento) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.rg = rg;
		this.dataNacimento = dataNacimento;
	}
	
	
	
}
