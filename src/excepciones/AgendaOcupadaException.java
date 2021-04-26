package excepciones;

public class AgendaOcupadaException extends Exception{
	public String getMessage() {
		return "El trabajador ya tiene una tarea asignada para ese dia.";
	}
}
