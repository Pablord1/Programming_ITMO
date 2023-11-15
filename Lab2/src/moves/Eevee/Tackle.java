package moves.Eevee;
//https://pokemondb.net/move/tackle
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Tackle extends PhysicalMove {
	public Tackle(double pow, double acc) {
		super(Type.NORMAL, pow, acc);
	}
	
	@Override
	protected void applyOppDamage(Pokemon def, double damage) {
		super.applyOppDamage(def, damage);
	}
	
	@Override
	protected String describe() {
		String pieces[] = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
	}
}
