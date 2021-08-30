package bucles;

public class DoWhile_Loop {
	public static void main(String[] args) {
		 int Count = 0;
		 // Esto imprimirá - 5,10,15,20,25
		 do{
			 Count = Count + 5;
			 System.out.println("La cuenta es ==> "+ Count);
		 }while(Count < 25);

		 int CountOnce = 25;
		 System.out.println("<==== Next Count ====>");
		 
		// Esto solo se imprimirá una vez 
		 do{
			 CountOnce = CountOnce + 5;			 
			 System.out.println("La cuenta es ==> "+ CountOnce);
		 }while(CountOnce < 25);
	}
}
