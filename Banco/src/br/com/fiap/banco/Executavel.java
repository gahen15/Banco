package br.com.fiap.banco;

import java.util.Scanner;

public class Executavel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta C01 = new Conta("Gahen", "539.021.268-17", 1);
        Conta C02 = new Conta("Vitu", "123456789", 2);
        
        int escolha;

        do {
            System.out.println("Escolha a op��o: \n|1| Sacar \n|2| Depositar \n|3| Verificar Saldo\n|4| Transferir\n|5| Obter CPF\n|0| Sair\n");
            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Digite o valor que deseja sacar: ");
                    double valorSaque = sc.nextDouble();
                    
                    if (C01.sacar(valorSaque)) {
                        C01.saldo -= valorSaque;
                        System.out.println("Saldo antes do Saque: R$ " + (C01.saldo + valorSaque));
                        System.out.println("Saldo ap�s Saque: R$ " + C01.saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                        System.out.println("Saldo: R$ " + C01.saldo);
                    }
                    break;
                case 2:
                    System.out.println("Digite a quantidade que deseja depositar: ");
                    double valorDeposito = sc.nextDouble();
                    C01.depositar(valorDeposito);
                    
                    System.out.println("Saldo antes do dep�sito: R$ " + (C01.saldo - valorDeposito));
                    System.out.println("Saldo ap�s dep�sito: R$ " + C01.saldo);
                    break;
                case 3:
                    System.out.println("Seu saldo atual �: R$ " + C01.consultaSaldo());
                    break;
                case 4:
                    System.out.println("Digite qual valor voc� deseja transferir: ");
                    double valorTransf = sc.nextDouble();
                    C01.trasferir(valorTransf, C02);
                    System.out.println("Seu saldo atual: R$ " + C01.saldo);
                    break;
                case 5:
                    System.out.println("O CPF da conta �: " + C01.getCpf()); // Obtendo o CPF
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Op��o inv�lida!");
                    break;
            }
        } while (escolha != 0); // O loop continua at� que a op��o 0 seja escolhida.

        sc.close();
    }
}
