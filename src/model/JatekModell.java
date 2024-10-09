package model;

import java.util.Random;

public class JatekModell {

    private Ajto[] ajtok;
    private Random rnd;

    public JatekModell() {
        ajtok = new Ajto[3];
        rnd = new Random();
        int autoHelye = rnd.nextInt(3);
        ajtok[0] = new Ajto(autoHelye == 0);
        ajtok[1] = new Ajto(autoHelye == 1);
        ajtok[2] = new Ajto(autoHelye == 2);
    }

    public Ajto[] getAjtok() {
        return ajtok;
    }
}
