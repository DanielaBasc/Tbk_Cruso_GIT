package operadores;

public class Arithmetic_Operators {
	//Operadores aritm�ticos
	
	public static void main(String[] args) {
		
		int a, b = 10, c = 5;
		
		a = b + c;
		System.out.println("Valor de 'a' despu�s de '+' La operaci�n aritm�tica es " + a);
		
		a = b - c;
		System.out.println("Valor de 'a' despu�s de '-' La operaci�n aritm�tica es " + a);
		
		a = b * c;
		System.out.println("Valor de 'a' despu�s de '*' La operaci�n aritm�tica es " + a);
		
		a = b / c;
		System.out.println("Valor de 'a' despu�s de '/' La operaci�n aritm�tica es " + a);
		
		a = b % c;
		System.out.println("Valor de 'a' despu�s de '%' La operaci�n aritm�tica es " + a);
		
		b++;
		System.out.println("Valor de 'b' despu�s de '++' La operaci�n aritm�tica es " + b);
		
		c--;
		System.out.println("Valor de 'c' despu�s de '--' La operaci�n aritm�tica es " + c);
	}

}