package arrays;

public class Passing_Array {


	//Esto acepta Array como un argumento de tipo String
	public static void Print_Array(String array[]){

		for(int i = 0;i<=array.length-1;i++){
			System.out.println("Impresi�n de todos los valores de una matriz ==> " + array[i]);
		}
	}
	
	public static void main(String[] args) {
		//Declaraci�n de una matriz
		String [] marcaAuto = {"BMW","AUDI","TOYOTA","SUZUKI","HONDA"};
		
		// Llamar al m�todo de array de impresi�n y pasar un array como un par�metro
		Print_Array(marcaAuto);
	}

}