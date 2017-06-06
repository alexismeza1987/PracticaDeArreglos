package sobrecarga;

public class Calculadora extends Display{
	
	public int Mostrar (int A){
		return A;
	}
	public int Suma (int A, int B){
		return A + B;
	} 
	public int Suma (int A, int B, int C){
		return A + B + C;
	}
	public double Suma (double A, double B){
		return A + B;
	}
	public double Suma (double A, double B, double C){
		return A + B + C;
	}
	public double Suma (String... params){
		double acumulador = 0;

		try {
			
			for(int i = 0; i < params.length; i++){
			acumulador += Double.parseDouble(params[i]);
		}
		
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("Usted es un tonto");
		}
		
		return acumulador;
	}
	
	public void MostrarResultado (int A){
		pantalla(String.valueOf(A));
	}
	public void MostrarResultado (double A){
		pantalla (String.valueOf(A));
	}
}