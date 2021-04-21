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
		// TODO debo sumarle lo que cobra el trabajador
		return null;
	}

}
