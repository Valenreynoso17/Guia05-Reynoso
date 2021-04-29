package excepciones;

public class AlquilerNoEntregadoException extends Exception {
	public String getMessage() {
		return "No se ha podido agregar el alquiler con éxito. Devuelva las herramientas que ya posee.";
	}
}
