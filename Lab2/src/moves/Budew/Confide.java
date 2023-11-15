package moves.Budew;
//https://pokemondb.net/move/confide
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Confide extends StatusMove {
	public Confide(double pow, double acc) {
		super(Type.NORMAL, pow, acc);
	}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		super.applyOppEffects(p);
		
		Effect e = new Effect().stat(Stat.SPECIAL_ATTACK, -1);
		p.addEffect(e);
	}
	
	@Override
	protected String describe() {
		String pieces[] = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
	}
}
