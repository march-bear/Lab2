package movements.physical;

import ru.ifmo.se.pokemon.*;

public class FacadeMove extends PhysicalMove {
    public FacadeMove() {
        super(Type.NORMAL, 70, 1.0);
    }

    @Override
    protected double calcBaseDamage(Pokemon att, Pokemon def) {
        switch (att.getCondition()) {
            case BURN, POISON, PARALYZE -> {
                return super.calcBaseDamage(att, def) * 2;
            }
            default -> {
                return super.calcBaseDamage(att, def);
            }
        }
    }

    @Override
    protected String describe() {
        return "делает факадное мове (Facade)";
    }
}

