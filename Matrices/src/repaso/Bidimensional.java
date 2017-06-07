package repaso;

public class Bidimensional {

	public static void main(String[] args) {
		
		int[][] Ejemplo = new int [2][3];
		
		System.out.println(Ejemplo.length);
		
		/**
		 * Este bloque de cadigo es para llenar el arreglo
		 */
		
		for (int i = 0; i < 2; i++) {
		
			for (int j = 0; j < 3; j++) {
				
				Ejemplo[i][j] = (i * j);
				
			}
			
		}
		System.out.println("Se imprime el areglo de manera tradicional");
		
		/**
		* Este bloque de codigo es para imprimir el arreglo
		*/
		for (int i = 0; i < 2; i++) {
			
			for (int j = 0; j < 3; j++) { 
		
				System.out.println("Este es el valor contenido en la posicion " + i + " --- " + j);
			}
		}

		System.out.println("Se imprime el arreglo utilizar 'FOREACH'");
		//FOREACH
				for (int[] x : Ejemplo){
					
					for (int y : x) {
						
						System.out.println(y);
					}
		
	}
}
}