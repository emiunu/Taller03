public class Entrenador {

	private Deporte deporteEspecializacion;
	private Equipo equipo;
	private String nombre;
	private int experiencia;

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

	public int getExperiencia() {
		return this.experiencia;
	}

	/**
	 * 
	 * @param experiencia
	 */
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public Deporte getDeporteEspecializacion() {
		return deporteEspecializacion;
	}

	public void setDeporteEspecializacion(Deporte deporteEspecializacion) {
		this.deporteEspecializacion = deporteEspecializacion;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public Entrenador(Deporte deporteEspecializacion, String nombre, int experiencia) {
		this.deporteEspecializacion = deporteEspecializacion;
		this.nombre = nombre;
		this.experiencia = experiencia;
	}
}