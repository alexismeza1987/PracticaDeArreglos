package sobrecarga;

public class Calcapp {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		calc.MostrarResultado(calc.Suma("20","30","20.50","30.50","49"));
				
		calc.MostrarResultado(calc.Suma(2, 2));

		calc.MostrarResultado(calc.Suma(2, 2, 2));
		
		calc.MostrarResultado(calc.Suma(2.2, 2.3));
		
		calc.MostrarResultado(calc.Suma(2.2, 2.3, 2.4));
		
	}
}