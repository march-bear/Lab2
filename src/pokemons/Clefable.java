package pokemons;

import movements.special.ThunderMove;

public class Clefable extends Clefairy {
    public Clefable(String name, int level) {
        super(name, level);
        this.setStats(95, 70, 73, 95, 90, 60);
        this.addMove(new ThunderMove());
    }
}
