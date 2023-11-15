package mypokemons;
//https://pokemondb.net/pokedex/roserade
//Moves
	//https://pokemondb.net/move/venoshock
	//https://pokemondb.net/move/confide
	//https://pokemondb.net/move/petal-blizzard
	//https://pokemondb.net/move/sweet-scent
import moves.Budew.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Roserade extends Pokemon {
	public Roserade(String name, int level) {
		super(name, level);
		
		super.setType(Type.GRASS, Type.POISON);
		super.setStats(60, 70, 65, 125, 105, 90);
		
		Venoshock venoshock = new Venoshock(65, 100);
		Confide confide = new Confide(0, 0);
		PetalBlizzard petalBlizzard = new PetalBlizzard(90, 100);
		SweetScent sweetScent = new SweetScent(0, 100);
		
		
		super.setMove(venoshock, confide, petalBlizzard, sweetScent);
	}
}
