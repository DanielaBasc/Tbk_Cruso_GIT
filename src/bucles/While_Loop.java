package bucles;

public class While_Loop {
	public static void main(String[] args) {
		 int Count = 0;
		 // Esto Imprimirá -- 5,10,15,20,25
		 while(Count < 25){
			 //Count = Count + 5;
			 System.out.println("Count is ==> "+ Count);
			 }

		 int CountOnce = 25;
		 System.out.println("<==== Next Count ====>");
		 // Esto no imprime el conteo ni siquiera una vez
		 while(CountOnce < 25){
			 CountOnce = CountOnce + 5;
			 System.out.println("Count is ==> "+ CountOnce);
			 }
		}
}
