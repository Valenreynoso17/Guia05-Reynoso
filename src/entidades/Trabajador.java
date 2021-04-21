package entidades;

import java.util.ArrayList;

public class Trabajador {
	
	// Atributos 
	ArrayList<Trabajo> listaTrabajos = new ArrayList<>();
	private String nombreApellido;
	private String email;
	private String oficio; //TODO: ver si lo hago con un enum
	private Double costoPorHora;
	private Double porcentajeComision;
}
