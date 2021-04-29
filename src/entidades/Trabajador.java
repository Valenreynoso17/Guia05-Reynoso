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
	
	// Constructor
	public Trabajador(String nombreApellido, String email, Oficio oficio, Double costoPorHora, Double porcentajeComision) {
		super();
		this.nombreApellido = nombreApellido;
		this.email = email;
		this.oficio = oficio;
		this.costoPorHora = costoPorHora;
	}
	
	// Métodos
	public void agregarTrabajo(Trabajo t) throws OficioNoCoincideException, AgendaOcupadaException{
		
		if(!t.mismoOficio(this.oficio)) throw new OficioNoCoincideException();
			
		for(Trabajo unTrabajo : this.listaTrabajos) {
			
			if(unTrabajo.mismaFecha(t)) throw new AgendaOcupadaException();
			
		}
			
		this.listaTrabajos.add(t);
	
	}
	
	// Metodo que permite dar por finalizado un trabajo
	public void finalizarTrabajo(Trabajo t) {
		this.listaTrabajos.remove(t);
		t.finalizar();
	}
}
