package tomaDecisiones;

public class IfThenElseIf_Statement {

	public static void main(String[] args) {
		int edad = 10;

		if (edad >= 18) {
			System.out.println("Es mayor de edad");
		} else if (edad <= 17 && edad >= 11) {
			System.out.println("Es un adolecente");
		} else {
			System.out.println("Es un niño");
		}
	}
}