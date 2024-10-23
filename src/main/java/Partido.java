import java.util.*;

public class Partido {

	private int fecha;
	private String resultadoPartido;
	private List<Equipo> equipos;
	private Cancha cancha;

	public List<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(List<Equipo> equipos) {
		this.equipos = equipos;
	}

	public int getFecha() {
		return this.fecha;
	}

	/**
	 * 
	 * @param fecha
	 */
	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

	public String getResultadoPartido() {
		return this.resultadoPartido;
	}

	/**
	 * 
	 * @param resultadoPartido
	 */
	public void setResultadoPartido(String resultadoPartido) {
		this.resultadoPartido = resultadoPartido;
	}

	public Cancha getCancha() {
		return cancha;
	}

	public void setCancha(Cancha cancha) {
		this.cancha = cancha;
	}

	public Partido(int fecha, String resultadoPartido) {
		this.fecha = fecha;
		this.resultadoPartido = resultadoPartido;
		this.equipos = new ArrayList<>();
	}
}