package exercicio_03;

public class Aluno {
	String name;
	double A;
	double B;
	double C;
	
	public double grade() {
		return A + B + C;
	}
	
	public double missingPoint() {
		if (grade() < 60.0) {
			return 60.0 - grade();
		}
		else {
			return 0.0;
		}
	}
}
