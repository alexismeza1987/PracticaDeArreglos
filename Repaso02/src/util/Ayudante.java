package util;

public class Ayudante {

public static int conversor (String valor){
	
	int valorConvertido = 0;
	
	try {
		
		valorConvertido =  Integer.parseInt(valor);
		
	} catch (NumberFormatException nb) {
		// TODO: handle exception
		System.out.println(nb.getMessage());
	}
	return valorConvertido;
}
	
}
