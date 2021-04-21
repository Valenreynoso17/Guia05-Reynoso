package entidades;

import java.time.LocalDate;
import java.util.ArrayList;

import interfaz.Contratable;

public class Alquiler implements Contratable{
	
	// Atributos
	private LocalDate diaDeInicio;
	private LocalDate diaDeFin;
	private LocalDate diaDevolucion;
	private ArrayList<Herramienta> listaHerramientas = new ArrayList<>(); // se puede hacer como una sola herramienta

	@Override
	public Double costo() {
		return null;
	}
}
