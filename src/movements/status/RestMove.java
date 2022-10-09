package movements.status;

import ru.ifmo.se.pokemon.*;

public class RestMove extends StatusMove {
    public RestMove() {
        super(Type.PSYCHIC, 0, 1.0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.HP, (int) Math.round(p.getHP() - p.getStat(Stat.HP)));
        p.setCondition((new Effect()).turns(2).condition(Status.SLEEP));
    }

    @Override
    protected String describe() {
        return "спит и чилит (Rest)";
    }
}
