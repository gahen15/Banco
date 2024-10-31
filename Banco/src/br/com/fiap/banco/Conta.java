package br.com.fiap.banco;

import java.util.Scanner;

public abstract class Conta {
    protected Scanner sc = new Scanner(System.in);
    protected Cliente cliente; // Presumindo que Cliente é uma classe definida
    protected String numeroConta;
    protected double saldo;

    public Conta(Cliente cliente, String numeroConta) {
    	this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = 0.0; // Saldo inicial
    }
    
    public abstract void ConsultaSaldo();

    public void Deposito() {
        System.out.println("Quanto você deseja depositar?");
        double valor = sc.nextDouble();
        
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido! Deve ser maior que zero.");
            return; // Retorna para evitar depósito inválido
        }

        this.saldo += valor;
        System.out.printf("\nDepósito realizado com sucesso!\nSaldo antes do depósito: R$ %.2f%n", this.saldo - valor);
        System.out.printf("Valor do depósito: R$ %.2f%n", valor);
        System.out.printf("Saldo atual: R$ %.2f%n", this.saldo);
    }

    public void Saque() {
        System.out.println("Quanto você deseja sacar?");
        double valor = sc.nextDouble();
        
        if (valor <= 0) {
            System.out.println("Valor de saque inválido! Deve ser maior que zero.");
            return; // Retorna para evitar saque inválido
        }

        if (this.saldo < valor) {
            System.out.println("Impossível realizar operação: Saldo Insuficiente.");
        } else {
            this.saldo -= valor;
            System.out.printf("Operação realizada com sucesso!\nSaldo antes do saque: R$ %.2f%n", this.saldo + valor);
            System.out.printf("Valor do saque: R$ %.2f%n", valor);
            System.out.printf("Saldo atual: R$ %.2f%n", this.saldo);
        }
    }

    public void Transferencia(Conta contaDestino) {
        System.out.println("Quanto você deseja transferir?");
        double valor = sc.nextDouble();

        if (valor <= 0) {
            System.out.println("Valor de transferência inválido! Deve ser maior que zero.");
            return; // Retorna para evitar transferência inválida
        }

        if (this.saldo < valor) {
            System.out.println("Impossível realizar operação: Saldo Insuficiente.");
        } else {
            this.saldo -= valor;
            contaDestino.saldo += valor; // Adiciona o valor à conta de destino
            System.out.printf("Transferência realizada com sucesso!\nValor da transferência: R$ %.2f%n", valor);
            System.out.printf("Saldo atual: R$ %.2f%n", this.saldo);
            System.out.printf("Saldo na conta destino: R$ %.2f%n", contaDestino.saldo);
        }
    }
}
 
