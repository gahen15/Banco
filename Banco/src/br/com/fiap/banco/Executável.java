package br.com.fiap.banco;

import java.util.Scanner;

public class Executável {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta C01 = new Conta();
		Conta C02 = new Conta();

		C01.nomeCliente = "Gahen";
		C01.cpf = "539.021.268-17";
		C01.numeroConta = 1;
		C01.saldo = 250.24;
		C02.nomeCliente = "Vitu";
		C02.cpf = "539.021.268-18";
		C02.numeroConta = 2;
		C02.saldo = 300;

		System.out.println("Escolha a opção: \n|1| Sacar \n|2| Depositar \n|3| Verificar Saldo\n|4| Transferir\n\n");
		int escolha = sc.nextInt();
		switch (escolha) {
		case 1:
			System.out.println("Digite o valor que deseja sacar: ");
			double valorSaque = sc.nextDouble();
			
			if (C01.sacar(valorSaque)) {
				C01.saldo -= valorSaque;
				System.out.println("Saldo antes Saque: R$ " + (C01.saldo + valorSaque));
				System.out.println("Saldo após Saque: R$ " + C01.saldo);
				
			}
			else if (!C01.sacar(valorSaque)) {
				System.out.println("Saldo insuficiente.");
				System.out.println("Saldo: R$ "+ C01.saldo);
			}
			break;
		case 2:
			System.out.println("Digite a quantidade que deseja depositar: ");
			double valorDeposito = sc.nextDouble();
			C01.depositar(valorDeposito);

			System.out.println("Saldo antes do depósito: R$ " + (C01.saldo - valorDeposito));
			System.out.println("Saldo após depósito: R$ " + C01.saldo);
			break;
		case 3:
			System.out.println("Seu saldo atual é: R$ " + C01.consultaSaldo());
			break;

		case 4:
			System.out.println("Digite qual valor você deseja transferir: ");
			double valorTransf = sc.nextDouble();
			C01.trasferir(valorTransf, C02);
			System.out.println("Seu saldo atual: " + C01.saldo);
			
			
			break;

		default:
			
			System.out.println("Opção inválida!");
			break;
		}

		
		
		sc.close();
	}

}
