package exercicio_04;

import java.util.Locale;
import java.util.Scanner;

public class Exec04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("What is the dollar price? ");
		double priceDollar = sc.nextDouble();
		System.out.printf("How many dollars will be bought? ");
		double dollars = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.converter(priceDollar, dollars));
		
		sc.close();
		
	}

}
