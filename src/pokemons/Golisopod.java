package pokemons;

import movements.physical.LiquidationMove;

public class Golisopod extends Wimpod {
    public Golisopod(String name, int level) {
        super(name, level);
        this.setStats(75, 125, 140, 60, 90, 40);
        this.addMove(new LiquidationMove());
    }
}
