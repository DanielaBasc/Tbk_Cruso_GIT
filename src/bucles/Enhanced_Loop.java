package bucles;

public class Enhanced_Loop {
	public static void main(String[] args) {
		// Array of String que almacena los días de la semana
    String days[] = { "Mon", "Tue", "Wed", "Thr", "Fri", "Sat", "Sun"};

    // Bucle For Mejorado, esto itera automáticamente en la lista de array
    for (String dayName : days) {
      System.out.println("Days ==> "+ dayName);
    	}

    System.out.println("<==== Normal For Loop ====>");
    //Bucle For Normal 
    for (int i=0; i < days.length; i++) {
        System.out.println("Days ==> "+ days[i]);
    	}
	}
}
