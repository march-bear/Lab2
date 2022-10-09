package movements.special;

import ru.ifmo.se.pokemon.*;

public class ThunderMove extends SpecialMove {
    public ThunderMove() {
        super(Type.ELECTRIC, 110, 0.7);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect().chance(0.3).condition(Status.PARALYZE);
        pokemon.setCondition(e);
    }

    @Override
    protected String describe() {
        return "вызывает гром (Thunder)";
    }
}
