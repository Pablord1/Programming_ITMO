package mypokemons;
//https://pokemondb.net/pokedex/espeon
//Moves
	//https://pokemondb.net/move/tackle
	//https://pokemondb.net/move/work-up
	//https://pokemondb.net/move/tail-whip
	//https://pokemondb.net/move/calm-mind
import moves.Eevee.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Espeon extends Pokemon {
	public Espeon(String name, int level) {
		super(name, level);
		
		super.setType(Type.PSYCHIC);
		super.setStats(65, 65, 60, 130, 95, 110);
		
		Tackle tackle = new Tackle(40, 100);
		WorkUp workUp = new WorkUp(0, 0);
		TailWhip tailWhip = new TailWhip(0, 100);
		CalmMind calmMind = new CalmMind(0, 0);
		
		super.setMove(tackle, workUp, tailWhip, calmMind);
	}
}