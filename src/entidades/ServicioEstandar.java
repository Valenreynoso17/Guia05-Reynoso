package entidades;

import enumerados.Oficio;

public class ServicioEstandar extends Servicio{

	// Atributos
	private Double costoBase;
	
	// Constructor
	public ServicioEstandar(String nombre, Oficio oficio, String descripcion, Double costoBase) {
		super(nombre, oficio, descripcion);
		this.costoBase = costoBase;
	}

	@Override
	public Double costo() {
		return this.costoBase;
	}

}
