package program;

import mypokemons.*; //Not to import all the types of pokemons

//Rayquaza
//https://pokemondb.net/pokedex/rayquaza (general info)
//Moves
	//https://pokemondb.net/move/stone-edge
	//https://pokemondb.net/move/scary-face
	//https://pokemondb.net/move/dragon-dance
	//https://pokemondb.net/move/bulk-up

//Eevee
//https://pokemondb.net/pokedex/eevee
//Moves
	//https://pokemondb.net/move/tackle
	//https://pokemondb.net/move/work-up
	//https://pokemondb.net/move/tail-whip

//Espeon
//https://pokemondb.net/pokedex/espeon
//Moves
	//https://pokemondb.net/move/tackle
	//https://pokemondb.net/move/work-up
	//https://pokemondb.net/move/tail-whip
	//https://pokemondb.net/move/calm-mind

//Budew
//https://pokemondb.net/pokedex/budew
//Moves
	//https://pokemondb.net/move/venoshock
	//https://pokemondb.net/move/confide

//Roselia
//https://pokemondb.net/pokedex/roselia
//Moves
	//https://pokemondb.net/move/venoshock
	//https://pokemondb.net/move/confide
	//https://pokemondb.net/move/petal-blizzard

//Roserade
//https://pokemondb.net/pokedex/roserade
//Moves
	//https://pokemondb.net/move/venoshock
	//https://pokemondb.net/move/confide
	//https://pokemondb.net/move/petal-blizzard
	//https://pokemondb.net/move/sweet-scent

import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Program {

	public static void main(String[] args) {
		Battle b = new Battle();
		
		//Creation of Pokemon type.
		Rayquaza p1 = new Rayquaza("Pedro", 1);
		Eevee p2 = new Eevee("Alain", 1);
		Espeon p3 = new Espeon("Roland", 1);
		Budew p4 = new Budew("Jem", 1);
		Roselia p5 = new Roselia("Petite Rose", 1);
		Roserade p6 = new Roserade("Rose", 1);
		
		
		
		//Creation of a Pokemon of type Rayquaza
		
		b.addAlly(p1);
		b.addAlly(p3);
		b.addAlly(p5);
		b.addFoe(p2);
		b.addFoe(p4);
		b.addFoe(p6);
		b.go();
	}
}
