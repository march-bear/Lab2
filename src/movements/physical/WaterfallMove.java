package movements.physical;

import ru.ifmo.se.pokemon.*;

public class WaterfallMove extends PhysicalMove {
    public WaterfallMove() {
        super(Type.WATER, 80, 1.0);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().chance(0.2);
        if (e.success()) {
            Effect.flinch(p);
        }
    }

    @Override
    protected String describe() {
        return "вызвал водопад (Waterfall)";
    }
}
