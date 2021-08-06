package gui;

import model.Game;
import model.Genre;

import java.util.ArrayList;
import java.util.List;

public class MenuViews {
	
	public static void showMainMenu() {
		System.out.println("Elige una opci�n y pulsa enter: ");
		System.out.println("1. Mostrar lista de juegos completa");
		System.out.println("2. Mostrar lista de juegos por g�nero");
		//System.out.println("3. Mostrar lista de juegos por editor");
		//System.out.println("4. Mostrar lista de juegos por consola");
		System.out.println("3. Mostrar lista de juegos del siglo XX");
		System.out.println("4. Mostrar lista de juegos lanzados en a�os pares");
		System.out.println("5. Mostrar lista de juegos de Nintendo");
		System.out.println("6. Mostrar creadores de juegos");
		System.out.println("0. Salir");
	}
	
	public static void showGenreMenu(ArrayList<Genre> genreList) {
		int i = 1;

		System.out.println("Elija una opci�n: ");
		for(Genre g : genreList) {
			System.out.println(i+". "+g.getName());
			i++;
		}
	}
	
	/*
	 * 0. menu inicial
	 * 1. lista de juegos completa
	 * 2. por genero (elegir genero)
	 * 3. por fecha (introducir fecha. opci�n even)
	 * 4. lista de creadores
	 * 5. por consola (elegir consola)
	 * */

}
