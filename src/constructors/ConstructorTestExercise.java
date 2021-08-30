package constructors;

public class ConstructorTestExercise {
	
	public static void main(String[] args) {
		//Utilice la palabra clave Car para declarar la variable Car Class
		Car Toyota = new Car();;
 
		Toyota.iDoors = 4;
		Toyota.iHighestSpeed = 200;
		Toyota.iTyres = 4;
		Toyota.sColor = "Black";
		Toyota.sTransmission = "Manual";
		Toyota.bLeftHandDrive = true;
 
		//Uso del método de clase de coche
		Toyota.DisplayCharacterstics();
 
	}
}
