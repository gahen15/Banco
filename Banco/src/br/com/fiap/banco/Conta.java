package br.com.fiap.banco;

public class Conta {

	public String nomeCliente;
	public String cpf;
	public long numeroConta;
	public double saldo;

	public boolean sacar(double valor) {
		boolean validacao;
		if (saldo >= valor) {
			validacao = true;
		} else {
			validacao = false;
		}
		return validacao;
	}

	public void depositar(double quantidade) {
		saldo = saldo + quantidade;

	}

	public double consultaSaldo() {
	return saldo;
	}

	public void trasferir(double valor, Conta conta) {
	
		if (this.sacar(valor)) {
			conta.depositar(valor); 
		} 

	}
}