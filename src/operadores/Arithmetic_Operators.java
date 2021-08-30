package operadores;

public class Arithmetic_Operators {
	//Operadores aritméticos
	
	public static void main(String[] args) {
		
		int a, b = 10, c = 5;
		
		a = b + c;
		System.out.println("Valor de 'a' después de '+' La operación aritmética es " + a);
		
		a = b - c;
		System.out.println("Valor de 'a' después de '-' La operación aritmética es " + a);
		
		a = b * c;
		System.out.println("Valor de 'a' después de '*' La operación aritmética es " + a);
		
		a = b / c;
		System.out.println("Valor de 'a' después de '/' La operación aritmética es " + a);
		
		a = b % c;
		System.out.println("Valor de 'a' después de '%' La operación aritmética es " + a);
		
		b++;
		System.out.println("Valor de 'b' después de '++' La operación aritmética es " + b);
		
		c--;
		System.out.println("Valor de 'c' después de '--' La operación aritmética es " + c);
	}

}