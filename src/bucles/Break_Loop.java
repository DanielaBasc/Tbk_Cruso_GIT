package bucles;

public class Break_Loop {
	public static void main(String[] args) {

		// Esto imprimirá - 0,1,2,3,4,5,6,7
		for(int Count = 0;Count<=10;Count++){
			if(Count==8){
				break; // salir del bucle
				}
			System.out.println("Count is ==> " + Count );
			}
		System.out.println("Has salido del bucle");
		}
}
