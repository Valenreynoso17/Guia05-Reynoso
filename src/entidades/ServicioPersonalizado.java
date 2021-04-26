package entidades;

import enumerados.Oficio;

public class ServicioPersonalizado extends Servicio{

	public ServicioPersonalizado(String nombre, Oficio oficio, String descripcion) {
		super(nombre, oficio, descripcion);
		// TODO Falta agregar los otros atributos que tendría
	}

	@Override
	public Double costo() {
		// TODO Auto-generated method stub
		return null;
	}

}
