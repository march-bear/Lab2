package movements.special;

import ru.ifmo.se.pokemon.*;

public class FlamethrowerMove extends SpecialMove {
    public FlamethrowerMove() {
        super(Type.FIRE, 90, 1.0);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().chance(0.1);
        if (e.success()) {
            Effect.burn(p);
        }
    }

    @Override
    protected String describe() {
        return "ссыт из огнемёта (Flamethrower)";
    }
}
