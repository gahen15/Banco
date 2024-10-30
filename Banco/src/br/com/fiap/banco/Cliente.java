package br.com.fiap.banco;

public class Cliente {
public String nomeCliente, cpf;

public Cliente(String nomeCliente, String cpf) {

	this.nomeCliente = nomeCliente;
	this.cpf = cpf;
}



public String getNomeCliente() {
	return nomeCliente;
}

public String getCpf() {
	return cpf;
}


}
