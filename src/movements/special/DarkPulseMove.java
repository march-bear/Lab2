package movements.special;

import ru.ifmo.se.pokemon.*;

public class DarkPulseMove extends SpecialMove {
    public DarkPulseMove() {
        super(Type.DARK, 80, 1.0);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().chance(0.2);
        if (e.success()) {
            e.flinch(p);
        }
    }

    @Override
    protected String describe() {
        return "швыряет в противника тёмный импульс (Dark Pulse)";
    }
}
