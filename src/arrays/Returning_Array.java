package arrays;

public class Returning_Array {

	public static void main(String[] args) {
		String[] marcaAuto = ReturnArray();
		for(int i = 0;i<=marcaAuto.length-1;i++){
			System.out.println("Impresión de todos los valores de un Array ==> " + marcaAuto[i]);
			}
		}

	//Este método devuelve un Array de tipo String
	public static String[] ReturnArray() {
		String [] aArray = {"BMW","AUDI","TOYOTA","SUZUKI","HONDA"};  
		  return aArray;
		}
	}