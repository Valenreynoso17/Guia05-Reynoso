package excepciones;

public class OficioNoCoincideException extends Exception{
	public String getMessage() {
		return "El oficio del trabajador no coincide con el oficio del servicio";
	}
}
