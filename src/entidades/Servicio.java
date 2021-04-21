package entidades;

import enumerados.Oficio;

public abstract class Servicio {
	
	// Atributos
	protected String nombre;
	protected Oficio oficio;
	
	// Metodos
	public abstract Double costo();
}
