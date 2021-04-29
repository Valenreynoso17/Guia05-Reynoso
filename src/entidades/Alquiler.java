package entidades;

import java.time.LocalDate;
import java.time.Period;
import java.util.Optional;

import interfaz.Contratable;

public class Alquiler implements Contratable{

	// Atributos
	private LocalDate diaDeInicio;
	private LocalDate diaDeFin;
	private Optional<LocalDate> diaDevolucion = Optional.empty();
	private Herramienta Herramienta;
	
	// Constructor
	public Alquiler(LocalDate diaDeInicio, LocalDate diaDeFin, Herramienta herramienta) {
		super();
		this.diaDeInicio = diaDeInicio;
		this.diaDeFin = diaDeFin;
		this.Herramienta = herramienta;
	}

	// Métodos
	@Override
	public Double costo() {
		
		/* Le sumo un dia ya que por ejemplo si te piden una herramienta por un par de horas,
		 * se tendría que calcular como que la pediste por todo el dia, pero el metodo between devolvería 0
		*/
		Period diasEntre = Period.between(diaDeInicio, diaDevolucion.orElse(LocalDate.now())).plusDays(1); 	
		
		return this.Herramienta.getCostoPorDia() * diasEntre.getDays();
	}
	
	public Boolean enMora() {
		
		Boolean resultado = false;
		
		if(diaDevolucion.orElse(LocalDate.now()).isAfter(diaDeFin)) {
			resultado = true;
		}
		
		return resultado;
	}

	@Override
	public Boolean finalizado() {
		return diaDevolucion.isPresent();
	}

	@Override
	public void finalizar() {
		diaDevolucion = Optional.of(LocalDate.now());		
	}
	
	@Override
	public Boolean esAlquilerNoFinalizado() {
		return !this.finalizado();
	}
}
