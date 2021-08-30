package operadores;

public class Assignment_Operators {
	// Asignación normal
	static int velocidad = 80; // variable de velocidad obtiene el valor 80
	static int distancia = 20; // distancia obtiene el valor 20
	static int tiempo = 10; // variable de tiempo obtiene el valor 10
	static String nombre = "ToolsQA"; // variable de nombre obtiene el valor ToolsQA
	static boolean isGood = true; // La variable isGood obtiene el valor true

	public static void main(String[] args) {

		System.out.println("El valor almacenado en la variable de velocidad es : " + velocidad);
		System.out.println("El valor almacenado en la variable de distancia es : " + distancia);
		System.out.println("El valor almacenado en la variable de tiempo es : " + tiempo);
		System.out.println("El valor almacenado en la variable name es : " + nombre);
		System.out.println("El valor almacenado en la variable isGood es: " + isGood);

		velocidad = 100; // El valor anterior de la velocidad se sobrescribe con 100
		tiempo = distancia; // El valor anterior del tiempo se sobrescribe con el valor de la distancia
		nombre = "ForumsQA"; // El valor anterior del nombre se sobrescribe con ForumsQA
		isGood = false;// El valor anterior de isGood se sobreescribe con false
		System.out.println("El valor almacenado en la variable de velocidad es : " + velocidad);
		System.out.println("El valor almacenado en la variable de tiempo es : " + tiempo);
		System.out.println("El valor almacenado en la variable name es : " + nombre);
		System.out.println("El valor almacenado en la variable isGood es : " + isGood);

		// Múltiples asignaciones
		velocidad = distancia = 0; // 100 (20 = 0) 
		System.out.println("El valor almacenado en la variable de velocidad es : " + velocidad);

		/*
		// Asignaciones ilegales - Errores de tiempo de compilación
		speed = "ToolsQA"; // La cadena no se puede asignar a entero
		name = 10; // No se puede asignar entero a String
		isGood = "ToolsQa" // String no se puede asignar a Boolean
	    */
		
		}
	}