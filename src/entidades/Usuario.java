package entidades;

import java.util.ArrayList;

import excepciones.AlquilerNoEntregadoException;
import interfaz.Contratable;

public class Usuario {

	// Atributos
	private String nombre;
	private Long telefono;
	private String email;
	private ArrayList<Contratable> listaContratables = new ArrayList<>();

	// Constructor
	public Usuario(String nombre, Long telefono, String email) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
	}
	
	// Métodos
	public void contratar(Contratable c) throws AlquilerNoEntregadoException {

		Integer alquileresNoDevueltos = 0;

		if (c instanceof Alquiler) {

			for (Contratable algoContratable : this.listaContratables) {

				if (algoContratable.esAlquilerNoFinalizado()) {

					if (++alquileresNoDevueltos > 2) throw new AlquilerNoEntregadoException();
				}
			}
		}
		
		this.listaContratables.add(c);
	}
	
	public Double costoContratables() {
		Double resultado = 0.0;
		
		for (Contratable algoContratable : this.listaContratables) {
			resultado += algoContratable.costo();
		}
		
		return resultado;
	}

}
