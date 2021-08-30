package tomaDecisiones;

public class Switch_Statement_int {

	public static void main(String[] args) {
		int nota = 50;

		switch (nota) {
		case 1:
			System.out.println("nos fue pesimo");
			break;
		case 4:
			System.out.println("nos dio justo la nota");
			break;
		case 5:
			System.out.println("bien");
			break;
		case 6:
			System.out.println("muy bien!!");
			break;
		case 7:
			System.out.println("Excelente");
			break;
		default:
			System.out.println("por defecto");
			break;
		}
	}
}