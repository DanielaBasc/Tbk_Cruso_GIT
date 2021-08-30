package arrays;

public class Array {
	
	public static void main(String[] args) {
		String [] marcaAuto = {"BMW","AUDI","TOYOTA","SUZUKI","HONDA"};
 
		// Esto sirve para almacenar el tamaño de la matriz
		int iLength = marcaAuto.length;
		System.out.println("La longitud del array es ==> " + iLength);
 
		// Esto es para acceder al primer elemento de una Array directamente con su posición
		String sBMW = marcaAuto[0];
		System.out.println("El primer valor del array es ==> " + sBMW);
 
		// Esto es para acceder al último elemento de una Array
		String sHonda = marcaAuto[iLength-1];
		System.out.println("El último valor del array es ==> " + sHonda);
 
		// Esto es para imprimir todos los valores de elementos de una matriz
		for(int i = 0;i<=iLength-1;i++){
			System.out.println("El valor almacenado en la posición " +i+ 
					           " en la variable marcaAuto es ==> " + marcaAuto[i]);
		}
	}
}
