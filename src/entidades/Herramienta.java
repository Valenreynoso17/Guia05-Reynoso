package entidades;

public class Herramienta {
	
	// Atributos
	private String nombre;
	private Double costoPorDia;
	
	// Constructor
	public Herramienta(String nombre, Double costoPorDia) {
		super();
		this.nombre = nombre;
		this.costoPorDia = costoPorDia;
	}

	// M�todos
	public Double getCostoPorDia() {
		return costoPorDia;
	}
}
