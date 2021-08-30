package arrays;

public class Passing_Array {


	//Esto acepta Array como un argumento de tipo String
	public static void Print_Array(String array[]){

		for(int i = 0;i<=array.length-1;i++){
			System.out.println("Impresión de todos los valores de una matriz ==> " + array[i]);
		}
	}
	
	public static void main(String[] args) {
		//Declaración de una matriz
		String [] marcaAuto = {"BMW","AUDI","TOYOTA","SUZUKI","HONDA"};
		
		// Llamar al método de array de impresión y pasar un array como un parámetro
		Print_Array(marcaAuto);
	}

}