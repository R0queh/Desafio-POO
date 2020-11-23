package main;

public class Pessoa {
	private String nome;
	private String endereço;
	private String telefone;
	private String rg; 
	private String dataNacimento;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
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
	
	
	
	public Pessoa(String nome, String endereço, String telefone, String rg, String dataNacimento) {
		super();
		this.nome = nome;
		this.endereço = endereço;
		this.telefone = telefone;
		this.rg = rg;
		this.dataNacimento = dataNacimento;
	}
	
	
	
}
