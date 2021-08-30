package constructors;

public class Car {
	//Variables y campos de miembro de clase
    //Variables privadas
    private String sModel;
    private int iMake;
    private int iGear;
    int iHighestSpeed;
    String sColor;
    boolean bLeftHandDrive;
    String sTransmission;
    int iTyres;
    int iDoors;
 
    // Valores predeterminados establecidos en Constructor
    public Car(){
    	sModel = "Camry";
    	iMake = 2014;
    	iGear = 5;
    }
 
    public void DisplayCharacterstics(){
    	System.out.println("Model of the Car: " +  sModel);
    	System.out.println("Number of gears in the Car: " +  iGear);
    	System.out.println("Max speed of the Car: " +  iHighestSpeed);
    	System.out.println("Color of the Car: " +  sColor);
    	System.out.println("Make of the Car: " +  iMake);
    	System.out.println("Transmission of the Car: " +  sTransmission);
 
    }
}
