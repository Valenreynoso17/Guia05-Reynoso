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
	private Double costoPorHora;
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
		// TODO: no me gusto nada esto
		if(t.mismoOficio(this.oficio)) {
			
			for(Trabajo unTrabajo : this.listaTrabajos) {
				if(unTrabajo.getFechaInicio().equals(t.getFechaInicio())) {
					throw new AgendaOcupadaException();
					/* Entiendo que como al trabajo lo pensé con fecha de inicio y fecha de fin
					 * se pierde el sentido de la función
					 */
				}
			}
			
			this.listaTrabajos.add(t);
			
		} else {
			throw new OficioNoCoincideException();
		}
	}
}
