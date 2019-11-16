package exercicio_03;

import java.util.Locale;
import java.util.Scanner;

public class exec03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		aluno.name = sc.nextLine();
		aluno.A = sc.nextDouble();
		aluno.B = sc.nextDouble();
		aluno.C = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", aluno.grade());
		if (aluno.grade() > 60.0) {
			System.out.println("PASS");
		}
		else {
			System.out.printf("FAILED%n");
			System.out.printf("MISSING %.2f POINTS", aluno.missingPoint());
		}
		
		sc.close();
	}

}
