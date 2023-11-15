package moves.Eevee;
//https://pokemondb.net/move/work-up
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class WorkUp extends StatusMove{
	public WorkUp(double pow, double acc) {
		super(Type.NORMAL, pow, acc);
	}
	
	@Override
	protected void applySelfEffects(Pokemon p) {
		super.applySelfEffects(p);
		
		Effect e = new Effect().stat(Stat.ATTACK, 1);
		Effect e2 = new Effect().stat(Stat.SPECIAL_ATTACK, 1);
		
		p.addEffect(e);
		p.addEffect(e2);
	}
	
	@Override
	protected String describe() {
		String pieces[] = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
	}
}

