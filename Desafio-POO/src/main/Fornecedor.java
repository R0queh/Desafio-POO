package main;

public class Fornecedor extends Pessoa {

	private float valorCredito ;
	private float valorDivida;
	
	public float getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(float valorCredito) {
		this.valorCredito = valorCredito;
	}
	public float getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(float valorDivida) {
		this.valorDivida = valorDivida;
	}
	public Fornecedor(String nome, String endereco, String telefone, String rg, String dataNacimento,
			float valorCredito, float valorDivida) {
		super(nome, endereco, telefone, rg, dataNacimento);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	public float obterSaldo() {
		float total = valorCredito - valorDivida ;
		
		return total;
	}
	
	
	
	
	


}

		