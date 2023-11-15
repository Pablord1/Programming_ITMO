package moves.Eevee;
//https://pokemondb.net/move/calm-mind
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class CalmMind extends StatusMove{
	public CalmMind(double pow, double acc) {
		super(Type.PSYCHIC, pow, acc);
	}
	
	@Override
	protected void applySelfEffects(Pokemon p) {
		super.applySelfEffects(p);
		
		Effect e = new Effect().stat(Stat.SPECIAL_ATTACK, 1);
		Effect e2 = new Effect().stat(Stat.SPECIAL_DEFENSE, 1);
		
		p.addEffect(e);
		p.addEffect(e2);
	}
	
	@Override
	protected String describe() {
		String pieces[] = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
	}
	
}