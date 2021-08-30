package tomaDecisiones;

public class Switch_Statement_string {

	public static void main(String[] args) {
		
		String tiempo = "soleado";

		switch (tiempo) {
		case "nublado":
			System.out.println("me abrigare un poco");
			break;
		case "caluroso":
			System.out.println("usare saldalias y saldre con una botella con agua");
			break;
		case "lloviendo":
			System.out.println("me abrigare bastante y saldre con paraguas");
			break;
		default:
			System.out.println("El tiempo es agradable");
			break;
		}
	}
}