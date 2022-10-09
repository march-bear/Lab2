package movements.physical;

import ru.ifmo.se.pokemon.*;

public class LiquidationMove extends PhysicalMove {
    public LiquidationMove() {
        super(Type.WATER, 85, 1.0);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().chance(0.2);
        if (e.success()) {
            p.setMod(Stat.DEFENSE, -1);
        }
    }

    @Override
    protected String describe() {
        return "пытается ликвидировать противника (Liquidation)";
    }
}
