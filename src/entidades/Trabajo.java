package entidades;

import java.time.LocalDate;
import java.util.Optional;

import enumerados.Oficio;
import interfaz.Contratable;

public class Trabajo implements Contratable{

	// Atributos
	private Servicio servicio;
	private Boolean esUrgente;
	private String direccion;
	private LocalDate fechaInicio;
	private Optional<LocalDate> fechaFin = Optional.empty();
	
	// Constructor
	public Trabajo(Servicio servicio, Boolean esUrgente, String direccion, LocalDate fechaInicio) {
		super();
		this.servicio = servicio;
		this.esUrgente = esUrgente;
		this.direccion = direccion;
		this.fechaInicio = fechaInicio;
	}
	
	// Metodos	
	@Override
	public Double costo() {
		
		Double resultado = 0.0;
		resultado += servicio.costo();
		
		if(this.esUrgente) resultado *= 1.50;
		
		return resultado;
	}

	@Override
	public Boolean finalizado() {
		return fechaFin.isPresent();
	}

	@Override
	public void finalizar() {
		fechaFin = Optional.of(LocalDate.now());
	}
	
	public Boolean mismoOficio(Oficio o) {
		return o == servicio.getOficio();
	}
	
	public Boolean mismaFecha(Trabajo t) {
		return this.getFechaInicio().equals(t.getFechaInicio());
	}
	
	private LocalDate getFechaInicio() {
		return fechaInicio;
	}
}
