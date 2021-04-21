package entidades;

import java.util.ArrayList;

import enumerados.Oficio;

public class Trabajador {
	
	// Atributos 
	ArrayList<Trabajo> listaTrabajos = new ArrayList<>();
	private String nombreApellido;
	private String email;
	private Oficio oficio;
	private Double costoPorHora;
	private Double porcentajeComision;
}
