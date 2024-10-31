package br.com.fiap.banco;

public class ContaCorrente extends Conta {

	public double saldoInvesimento;
	
	public ContaCorrente(Cliente cliente, String numeroConta) {
		super(cliente, numeroConta);

	}

	@Override
	public void ConsultaSaldo() {
		System.out.printf("O saldo na sua conta atual é: R$ %.2f%n", this.saldo);
		System.out.println("Número da Conta: " + numeroConta);
		System.out.println("Nome do cliente: " + cliente.getNomeCliente());
		System.out.println("Data de nascimento: " + cliente.getDataNasc());

	}
	
	
	
	public void investir(int tipo, double valor) {

		switch (tipo) {
		case 1:
			valor += (0.01*valor);
			System.out.println("Você receberá R$ " + valor);
			break;
		case 2:
			valor += (0.009*valor);
			System.out.println("Você receberá R$ " + valor);
			break;
		case 3:
			valor += (0.008*valor);
			System.out.println("Você receberá R$ " + valor);
			break;

		default:
			break;
		}
		
		
		
	}

}
