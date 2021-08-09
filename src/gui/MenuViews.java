package gui;

import model.Game;
import model.Genre;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>MenuViews</b>
 * Visualizado de los menus
 * @version 1.0
 * @since 06/09/2020
 * @author F.Javier e Ismael
 */
public class MenuViews {
	
	/**
	 * Muestra el menu principal 
	 */
	public static void showMainMenu() {
		System.out.println("Elige una opci�n y pulsa enter: ");
		System.out.println("1. Mostrar lista de juegos completa");
		System.out.println("2. Mostrar lista de juegos por g�nero");
		System.out.println("3. Mostrar lista de juegos del siglo XX");
		System.out.println("4. Mostrar lista de juegos lanzados en a�os pares");
		System.out.println("5. Mostrar lista de juegos de Nintendo");
		System.out.println("6. Mostrar creadores de juegos");
		System.out.println("0. Salir");
	}
	
	/**
	 * Muestra un menu con todos los g�neros
	 * @param genreList lista de generos que se desea mostrar
	 */
	public static void showGenreMenu(ArrayList<Genre> genreList) {
		int i = 1;

		System.out.println("Elija una opci�n: ");
		for(Genre g : genreList) {
			System.out.println(i+". "+g.getName());
			i++;
		}
	}

}
