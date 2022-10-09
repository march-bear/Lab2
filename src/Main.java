import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p11 = new Seviper("Первый Охранник", 2);
        Pokemon p12 = new Seviper("Второй Охранник", 3);
        Pokemon p2 = new Wimpod("Студофис", 4);
        Pokemon p3 = new Golisopod("Декан", 7);
        Pokemon p41 = new Cleffa("Первак ИВТ", 3);
        Pokemon p42 = new Cleffa("Первак СППО", 4);
        Pokemon p5 = new Clefairy("Бакалавр", 5);
        Pokemon p6 = new Clefable("Магистр", 7);

        b.addAlly(p11);
        b.addAlly(p12);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p41);
        b.addFoe(p42);
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();
    }
}