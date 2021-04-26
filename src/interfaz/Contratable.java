package interfaz;

public interface Contratable {
	public Double costo();
	public Boolean finalizado();
	public void finalizar();
	public default Boolean alquilerFinalizado() {
		return false;
	}
}
