package data;

import java.util.List;
import model.Game;

/**
 * <h3>Games</h3>
 * Interfaz de juegos
 * @version 1.0
 * @since 06/09/2020
 * @author Eva y Christian
 */
public interface Games {

	/**
	 * Devuelve la lista de juegos
	 * @return Lista de jeugos
	 */
	public List<Game> getGames();
	
	/**
	 * A�ade un juego al final de la lista
	 * @param game Juego a a�adir
	 * @return Verdadero si se ha podido a�adir a la lista
	 */
	public boolean addGame(Game game);
	
	/**
	 * Edita un juego por posicion
	 * @param game Juego editado
	 * @param index Posicion que sobreescribir
	 * @return Verdadero si se ha editado el juego
	 */
	public boolean editGame(Game game, int index);
	
	/**
	 * Borra un juego de la lista
	 * @param game Juego a borrar
	 * @return Verdadero si se ha podido borrar el juego
	 */
	public boolean deleteGame(Game game);
	
	
	
	
	
	
}
