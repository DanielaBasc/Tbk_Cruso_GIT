package operadores;

public class Logical_Operators {

	public static void main(String[] args) {
		boolean Output_1 = true;
		boolean Output_2 = false;										
		System.out.println("Compruebe si ambas variables booleanas son verdaderas : " + (Output_1 && Output_2));
		System.out.println("Compruebe si incluso una de las variables booleanas es verdadera : " + (Output_1 || Output_2));
		System.out.println("Cambiar el estado de Output_1 a falso : " + (!Output_1));

	}

}