package entidades;

import java.time.LocalDate;

import interfaz.Contratable;

public class Trabajo implements Contratable{
	
	// Atributos
	private Trabajador trabajador; 
	private Servicio servicio;
	protected Boolean esUrgente;
	private String direccion;
	private LocalDate fechaRealizacion;
	
	// Metodos
	
	@Override
	public Double costo() {
		
		Double resultado = 0.0;
		resultado += servicio.costo();
		
		if(this.esUrgente) {
			resultado *= 1.50;
		}
		return resultado;
	}
}
