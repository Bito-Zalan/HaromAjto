package model;

import java.util.Random;

public class JatekModell {

    private Ajto[] ajtok;
    private Random rnd;

    public JatekModell() {
        ajtok = new Ajto[3];
        rnd = new Random();
        int autoHelye = rnd.nextInt(3);
        for (int i = 0; i < 3; i++) {
            ajtok[i] = new Ajto(i == autoHelye);
        }
    }
}
