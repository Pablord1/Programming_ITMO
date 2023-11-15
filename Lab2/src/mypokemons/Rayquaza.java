package mypokemons;

//Rayquaza
//https://pokemondb.net/pokedex/rayquaza (general info)
//Moves
	//https://pokemondb.net/move/stone-edge
	//https://pokemondb.net/move/scary-face
	//https://pokemondb.net/move/dragon-dance
	//https://pokemondb.net/move/bulk-up

import moves.rayquaza.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Rayquaza extends Pokemon {
	public Rayquaza(String name, int level) {
		super(name, level);
		
		super.setType(Type.DRAGON, Type.FLYING);
		super.setStats(105, 150, 90, 150, 90, 95);
		
		StoneEdge stoneEdge = new StoneEdge(100, 80);
		ScaryFace scaryFace = new ScaryFace(0, 100);
		DragonDance dragonDance = new DragonDance(0, 0);
		BulkUp bulkUp = new BulkUp(0, 0);
		
		super.setMove(stoneEdge, scaryFace, dragonDance, bulkUp);
	}
}
