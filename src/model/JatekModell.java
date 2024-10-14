package model;

import java.util.Random;

public class JatekModell {

    private static Random rnd = new Random();
    private Ajto[] ajtok;
    private int csereNyert;
    private int csereNelkulNyert;
    private int valasztottAjto;

    public JatekModell() {
        ajtokLetrehoz(3);
        csereNyert = 0;
        csereNelkulNyert = 0;
    }

    private void ajtokLetrehoz(int ajtoDb) {
        this.ajtok = new Ajto[ajtoDb];

        for (int i = 0; i < ajtoDb; i++) {
            ajtok[i] = new Ajto();
        }

        int nyertes = rnd.nextInt(ajtoDb);
        ajtok[nyertes].setNyertes();
    }

    public int kinyitottAjto(int ajtoIndex) {
        int kinyitottAjtoIndex;
        do {
            kinyitottAjtoIndex = rnd.nextInt(ajtok.length);
        } while (kinyitottAjtoIndex == ajtoIndex || ajtok[kinyitottAjtoIndex].isAuto());
        return kinyitottAjtoIndex;
    }

    public void jatekosValaszt(int ajtoIndex, boolean csere) {
        Ajto valasztottAjto = ajtok[ajtoIndex];

        if (csere) {
            ajtoIndex = 3 - ajtoIndex - kinyitottAjto(ajtoIndex); 
            valasztottAjto = ajtok[ajtoIndex];
        }

        if (valasztottAjto.isAuto()) {
            if (csere) {
                csereNyert++;
            } else {
                csereNelkulNyert++;
            }
        }
        this.valasztottAjto = ajtoIndex;

    }

    public int getCsereNyert() {
        return csereNyert;
    }

    public int getCsereNelkulNyert() {
        return csereNelkulNyert;
    }

    public Ajto[] getAjtok() {
        return ajtok;
    }
}
