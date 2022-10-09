package pokemons;

import movements.physical.*;
import movements.status.DoubleTeamMove;
import ru.ifmo.se.pokemon.*;

public class Golisopod extends Pokemon {
    public Golisopod(String name, int level) {
        super(name, level);
        this.setType(Type.BUG, Type.WATER);
        this.setStats(75, 125, 140, 60, 90, 40);
        this.setMove(new FacadeMove(), new WaterfallMove(), new DoubleTeamMove(), new LiquidationMove());
    }
}
