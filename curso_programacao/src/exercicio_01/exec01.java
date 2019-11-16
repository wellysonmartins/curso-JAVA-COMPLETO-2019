package exercicio_01;

import java.util.Locale;
import java.util.Scanner;

public class exec01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height:");
		Reactangle r = new Reactangle();
		r.width = sc.nextDouble();
		r.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", r.area());
		System.out.printf("PERIMETER = %.2f%n", r.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", r.diagonal());
		
		sc.close();
	}

}
