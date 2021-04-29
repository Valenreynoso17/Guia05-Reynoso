package entidades;

import enumerados.Oficio;

public class ServicioEstandar extends Servicio{

	// Atributos
	private Double costoBase;
	private Double comisionManoDeObra; 	/* Atributo que representa el porcentaje de comisión (valores entre 0 y 1)
										*  que se cobran todos los trabajadores que realicen el servicio */
										
	// Constructor
	public ServicioEstandar(String nombre, Oficio oficio, String descripcion, Double costoBase, Double comisionManoDeObra) {
		super(nombre, oficio, descripcion);
		this.costoBase = costoBase;
		this.comisionManoDeObra = comisionManoDeObra;
		
	}

	@Override
	public Double costo() {
		return this.costoBase + this.costoBase*this.comisionManoDeObra;
	}

}
