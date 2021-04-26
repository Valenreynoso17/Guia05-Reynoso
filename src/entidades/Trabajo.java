package entidades;

import java.time.LocalDate;
import java.util.Optional;

import enumerados.Oficio;
import interfaz.Contratable;

public class Trabajo implements Contratable{

	// Atributos
	private Trabajador trabajador; 
	private Servicio servicio;
	protected Boolean esUrgente;
	private String direccion;
	private LocalDate fechaInicio; // Me parecio m�s correcto que haya una fecha de inicio y una de fin (Aunque me trae unos problemas m�s adelante)
	private Optional<LocalDate> fechaFin = Optional.empty();
	
	// Constructor
	public Trabajo(Trabajador trabajador, Servicio servicio, Boolean esUrgente, String direccion, LocalDate fechaInicio) {
		super();
		this.trabajador = trabajador;
		this.servicio = servicio;
		this.esUrgente = esUrgente;
		this.direccion = direccion;
		this.fechaInicio = fechaInicio;
	}
	
	// Metodos
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	@Override
	public Double costo() {
		
		Double resultado = 0.0;
		resultado += servicio.costo();
		
		if(this.esUrgente) {
			resultado *= 1.50;
		}
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
		return o == this.servicio.getOficio();
	}
}
