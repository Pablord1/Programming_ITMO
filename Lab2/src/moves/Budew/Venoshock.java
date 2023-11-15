package moves.Budew;
//https://pokemondb.net/move/venoshock
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class Venoshock extends SpecialMove {
	public Venoshock(double pow, double acc) {
		super(Type.POISON, pow, acc);
	}
	
	@Override
	protected void applyOppDamage(Pokemon def, double damage) {
		//https://se.ifmo.ru/~tony/doc/ru/ifmo/se/pokemon/Pokemon.html#getCondition--
		if (def.getCondition() == Status.POISON) { //If the pokemon is poisoned, inflicts double damage
			super.applyOppDamage(def, 2*damage);
		}
		
	}
	
	@Override
	protected String describe() {
		String pieces[] = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
	}
}
