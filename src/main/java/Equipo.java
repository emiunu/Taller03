import java.util.*;

public class Equipo {

	private List<Deportista> deportistas;
	private Entrenador entrenador;
	private Deporte deporte;
	private List<Partido> partidos;
	private String nombre;

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Deportista> getDeportistas() {
		return deportistas;
	}

	public void setDeportistas(List<Deportista> deportistas) {
		this.deportistas = deportistas;
	}

	public Entrenador getEntrenador() {
		return entrenador;
	}

	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}

	public Deporte getDeporte() {
		return deporte;
	}

	public void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}

	public List<Partido> getPartidos() {
		return partidos;
	}

	public void setPartidos(List<Partido> partidos) {
		this.partidos = partidos;
	}

	public Equipo(Deporte deporte, String nombre) {
		this.deporte = deporte;
		this.nombre = nombre;
		this.deportistas = new ArrayList<>();
		this.entrenador = null;
	}
}