import java.util.*;

public class Club {

	private List<Deporte> deportes;
	private List<Cancha> canchas;
	private List<Equipo> equipos;
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

	/**
	 * 
	 * @param nombre
	 * @param apellido
	 * @param contacto
	 */
	public boolean registrarDeportista(String nombre, String apellido, int contacto) {
		if (!verificarExistenciaDeportista(nombre,apellido)) {
			Deportista deportista = new Deportista(contacto, nombre, apellido);
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param nombre
	 * @param experiencia
	 * @param deporteEspecializacion

	 */
	public boolean registrarEntrenador(String nombre, int experiencia, Deporte deporteEspecializacion) {
		if (!verificarExistenciaEntrenador(nombre)){
			Entrenador entrenador = new Entrenador(deporteEspecializacion,nombre,experiencia);
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param nombre
	 * @param apellido
	 */
	public boolean verificarExistenciaDeportista(String nombre, String apellido) {
		for (Equipo equipo : equipos){
			for (Deportista deportista : equipo.getDeportistas()){
				if (deportista.getNombre().equals(nombre) && deportista.getApellido().equals(apellido)){
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * 
	 * @param nombre
	 */
	public boolean verificarExistenciaEntrenador(String nombre) {
		for (Equipo equipo : equipos){
			if (equipo.getEntrenador().getNombre().equals(nombre)){
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @param nombre
	 * @param deporte
	 */
	public boolean crearEquipo(String nombre, Deporte deporte) {
		for (Equipo equipo : equipos){
			if (equipo.getNombre().equals(nombre)){
				return false;
			}
		}
		Equipo equipo = new Equipo(deporte,nombre);
		return true;
	}

	/**
	 * 
	 * @param deportista
	 * @param equipo
	 */
	public boolean asignarDeportistas(Deportista deportista, Equipo equipo) {

		List<Deportista> deportistas = equipo.getDeportistas();
		for (Deportista deport : deportistas){
			if (deport.equals(deportista)){
				return false;
			}
		}
		deportistas.add(deportista);
		equipo.setDeportistas(deportistas);
		return true;
	}

	/**
	 * 
	 * @param entrenador
	 * @param equipo
	 */
	public boolean asignarEntrenador(Entrenador entrenador, Equipo equipo) {
		if (equipo.getEntrenador() == null){
			equipo.setEntrenador(entrenador);
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param cancha
	 * @param fecha
	 * @param resultadoPartido
	 * @param equipos
	 */
	public boolean registrarPartidoJugado(Cancha cancha, int fecha, String resultadoPartido, List<Equipo> equipos) {
		for (Partido partido : cancha.getPartidos()){
			if (partido.getFecha() == fecha && partido.getEquipos().equals(equipos)){
				return false;
			}
		}
		Partido partido = new Partido(fecha, resultadoPartido);
		cancha.getPartidos().add(partido);
		partido.setEquipos(equipos);
		return true;
	}

	/**
	 * 
	 * @param tipoSuperficie
	 * @param ubicacion
	 * @param capacidadEspectadores
	 */
	public boolean crearCancha(String tipoSuperficie, String ubicacion, int capacidadEspectadores) {
		Cancha canchaNueva = new Cancha(ubicacion, capacidadEspectadores, tipoSuperficie);
		for (Cancha cancha : canchas){
			if (cancha == canchaNueva){
				return false;
			}
		}
		canchas.add(canchaNueva);
		return true;
	}

	/**
	 * 
	 * @param cancha
	 * @param fecha
	 */
	public boolean disponibilidadCancha(Cancha cancha, int fecha) {
		for (Partido partido : cancha.getPartidos()){
			if (partido.getFecha() == fecha){
				return false;
			}
		}
		return true;
	}

	/**
	 * 
	 * @param cancha
	 * @param partido
	 */
	public boolean reservarCancha(Cancha cancha, Partido partido) {
		if (disponibilidadCancha(cancha,partido.getFecha())){
			cancha.getPartidos().add(partido);
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param cancha
	 */
	public List<Partido> historialPartidosEnCancha(Cancha cancha) {
		return cancha.getPartidos();
	}

}