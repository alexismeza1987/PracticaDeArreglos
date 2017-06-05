package sobrecarga;

public class Calcapp {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		System.out.println("Suma");
		System.out.println(calc.Suma("20","30","20.50","30.50","49"));
		
	}
	
}
