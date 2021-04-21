package entidades;

import enumerados.Oficio;
import interfaz.Contratable;

public abstract class Servicio implements Contratable {
	
	// Atributos
	protected Oficio oficio;
	protected boolean esUrgente;
	
	// Metodos
	public abstract Double costo();
}
