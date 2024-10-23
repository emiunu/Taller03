public class Deportista {

	private String nombre;
	private String apellido;
	private int contacto;
	private Equipo equipo;

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

	public String getApellido() {
		return this.apellido;
	}

	/**
	 * 
	 * @param apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getContacto() {
		return this.contacto;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	/**
	 * 
	 * @param contacto
	 */
	public void setContacto(int contacto) {
		this.contacto = contacto;
	}

	public Deportista(int contacto, String nombre, String apellido) {
		this.contacto = contacto;
		this.nombre = nombre;
		this.apellido = apellido;
	}
}