package pokemons;

import movements.physical.WakeUpSlapMove;
import movements.special.*;
import movements.status.SingMove;
import ru.ifmo.se.pokemon.*;

public class Clefable extends Pokemon {
    public Clefable(String name, int level) {
        super(name, level);
        this.setType(Type.FAIRY);
        this.setStats(95, 70, 73, 95, 90, 60);
        this.setMove(new FlamethrowerMove(), new SingMove(), new WakeUpSlapMove(), new ThunderMove());
    }
}
