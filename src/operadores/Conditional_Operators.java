package operadores;

public class Conditional_Operators {

	public static void main(String[] args) {
		int Diez = 10;	
		int Veinte = 20;
		int Treinta = 30;
	    boolean bValue;
	    int iValue;
	    

	    bValue = (Treinta == Diez + Veinte) ? true: false;
	    System.out.println( "El valor booleano de la variable 'bValue' es : " +  bValue ); //true

	    iValue = ((Treinta == Veinte + Diez)) ? 50: 100;
	    System.out.println( "El valor int de la variable iValue es : " + iValue ); //50

	    // Este es un uso de Not Logical Operator
	    iValue = (!(Treinta == Veinte + Diez)) ? 50: 100;
	    System.out.println( "El valor int de la variable iValue es : " + iValue ); //100
	}

}