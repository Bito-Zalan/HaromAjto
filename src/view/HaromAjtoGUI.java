package view;

import controller.GuiVezerlo;
import javax.swing.JOptionPane;

public class HaromAjtoGUI extends javax.swing.JFrame {

    private GuiVezerlo vezerlo;
    private int valasztottAjto;
    private boolean csereFelajanlva = false;

    public HaromAjtoGUI() {
        initComponents();
        vezerlo = new GuiVezerlo(this);

    }

    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblElsoAjto = new javax.swing.JLabel();
        lblMasodikAjto = new javax.swing.JLabel();
        lblHarmadikAjto = new javax.swing.JLabel();
        lblJatekFelirat = new javax.swing.JLabel();
        btnElsoAjtoNyitas = new javax.swing.JButton();
        btnElsoAjtoNyitas1 = new javax.swing.JButton();
        btnElsoAjtoNyitas2 = new javax.swing.JButton();
        lblCserevelNyertJatekok = new javax.swing.JLabel();
        lblCsereNelkulNyertJatekok = new javax.swing.JLabel();
        spnrCsereNelkulNyertJatekok = new javax.swing.JSpinner();
        spnrCserevelNyertJatekok = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        lblElsoAjto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ajtoKepek/ajto.png"))); // NOI18N

        lblMasodikAjto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ajtoKepek/ajto.png"))); // NOI18N

        lblHarmadikAjto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ajtoKepek/ajto.png"))); // NOI18N

        lblJatekFelirat.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        lblJatekFelirat.setText("HÁROM AJTÓ JÁTÉK");

        btnElsoAjtoNyitas.setText("Nyitás");
        btnElsoAjtoNyitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElsoAjtoNyitasActionPerformed(evt);
            }
        });

        btnElsoAjtoNyitas1.setText("Nyitás");
        btnElsoAjtoNyitas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElsoAjtoNyitas1ActionPerformed(evt);
            }
        });

        btnElsoAjtoNyitas2.setText("Nyitás");
        btnElsoAjtoNyitas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElsoAjtoNyitas2ActionPerformed(evt);
            }
        });

        lblCserevelNyertJatekok.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        lblCserevelNyertJatekok.setText("Cserével nyert játékok");

        lblCsereNelkulNyertJatekok.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        lblCsereNelkulNyertJatekok.setText("Csere nélkül nyert játékok");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblHarmadikAjto)
                    .addComponent(btnElsoAjtoNyitas)
                    .addComponent(lblCserevelNyertJatekok)
                    .addComponent(spnrCserevelNyertJatekok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblElsoAjto)
                    .addComponent(btnElsoAjtoNyitas1)
                    .addComponent(lblJatekFelirat))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblMasodikAjto)
                    .addComponent(btnElsoAjtoNyitas2)
                    .addComponent(lblCsereNelkulNyertJatekok)
                    .addComponent(spnrCsereNelkulNyertJatekok, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblJatekFelirat)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHarmadikAjto)
                        .addGap(12, 12, 12)
                        .addComponent(btnElsoAjtoNyitas))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblElsoAjto)
                        .addGap(12, 12, 12)
                        .addComponent(btnElsoAjtoNyitas1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMasodikAjto)
                        .addGap(12, 12, 12)
                        .addComponent(btnElsoAjtoNyitas2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCsereNelkulNyertJatekok)
                    .addComponent(lblCserevelNyertJatekok))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnrCsereNelkulNyertJatekok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnrCserevelNyertJatekok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        spnrCserevelNyertJatekok.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnElsoAjtoNyitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElsoAjtoNyitasActionPerformed
        valasztottAjto = 0;
        vezerlo.ajtoKivalaszt(valasztottAjto);
        if (!csereFelajanlva) {
            felajanlCserel();
            csereFelajanlva = true;
        }
    }//GEN-LAST:event_btnElsoAjtoNyitasActionPerformed

    private void btnElsoAjtoNyitas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElsoAjtoNyitas1ActionPerformed
        valasztottAjto = 1;
        vezerlo.ajtoKivalaszt(valasztottAjto);
        if (!csereFelajanlva) {
            felajanlCserel();
            csereFelajanlva = true;
        }
    }//GEN-LAST:event_btnElsoAjtoNyitas1ActionPerformed

    private void btnElsoAjtoNyitas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElsoAjtoNyitas2ActionPerformed
        valasztottAjto = 2;
        vezerlo.ajtoKivalaszt(valasztottAjto);
        if (!csereFelajanlva) {
            felajanlCserel();
            csereFelajanlva = true;
        }
    }//GEN-LAST:event_btnElsoAjtoNyitas2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new HaromAjtoGUI().setVisible(true));
    }

    public void frissitStatisztikak(int csereNelkulNyert, int csereNyert) {
        lblCsereNelkulNyertJatekok.setText("Csere nélkül nyert játékok:");
        lblCserevelNyertJatekok.setText("Cserével nyert játékok:");
        spnrCsereNelkulNyertJatekok.setValue(csereNelkulNyert);
        spnrCserevelNyertJatekok.setValue(csereNyert);
    }

    public void felajanlCserel() {
        int eredmeny = JOptionPane.showConfirmDialog(this, "Szeretnél cserélni?", "Cserélés", JOptionPane.YES_NO_OPTION);

        if (eredmeny == JOptionPane.YES_OPTION) {
            int ujAjtoIndex = vezerlo.csereAjto(valasztottAjto);
            JOptionPane.showMessageDialog(this, "Cseréltél ajtót! Az új ajtó: " + ujAjtoIndex);
        } else {
            JOptionPane.showMessageDialog(this, "A csere elvetve.");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnElsoAjtoNyitas;
    private javax.swing.JButton btnElsoAjtoNyitas1;
    private javax.swing.JButton btnElsoAjtoNyitas2;
    private javax.swing.JLabel lblCsereNelkulNyertJatekok;
    private javax.swing.JLabel lblCserevelNyertJatekok;
    private javax.swing.JLabel lblElsoAjto;
    private javax.swing.JLabel lblHarmadikAjto;
    private javax.swing.JLabel lblJatekFelirat;
    private javax.swing.JLabel lblMasodikAjto;
    private javax.swing.JSpinner spnrCsereNelkulNyertJatekok;
    private javax.swing.JSpinner spnrCserevelNyertJatekok;
    // End of variables declaration//GEN-END:variables
}
