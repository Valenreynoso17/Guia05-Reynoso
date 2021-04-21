package entidades;

import java.time.LocalDateTime;

import interfaz.Contratable;

public class Trabajo implements Contratable{
	
	// Atributos
	private Trabajador trabajador; // TODO: no se que tan necesario es esto si ya el trabajador tienen una lista con los trabajos asignados
	private Servicio servicio;
	protected boolean esUrgente;
	private String direccion;
	private LocalDateTime fechaRealizacion;
	
	// Metodos
	
	@Override
	public Double costo() {
		
		Double resultado = 0.0;
		
		
		return resultado;
	}
}
