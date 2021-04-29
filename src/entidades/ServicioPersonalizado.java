package entidades;

import enumerados.Oficio;

public class ServicioPersonalizado extends Servicio{

	// Atributos
	private Double valorPresupuestado;
	private Double costoMateriales;
	private Double costoTransporte;
	
	// Constructor
	public ServicioPersonalizado(String nombre, Oficio oficio, String descripcion,
								Double valorPresupuestado, Double costoMateriales, Double costoTransporte) {
		super(nombre, oficio, descripcion);
		this.valorPresupuestado = valorPresupuestado;
		this.costoMateriales = costoMateriales;
		this.costoTransporte = costoTransporte;
	}

	// Métodos
	@Override
	public Double costo() {
		return valorPresupuestado + costoMateriales + costoTransporte;
	}

}
