package movements.status;

import ru.ifmo.se.pokemon.*;

public class DoubleTeamMove extends StatusMove {
    public DoubleTeamMove() {
        super(Type.NORMAL, 0, 1.0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.EVASION, 1);
    }

    @Override
    protected String describe() {
        return "позвал братков (Double Team)";
    }
}
