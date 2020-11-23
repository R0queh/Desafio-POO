package main;

public class empregado extends Pessoa{
	public int codigoSetor;
	public double salarioBase;
	public double imposto;
	
	
	
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(int imposto) {
		this.imposto = imposto;
	}
	
	public empregado(String nome, String endereço, String telefone, String rg, String dataNacimento, int codigoSetor,
			double salarioBase, int imposto) {
		super(nome, endereço, telefone, rg, dataNacimento);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	
	public double getCalcularSalario() {
		double impostoCobrado = salarioBase * (imposto/100);
		double salario = salarioBase-impostoCobrado;
		return salario;
	}
	
}
