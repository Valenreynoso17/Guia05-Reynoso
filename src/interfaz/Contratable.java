package interfaz;

public interface Contratable {
	public Double costo();
	public Boolean finalizado();
	public void finalizar(); 	/* Me pareci� correcto agregar
	 							* un m�todo para finalizar un trabajo
	 							* o un servicio, seteando la fecha de fin */
	public default Boolean esAlquilerNoFinalizado() {
		return false;								
	}
}
