package moves.rayquaza;
//https://pokemondb.net/move/bulk-up
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class BulkUp extends StatusMove{
	public BulkUp(double pow, double acc) {
		super(Type.FIGHTING, pow, acc);
	}
	
	@Override
	protected void applySelfEffects(Pokemon p) {
		super.applySelfEffects(p);
		
		Effect e = new Effect().stat(Stat.ATTACK, 1);
		Effect e2 = new Effect().stat(Stat.DEFENSE, 1);
		
		p.addEffect(e);
		p.addEffect(e2);
	}
	
	@Override
	protected String describe() {
		String pieces[] = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
	}
	
}
