package mypokemons;
//https://pokemondb.net/pokedex/roselia
//Moves
	//https://pokemondb.net/move/venoshock
	//https://pokemondb.net/move/confide
	//https://pokemondb.net/move/petal-blizzard
import moves.Budew.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Roselia extends Pokemon {
	public Roselia(String name, int level) {
		super(name, level);
		
		super.setType(Type.GRASS, Type.POISON);
		super.setStats(50, 60, 45, 100, 80, 65);
		
		Venoshock venoshock = new Venoshock(65, 100);
		Confide confide = new Confide(0, 0);
		PetalBlizzard petalBlizzard = new PetalBlizzard(90, 100);
		
		
		super.setMove(venoshock, confide, petalBlizzard);
	}
}