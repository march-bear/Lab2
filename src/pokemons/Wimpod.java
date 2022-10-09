package pokemons;

import movements.physical.*;
import movements.status.DoubleTeamMove;
import ru.ifmo.se.pokemon.*;

public class Wimpod extends Pokemon {
    public Wimpod(String name, int level) {
        super(name, level);
        this.setType(Type.BUG, Type.WATER);
        this.setStats(25, 35, 40, 20, 30, 80);
        this.setMove(new FacadeMove(), new WaterfallMove(), new DoubleTeamMove());
    }
}
