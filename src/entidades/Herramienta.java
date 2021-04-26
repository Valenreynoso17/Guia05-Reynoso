package entidades;

public class Herramienta {
	
	// Atributos
	private String nombre;
	private Double costoPorDia;
	
	public Herramienta(String nombre, Double costoPorDia) {
		super();
		this.nombre = nombre;
		this.costoPorDia = costoPorDia;
	}

	public Double getCostoPorDia() {
		return costoPorDia;
	}
}
