package movements.physical;

import ru.ifmo.se.pokemon.*;

public class WakeUpSlapMove extends PhysicalMove {
    public WakeUpSlapMove() {
        super(Type.FIGHTING, 70, 1.0);
    }

    @Override
    protected double calcBaseDamage(Pokemon att, Pokemon def) {
        if (def.getCondition() == Status.SLEEP) {
            return super.calcBaseDamage(att, def) * 2;
        } else {
            return super.calcBaseDamage(att, def);
        }
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (p.getCondition() == Status.SLEEP) {
            p.setCondition((new Effect()).condition(Status.NORMAL));
        }
    }

    @Override
    protected String describe() {
        return "даёт противнику леща (Wake-Up Slap)";
    }
}
