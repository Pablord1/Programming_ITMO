package moves.Eevee;
//https://pokemondb.net/move/tail-whip
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class TailWhip extends StatusMove {
	public TailWhip(double pow, double acc) {
		super(Type.NORMAL, pow, acc);
	}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		super.applyOppEffects(p);
		
		Effect e = new Effect().stat(Stat.DEFENSE, -1);
		p.addEffect(e);
	}
	
	@Override
	protected String describe() {
		String pieces[] = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
	}
}