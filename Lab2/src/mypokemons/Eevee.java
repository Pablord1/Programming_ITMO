package mypokemons;
//Eevee
//https://pokemondb.net/pokedex/eevee
//Moves
	//https://pokemondb.net/move/tackle
	//https://pokemondb.net/move/work-up
	//https://pokemondb.net/move/tail-whip
import moves.Eevee.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Eevee extends Pokemon {
	public Eevee(String name, int level) {
		super(name, level);
		
		super.setType(Type.NORMAL);
		super.setStats(55, 55, 50, 45, 65, 55);
		
		Tackle tackle = new Tackle(40, 100);
		WorkUp workUp = new WorkUp(0, 0);
		TailWhip tailWhip = new TailWhip(0, 100);
		
		super.setMove(tackle, workUp, tailWhip);
	}
}
