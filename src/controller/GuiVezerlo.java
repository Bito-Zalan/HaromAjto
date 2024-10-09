package controller;

import model.Ajto;
import model.JatekModell;
import view.GuiNezet;


public class GuiVezerlo {
    private JatekModell modell;
    private GuiNezet nezet;
    
    public GuiVezerlo(GuiNezet nezet){
        this.nezet = nezet;
        this.modell = new JatekModell();
    }
      public void ajtoKivalaszt(int ajtoIndex) {
        
       
    }
}
