package main;

public class main {
	public static void main(String[] args) {
		Administrador primo = new Administrador("Marcelo", "Rua belém", "011 98888-7777", "000.000.000-1", "12/05/1900", 8000);
		System.out.println("Administrador:\nNome: "+ primo.getNome()+"\nData de nascimento: "+ primo.getDataNacimento() + "\nEndereço: " + primo.getEndereco()
		+"\nTelefone: " + primo.getTelefone() + "\nRG: " + primo.getRg() + "\nAjuda de custo: " + primo.getAjudaDeCusto());
		
		empregado Bruno = new empregado("Bruno Santos", "Rua antônio", "19 99948-4631\nO pai ta on.", "273287555-1", "28/12/2000", 007, 15000, 12);
		System.out.println("Empregado:\nNome: "+ Bruno.getNome()+"\nData de nascimento: "+ Bruno.getDataNacimento() +"\nEndereço: " + Bruno.getEndereco()
		+"\nTelefone: " + Bruno.getTelefone() + "\nRG: " + Bruno.getRg() + "\nSetor: "+ Bruno.getCodigoSetor() +"\nSalário: " + Bruno.getCalcularSalario());
		
		Fornecedor witer = new Fornecedor("Witer mendonça", "Rua xico santeiro", "19 99514-1083\nDisponivel", "136875646-5", "19/01/91" , 100000, 80000);
		System.out.println("Fornecedor:\nNome: "+ witer.getNome()+"\nData de nascimento: "+ witer.getDataNacimento() +"\nEndereço: " + witer.getEndereco()
		+"\nTelefone: " + witer.getTelefone() + "\nRG: " + witer.getRg() + "\nValor de crédito: "+ witer.getValorCredito()+"\nValor de divida: " + witer.getValorDivida()+
		"\nValor do saldo: " + witer.obterSaldo());
		
		Operario ope = new Operario("Camis", "Rua arthur", "38296060", "12345678-9", "11/10/89", 20, 80);
		System.out.println("Operario:\nNome: "+ ope.getNome()+"\nData de nascimento: "+ ope.getDataNacimento() +"\nEndereço: " + ope.getEndereco()
		+"\nTelefone: " + ope.getTelefone() + "\nRG: " + ope.getRg() + "\nValor de produção: "+ ope.getValorProducao()+"\nComissão: " + ope.getComissao());
		
		Vendedor joca = new Vendedor("joca", "Rua alberto", "198776-6670", "556485478-1", "19/07/1993", 10000, 40);
		System.out.println("Vendedor:\nNome: "+ joca.getNome()+"\nData de nascimento: "+ joca.getDataNacimento() +"\nEndereço: " + joca.getEndereco()
		+"\nTelefone: " + joca.getTelefone() + "\nRG: " + joca.getRg() + "\nValor de vendas: "+ joca.getValorVendas()+"\nComissão: " + joca.getComissao());
	}
}
