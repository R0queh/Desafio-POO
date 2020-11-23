package main;

public class Vendedor extends Pessoa {
	private int valorVendas;
	private int comissao;
		
	public Vendedor(String nome, String endereco, String telefone, String rg, String dataNacimento, int valorVendas,
			int comissao) {
		super(nome, endereco, telefone, rg, dataNacimento);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}
	public int getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(int valorVendas) {
		this.valorVendas = valorVendas;
	}
	public int getComissao() {
		return comissao;
	}
	public void setComissao(int comissao) {
		this.comissao = comissao;
	}
	
	
	
	}
	

