package controller;

import model.Ajto;
import model.JatekModell;
import view.HaromAjtoGUI;

public class GuiVezerlo {

    private JatekModell modell;
    private HaromAjtoGUI nezet;

    public GuiVezerlo(HaromAjtoGUI nezet) {
        this.nezet = nezet;
        this.modell = new JatekModell();
    }

    public void ajtoKivalaszt(int ajtoIndex) {
        modell.jatekosValaszt(ajtoIndex, false);
        int kinyitottAjtoIndex = modell.kinyitottAjto(ajtoIndex);
        
        nezet.felajanlCserel();
        nezet.frissitStatisztikak(modell.getCsereNelkulNyert(), modell.getCsereNyert());
    }

    public int csereAjto(int valasztottAjto) {
        int ujAjtoIndex = 3 - valasztottAjto - modell.kinyitottAjto(valasztottAjto);
        modell.jatekosValaszt(ujAjtoIndex, true);
        return ujAjtoIndex;
    }
    public void frissitStatisztikak(boolean csere) {
        nezet.frissitStatisztikak(modell.getCsereNelkulNyert(), modell.getCsereNyert());
    }
}
