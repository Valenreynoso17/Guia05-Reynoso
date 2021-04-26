package entidades;

import java.util.ArrayList;

import excepciones.AlquilerNoEntregadoException;
import interfaz.Contratable;

public class Usuario {

	// Atributos
	private String nombre;
	private Double telefono;
	private String email;
	private ArrayList<Contratable> listaContratables = new ArrayList<>();

	public Usuario(String nombre, Double telefono, String email) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
	}

	public void contratar(Contratable c) throws AlquilerNoEntregadoException {

		Integer alquileresNoDevueltos = 0;

		if (c instanceof Alquiler) {

			for (Contratable algoContratable : this.listaContratables) {

				if (algoContratable.alquilerFinalizado()) {

					if (++alquileresNoDevueltos > 2) {
						throw new AlquilerNoEntregadoException();
					}
				}
			}
		}
		
		this.listaContratables.add(c);
	}

}
