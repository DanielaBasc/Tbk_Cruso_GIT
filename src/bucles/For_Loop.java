package bucles;

public class For_Loop {
	public static void main(String[] args) {
		// Esto imprimirá - 0,1,2,3,4,5
		for(int Increment = 0;Increment<=5;Increment++){
			System.out.println("El valor es  ==> " + Increment );
		}

		System.out.println("<==== Mayor a menor ====>");
		//Esto imprimirá - 5,4,3,2,1,0
		for(int Decrement = 5;Decrement>=0;Decrement--){
			System.out.println("El valor es ==> " + Decrement );
		}

		System.out.println("<==== Saltar de 2 en 2 ====>");
		// Esto imprimirá - 0,2,4
		for(int Increment = 0;Increment<=5;Increment+=2){
			System.out.println("Saltarse el uno al otro  ==> " + Increment );
		}
	}
}