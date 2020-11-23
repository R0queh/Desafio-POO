package main;

public class Administrador extends Pessoa {
  
	private float ajudaDeCusto;

	public float getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(float ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public Administrador(String nome, String endereco, String telefone, String rg, String dataNacimento,
			float ajudaDeCusto) {
		super(nome, endereco, telefone, rg, dataNacimento);
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	
	
}
