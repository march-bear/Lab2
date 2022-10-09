package pokemons;

import movements.physical.WakeUpSlapMove;

public class Clefairy extends Cleffa {
    public Clefairy(String name, int level) {
        super(name, level);
        this.setStats(70, 45, 48, 60, 65, 35);
        this.addMove(new WakeUpSlapMove());
    }
}
