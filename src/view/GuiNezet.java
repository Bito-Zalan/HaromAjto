package view;

import javax.swing.*;

public class GuiNezet {
    private JLabel lblCserevelNyertJatekok;
    private JLabel lblCsereNelkulNyertJatekok;
    private JSpinner spnrCsereNelkulNyertJatekok;
    private JSpinner spnrCserevelNyertJatekok;

    public GuiNezet() {
        lblCserevelNyertJatekok = new JLabel("Cserével nyert játékok: 0");
        lblCsereNelkulNyertJatekok = new JLabel("Csere nélkül nyert játékok: 0");
        spnrCsereNelkulNyertJatekok = new JSpinner();
        spnrCserevelNyertJatekok = new JSpinner();
    }

    public void frissitStatisztikak(int csereNelkulNyert, int csereNyert) {
        spnrCsereNelkulNyertJatekok.setValue(csereNelkulNyert);
        spnrCserevelNyertJatekok.setValue(csereNyert);
        lblCsereNelkulNyertJatekok.setText("Csere nélkül nyert játékok: ");
        lblCserevelNyertJatekok.setText("Cserével nyert játékok: ");
    }
}
