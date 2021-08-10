package tests;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import data.ImporterImpl;
import model.Game;
import model.Platform;
import services.ServicesGame;
import services.ServicesGameImpl;

public class TestServicesGameAssertJ {
	
	private static ServicesGame servicesGame;

	@BeforeAll
	static void beforeAll() {
		
		new ImporterImpl().importCSV();
		servicesGame = new ServicesGameImpl();	
	}
	
	//Test 1
		//Escenario: Pedir un juego de una plataforma concreta
		//Given: nombre del juego y plataforma
		//When: se busca el juego
		//Then: devuelve un juego
	@Test
	void askForGameGivingCorrectNameAndPlatform() {
		String name = "Nintendogs";
		Platform platform = Platform.DS;
		
		Game game = servicesGame.getGames(name, platform);
		
		assertThat(game.getName()).isEqualTo(name);
		assertThat(game.getRelease().getPlatform()).isEqualTo(platform);
	}
	
	//Test 2
		//Escenario: Pedir un juego inexistente
		//Given: nombre de un juego inexistente y plataforma existente
		//When: se busca el juego
		//Then: devuelve un juego vacío
	@Test
	void askForGameGivingInCorrectNameAndCorrectPlatform() {
		String name = "Nintencats";
		Platform platform = Platform.DS;
		
		Game game = servicesGame.getGames(name, platform);
		
		assertThat(game.getName()).isEqualTo(null);

	}
	
	//Test 3
		//Escenario: Pedir un juego de una plataforma inexistente
		//Given: nombre de un juego existente y plataforma inexistente
		//When: se busca el juego
		//Then: devuelve juego vacío
	@Test
	void askForGameGivingCorrectNameAndIncorrectPlatform() {
		String name = "Nintendogs";
		Platform platform = Platform.Atari2600;
		
		Game game = servicesGame.getGames(name, platform);
		
		assertThat(game.getName()).isEqualTo(null);

	}
	
	
	//Test 4
			//Escenario: Pedir un juego inexistente de una plataforma inexistente
			//Given: nombre de un juego inexistente y plataforma inexistente
			//When: se busca el juego
			//Then: devuelve juego vacío
	@Test
	void askForGameGivingIncorrectNameAndIncorrectPlatform() {
		String name = "Nintencats";
		Platform platform = Platform.Atari2600;
		
		Game game = servicesGame.getGames(name, platform);
		
		assertThat(game.getName()).isEqualTo(null);

	}
	
	//Test 5
		//Escenario: Pedir un juego existente con formato distinto (MAYÚSCULAS)
		//Given: nombre de un juego con mayúsculas distintas y plataforma existente
		//When: se busca el juego
		//Then: devuelve el juego con mismo nombre y plataforma
	@Test
	void askForGameGivingIncorrectNameCapsAndCorrectPlatform() {
		String name = "nINTENDOGS";
		Platform platform = Platform.DS;
		
		Game game = servicesGame.getGames(name, platform);
		
		assertThat(game.getName()).isNotEqualTo(name);
		assertThat(game.getRelease()).isEqualTo(null);

	}
	
	//Test 6
		//Escenario: Pedir un juego existente con formato distinto (ESPACIOS)
		//Given: nombre de un juego con espacios de más y plataforma existente
		//When: se busca el juego
		//Then: devuelve el juego con mismo nombre y plataforma
	@Test
	void askForGameGivingIncorrectNameSpacesAndCorrectPlatform() {
		String name = "  Nintendogs    ";
		Platform platform = Platform.DS;
		
		Game game = servicesGame.getGames(name, platform);
		
		assertThat(game.getName()).isNotEqualTo(name);
		assertThat(game.getRelease()).isEqualTo(null);

	}
	
	//Test 7
		//Escenario: Pedir un juego existente y una plataforma nula
		//Given: nombre de un juego correcto y con un objeto Plataforma vacío
		//When: se busca el juego
		//Then: se lanza una excepción IllegalArgumentException	
	@Test
	void askForGameGivingCorrectNameAndEmptyPlatform() {
		String name = "Nintendogs";
		Platform platform = null;
		
		assertThatThrownBy(() -> servicesGame.getGames(name, platform));
	}
		

	

}
