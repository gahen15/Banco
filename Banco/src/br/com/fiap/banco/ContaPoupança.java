package br.com.fiap.banco;

public class ContaPoupança extends Conta {

	public ContaPoupança(Cliente cliente, String numeroConta) {
		super(cliente, numeroConta);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

	@Override
	public void ConsultaSaldo() {
		System.out.printf("O saldo na sua conta atual é: R$ %.2f%n", this.saldo);
		System.out.println("Número da Conta: " + numeroConta);
		System.out.println("Nome do cliente: " + cliente.getNomeCliente());
		System.out.println("Data de nascimento: " + cliente.getDataNasc());

	}
}
