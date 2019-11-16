package exercicio_05;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Cliente cli;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double depositValue = sc.nextDouble();
			cli = new Cliente(number, holder, depositValue);
		} else {
			cli = new Cliente(number, holder);
		}
								
		System.out.println();
		System.out.println("Account data:");
		System.out.println(cli);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		cli.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(cli);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		cli.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(cli);
		
		sc.close();
	}

}
