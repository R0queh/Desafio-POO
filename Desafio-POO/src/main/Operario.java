package main;

public class Operario extends Pessoa {
	
	public Operario(String nome, String endereco, String telefone, String rg, String dataNacimento) {
		super(nome, endereco, telefone, rg, dataNacimento);
		// TODO Auto-generated constructor stub
	}
	private int valorProducao;
	private int comissao;
		
	public Operario(String nome, String endereco, String telefone, String rg, String dataNacimento, int valorProducao,
			int comissao) {
		super(nome, endereco, telefone, rg, dataNacimento);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	public int getValorProducao() {
		return valorProducao;
	}
	public void setValorProducao(int valorProducao) {
		this.valorProducao = valorProducao;
	}
	public int getComissao() {
		return comissao;
	}
	public void setComissao(int comissao) {
		this.comissao = comissao;
	}
	
	
	

}
