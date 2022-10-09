package pokemons;

import movements.physical.PoisonTailMove;
import movements.special.DarkPulseMove;
import movements.status.*;
import ru.ifmo.se.pokemon.*;

public class Seviper extends Pokemon {

    public Seviper(String name, int level) {
        super(name, level);
        this.setType(Type.POISON);
        this.setStats(73, 100, 60, 100, 60, 65);
        this.setMove(new PoisonTailMove(), new SwaggerMove(), new RestMove(), new DarkPulseMove());
    }
}
