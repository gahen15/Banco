package br.com.fiap.banco;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	protected String nomeCliente, cpf;
	protected Date dataNasc = new Date();

	


	
	public Cliente(String nomeCliente, String cpf, String dataNasc) {

		this.nomeCliente = nomeCliente;
		this.cpf = cpf;
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

		try {
			this.dataNasc = formato.parse(dataNasc);
		} catch (ParseException e) {
			System.err.println("Formato de data inválido");
			e.printStackTrace();
		}

	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public String getCpf() {
		return cpf;
	}

	public Date getDataNasc() {
		return dataNasc;
	}
	
}
