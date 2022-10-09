package movements.physical;

import ru.ifmo.se.pokemon.*;

public class PoisonTailMove extends PhysicalMove {
    public PoisonTailMove() {
        super(Type.POISON, 50, 1.0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.SPEED, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().chance(0.10);
        if (e.success()) {
            e.poison(p);
        }
    }

    @Override
    protected String describe() {
        return "бьёт противника ядовитым хвостом (Poison Tail)";
    }
}
