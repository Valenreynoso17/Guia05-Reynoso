package entidades;

import java.time.LocalDate;
import java.time.Period;
import java.util.Optional;

import interfaz.Contratable;

public class Alquiler implements Contratable{

	// Atributos
	private LocalDate diaDeInicio;
	private LocalDate diaDeFin;
	private Optional<LocalDate> diaDevolucion;
	private Herramienta Herramienta;
	
	// Constructor
	public Alquiler(LocalDate diaDeInicio, LocalDate diaDeFin, Herramienta herramienta) {
		super();
		this.diaDeInicio = diaDeInicio;
		this.diaDeFin = diaDeFin;
		this.Herramienta = herramienta;
	}

	@Override
	public Double costo() {
		
		Double resultado = 0.0;		
		Period diasEntre = Period.between(diaDeInicio, diaDevolucion.orElse(LocalDate.now())).plusDays(1);
		
		resultado = this.Herramienta.getCostoPorDia() * diasEntre.getDays();
		
		return resultado;
	}
	
	public Boolean enMora() {
		
		Boolean resultado = false;
		
		if(diaDevolucion.orElse(LocalDate.now()).isAfter(diaDeFin)) {
			resultado = true;
		}
		
		return resultado;
	}
}
