package movements.status;

import ru.ifmo.se.pokemon.*;

public class SingMove extends SpecialMove {
    public SingMove() {
        super(Type.NORMAL, 0, 0.55);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.sleep(p);
    }

    @Override
    protected String describe() {
        return "напевает какую-то хрень (Sing)";
    }
}
