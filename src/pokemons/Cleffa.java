package pokemons;

import movements.special.FlamethrowerMove;
import movements.status.SingMove;
import ru.ifmo.se.pokemon.*;

public class Cleffa extends Pokemon {
    public Cleffa(String name, int level) {
        super(name, level);
        this.setType(Type.FAIRY);
        this.setStats(50, 25, 28, 45, 55, 15);
        this.setMove(new FlamethrowerMove(), new SingMove());
    }
}
