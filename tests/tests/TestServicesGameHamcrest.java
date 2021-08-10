package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import data.ImporterImpl;
import model.Game;
import model.Platform;
import services.ServicesGame;
import services.ServicesGameImpl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.Matcher.*;

public class TestServicesGameHamcrest {
	
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
		
		assertThat(game.getName(), is(name));
		assertThat(game.getRelease().getPlatform(), is(platform));
	}
	
	//Test 2
		//Escenario: Pedir un juego inexistente
		//Given: nombre de un juego inexistente y plataforma existente
		//When: se busca el juego
		//Then: devuelve un juego vac�o
	@Test
	void askForGameGivingInCorrectNameAndCorrectPlatform() {
		String name = "Nintencats";
		Platform platform = Platform.DS;
		
		Game game = servicesGame.getGames(name, platform);
		
		assertThat(game.getName(), nullValue());

	}
	
	//Test 3
		//Escenario: Pedir un juego de una plataforma inexistente
		//Given: nombre de un juego existente y plataforma inexistente
		//When: se busca el juego
		//Then: devuelve juego vac�o
	@Test
	void askForGameGivingCorrectNameAndIncorrectPlatform() {
		String name = "Nintendogs";
		Platform platform = Platform.Atari2600;
		
		Game game = servicesGame.getGames(name, platform);
		
		assertThat(game.getName(), nullValue());

	}
	
	
	//Test 4
			//Escenario: Pedir un juego inexistente de una plataforma inexistente
			//Given: nombre de un juego inexistente y plataforma inexistente
			//When: se busca el juego
			//Then: devuelve juego vac�o
	@Test
	void askForGameGivingIncorrectNameAndIncorrectPlatform() {
		String name = "Nintencats";
		Platform platform = Platform.Atari2600;
		
		Game game = servicesGame.getGames(name, platform);
		
		assertThat(game.getName(), nullValue());

	}
	
	//Test 5
		//Escenario: Pedir un juego existente con formato distinto (MAY�SCULAS)
		//Given: nombre de un juego con may�sculas distintas y plataforma existente
		//When: se busca el juego
		//Then: devuelve el juego con mismo nombre y plataforma
	@Test
	void askForGameGivingIncorrectNameCapsAndCorrectPlatform() {
		String name = "nINTENDOGS";
		Platform platform = Platform.DS;
		
		Game game = servicesGame.getGames(name, platform);
		
		assertThat(game.getName(), is(not(name)));
		assertThat(game.getRelease(), nullValue());

	}
	
	//Test 6
		//Escenario: Pedir un juego existente con formato distinto (ESPACIOS)
		//Given: nombre de un juego con espacios de m�s y plataforma existente
		//When: se busca el juego
		//Then: devuelve el juego con mismo nombre y plataforma
	@Test
	void askForGameGivingIncorrectNameSpacesAndCorrectPlatform() {
		String name = "  Nintendogs    ";
		Platform platform = Platform.DS;
		
		Game game = servicesGame.getGames(name, platform);
		
		assertThat(game.getName(), is(not(name)));
		assertThat(game.getRelease(), nullValue());

	}
	
	//Test 7
		//Escenario: Pedir un juego existente y una plataforma nula
		//Given: nombre de un juego correcto y con un objeto Plataforma vac�o
		//When: se busca el juego
		//Then: se lanza una excepci�n IllegalArgumentException	
	
	// No sabemos si se pueden implementar excepciones
	
	/*@Test
	void askForGameGivingCorrectNameAndEmptyPlatform() {
		String name = "Nintendogs";
		Platform platform = null;
		
		Game game = servicesGame.getGames(name, platform);
		
		assertThatIllegalArgumentException();
		
	}*/
		

	
	
	
	

}
