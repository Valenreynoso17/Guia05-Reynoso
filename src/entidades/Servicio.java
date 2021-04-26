package entidades;

import enumerados.Oficio;

public abstract class Servicio {
	
	// Atributos
	protected String nombre;
	protected Oficio oficio;
	protected String descripcion;
	
	
	public Servicio(String nombre, Oficio oficio, String descripcion) {
		super();
		this.nombre = nombre;
		this.oficio = oficio;
		this.descripcion = descripcion;
	}
	// Metodos
	public abstract Double costo();
	public Oficio getOficio() {
		return oficio;
	}
}
