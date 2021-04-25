package entidades;

public class ServicioEstandar extends Servicio{

	// Atributos
	private Double costoBase;
	
	public ServicioEstandar(Double costoBase) {
		super();
		this.costoBase = costoBase;
	}

	@Override
	public Double costo() {
		return this.costoBase;
	}

}
