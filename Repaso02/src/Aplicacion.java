import controlador.Logica;
import modelo.Persona;
import util.Ayudante;
import vista.Pantallas;

public class Aplicacion {

	public static void main(String[] args) {
		
		Pantallas vistas = new Pantallas();
		
		Logica controlador = new Logica(); 

		int cantidadPersonas = Ayudante.conversor(vistas.ingresarValor("ingrese cantidad de personas"));
		
		controlador.inicializarPersonas(cantidadPersonas);

		for (int i = 0; i < cantidadPersonas; i++) {
			
			controlador.IngresarPersona(i, vistas.ingresarValor("Coloque su nombre"));
		}
		
		for (int x = 0; x < cantidadPersonas; x++) {
			
			Persona ekis = controlador.traerPersona(x);
			
			vistas.mostrarMensaje(ekis.getNombre());
		}
	}
}
