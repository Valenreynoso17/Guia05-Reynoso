package entidades;

import java.util.ArrayList;

import enumerados.Oficio;
import excepciones.AgendaOcupadaException;
import excepciones.OficioNoCoincideException;

public class Trabajador {
	
	// Atributos 
	ArrayList<Trabajo> listaTrabajos = new ArrayList<>();
	private String nombreApellido;
	private String email;
	private Oficio oficio;
	private Double costoPorHora; // TODO: checkear que para calcular el costo debo tener LocalDateTime
	private Double porcentajeComision;
	
	// Constructor
	public Trabajador(String nombreApellido, String email, Oficio oficio, Double costoPorHora, Double porcentajeComision) {
		super();
		this.nombreApellido = nombreApellido;
		this.email = email;
		this.oficio = oficio;
		this.costoPorHora = costoPorHora;
		this.porcentajeComision = porcentajeComision;
	}
	
	// Métodos
	public void agregarTrabajo(Trabajo t) throws OficioNoCoincideException, AgendaOcupadaException{
		// No me gusto nada esto, pero no se me ocurrió otra solución
		if(t.mismoOficio(this.oficio)) {
			
			for(Trabajo unTrabajo : this.listaTrabajos) {
				if(unTrabajo.mismaFecha(t)) {
					throw new AgendaOcupadaException();
					/* Entiendo que como al trabajo lo pensé con fecha de inicio y fecha de fin
					 * se pierde el sentido de la función ya que no pueden iniciar el mismo dia 
					 * pero luego pueden realizarse mas de dos trabajos en un mismo dia.
					 */
				}
			}
			
			this.listaTrabajos.add(t);
			
		} else {
			throw new OficioNoCoincideException();
		}
	}
	
	public void finalizarTrabajo(Trabajo t) {
		this.listaTrabajos.remove(t);
		t.finalizar();
	}
}
