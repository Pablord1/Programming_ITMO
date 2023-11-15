package mypokemons;
//https://pokemondb.net/pokedex/budew
//Moves
	//https://pokemondb.net/move/venoshock
	//https://pokemondb.net/move/confide
import moves.Budew.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Budew extends Pokemon {
	public Budew(String name, int level) {
		super(name, level);
		
		super.setType(Type.GRASS, Type.POISON);
		super.setStats(40, 30, 35, 50, 70, 55);
		
		Venoshock venoshock = new Venoshock(65, 100);
		Confide confide = new Confide(0, 0);
		
		
		super.setMove(venoshock, confide);
	}
}
