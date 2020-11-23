package main;

public class Operario extends Pessoa {
	
	private int valorProducao;
	private int comissao;
		
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
	public Operario(String nome, String endereco, String telefone, String rg, String dataNascimento, int valorProducao,
			int comissao) {
		super(nome, endereco, telefone, rg, dataNascimento);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}	

}
