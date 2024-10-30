package br.com.fiap.banco;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Executavel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando instâncias de Cliente
        Cliente cliente1 = new Cliente("Gahen", "539.021.268-17","11/05/2007");
        Cliente cliente2 = new Cliente("Vitu", "123456789","12/12/1212");

        // Criando contas com os clientes
        Conta C01 = new Conta(cliente1, "1002");
        Conta C02 = new Conta(cliente2, "2217");

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n\nQual operação deseja realizar?\n");
            System.out.println("|1| Verificar saldo da Conta 1 (Gahen)");
            System.out.println("|2| Depositar na Conta 1 (Gahen)");
            System.out.println("|3| Saque na Conta 1 (Gahen)");
            System.out.println("|4| Transferir da Conta 1 (Gahen) para a Conta 2 (Vitu)");
            System.out.println("\n\n|5| Verificar saldo da Conta 2 (Vitu)");
            System.out.println("|6| Depositar na Conta 2 (Vitu)");
            System.out.println("|7| Saque na Conta 2 (Vitu)");
            
            System.out.println("|8| Transferir da Conta 2 (Vitu) para a Conta 1 (Gahen)");
            System.out.println("\n\n|0| Sair");
            System.out.print("\nDigite a opção: ");

            try {
                opcao = sc.nextInt();
                sc.nextLine(); // Limpa o buffer

                switch (opcao) {
                    case 1:
                        C01.ConsultaSaldo();
                        break;
                    case 2:
                        C01.Deposito();
                        break;
                    case 3:
                        C01.Saque();
                        break;
                    case 5:
                        C02.ConsultaSaldo();
                        break;
                    case 6:
                        C02.Deposito();
                        break;
                    case 7:
                        C02.Saque();
                        break;
                    case 4:
                        C01.Transferencia(C02);
                        break;
                    case 8:
                        C02.Transferencia(C01);
                        break;
                    case 0:
                        System.out.println("Tchau! ༼ つ ◕_◕ ༽つ");
                        break;
                    default: 
                        System.out.println("Opção inválida!");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, digite um número.");
                sc.nextLine(); // Limpa o buffer
            }
        }

        sc.close();
    }
}
