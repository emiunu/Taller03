import java.util.*;

public class Cancha {

	private List<Partido> partidos;
	private String tipoSuperficie;
	private String ubicacion;
	private int capacidadEspectadores;

	public String getTipoSuperficie() {
		return this.tipoSuperficie;
	}

	/**
	 * 
	 * @param tipoSuperficie
	 */
	public void setTipoSuperficie(String tipoSuperficie) {
		this.tipoSuperficie = tipoSuperficie;
	}

	public String getUbicacion() {
		return this.ubicacion;
	}

	/**
	 * 
	 * @param ubicacion
	 */
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getCapacidadEspectadores() {
		return this.capacidadEspectadores;
	}

	/**
	 * 
	 * @param capacidadEspectadores
	 */
	public void setCapacidadEspectadores(int capacidadEspectadores) {
		this.capacidadEspectadores = capacidadEspectadores;
	}

	public List<Partido> getPartidos() {
		return partidos;
	}

	public void setPartidos(List<Partido> partidos) {
		this.partidos = partidos;
	}

	public Cancha(String ubicacion, int capacidadEspectadores, String tipoSuperficie) {
		this.partidos = new ArrayList<>();
		this.ubicacion = ubicacion;
		this.capacidadEspectadores = capacidadEspectadores;
		this.tipoSuperficie = tipoSuperficie;
	}
}