package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Data;

public class Account {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);
		
		Data account;
		
		
		System.out.println("--- CONTA ---");

		System.out.print("\nNome do correntista: ");

		String name = sc.nextLine();

		System.out.print("Numero da conta: ");

		int number = sc.nextInt();

		account = new Data(number, name);

		
		int option = 0;
        while (option != 4) {
            System.out.println("\n--- MENU DE OPÇÕES ---");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Ver dados da conta");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("\nDigite o valor do depósito: R$");
                    double Deposit_value = sc.nextDouble();
                    account.deposit(Deposit_value);
                    System.out.println("Depósito realizado com sucesso!");
                    System.out.println("\nDados da conta atualizados");
                    System.out.println(account);
                    break;

                case 2:
                	System.out.println("\nO saque possui uma taxa de R$5");
                    System.out.print("Digite o valor do saque: R$");
                    double Withdraw_value = sc.nextDouble();
                    if (account.withdraw(Withdraw_value)) {
                        System.out.println("Saque realizado com sucesso!");
                        System.out.println("Saque realizado com sucesso!");
                    }
                    else {
                        System.out.println("Saldo insuficiente! Operação cancelada.");
                    }
                    System.out.println("\nDados da conta atualizados");
                    System.out.println(account);
                    break;

                case 3:
                    System.out.println("\n--- DADOS DA CONTA ---");
                    System.out.println(account);
                    break;
                    
                case 4:
                    System.out.println("\nObrigado por utilizar nosso sistema!");
                    break;

                default:
                    System.out.println("\nOpção inválida. Por favor, tente novamente.");
                    break;
            }
            
        }
        
        sc.close();
    }
}