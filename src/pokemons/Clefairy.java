package pokemons;

import movements.special.FlamethrowerMove;
import movements.status.SingMove;
import movements.physical.WakeUpSlapMove;
import ru.ifmo.se.pokemon.*;

public class Clefairy extends Pokemon {
    public Clefairy(String name, int level) {
        super(name, level);
        this.setType(Type.FAIRY);
        this.setStats(70, 45, 48, 60, 65, 35);
        this.setMove(new FlamethrowerMove(), new SingMove(), new WakeUpSlapMove());
    }
}
