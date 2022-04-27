package interfejs;

import osnova.Biblioteka;
import osnova.Validacija;
import static osnova.Validacija.isValidUserName;

/**
 *
 * @author SMRTNIK
 */
public class PrijavaGostClanPisacGUI extends javax.swing.JFrame {

    public PrijavaGostClanPisacGUI() {
        initComponents();
        ugasi();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        korisnickoIme_TF = new javax.swing.JTextField();
        prijavi_B = new javax.swing.JButton();
        administrator_L = new javax.swing.JLabel();
        vrstaClanstva_CB = new javax.swing.JComboBox<>();
        lozinka_TF = new javax.swing.JTextField();
        lozinka_L = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prijavljivanje gosta sistema elektrosne biblioteke - SEB");
        setResizable(false);

        jLabel1.setText("Korisnicko ime:");

        prijavi_B.setText("Prijavi se");
        prijavi_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prijavi_BActionPerformed(evt);
            }
        });

        administrator_L.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        administrator_L.setForeground(new java.awt.Color(102, 102, 102));
        administrator_L.setText("Prijavi se kao administrator");
        administrator_L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                administrator_LMouseClicked(evt);
            }
        });

        vrstaClanstva_CB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gost", "Clan", "Pisac" }));
        vrstaClanstva_CB.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                vrstaClanstva_CBPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        lozinka_L.setText("Lozinka");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lozinka_L)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(vrstaClanstva_CB, 0, 120, Short.MAX_VALUE)
                                .addComponent(lozinka_TF))
                            .addGap(84, 84, 84)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(prijavi_B, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(administrator_L, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(30, 30, 30)
                            .addComponent(korisnickoIme_TF))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(korisnickoIme_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(administrator_L))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(vrstaClanstva_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lozinka_L)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lozinka_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prijavi_B))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prijavi_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prijavi_BActionPerformed
        prijaviGosta();
    }//GEN-LAST:event_prijavi_BActionPerformed

    private void administrator_LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_administrator_LMouseClicked
        new PrijavaAdministratorGUI().show();
        this.setVisible(true);
    }//GEN-LAST:event_administrator_LMouseClicked

    private void vrstaClanstva_CBPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_vrstaClanstva_CBPopupMenuWillBecomeInvisible
        ispitajOsobu();
    }//GEN-LAST:event_vrstaClanstva_CBPopupMenuWillBecomeInvisible
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrijavaGostClanPisacGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrijavaGostClanPisacGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrijavaGostClanPisacGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrijavaGostClanPisacGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrijavaGostClanPisacGUI().setVisible(true);
            }
        });
    }

    private char koSePrijavljuje() {
        char zastavica = 0;
        switch (vrstaClanstva_CB.getSelectedItem().toString()) {
            case "Gost":
                zastavica = 'g';
                break;
            case "Clan":
                zastavica = 'c';
                break;

            case "Pisac":
                zastavica = 'p';
                break;
        }
        return zastavica;
    }

    private boolean provera(String ime) {
        return isValidUserName(ime);
    }

    private void prijaviGosta() {
        if (provera(korisnickoIme_TF.getText())) {
            Biblioteka bib = new Biblioteka();
            SistemElektronskeBibliotekeGUI s = new SistemElektronskeBibliotekeGUI(korisnickoIme_TF.getText(), false);
            s.ucitajDatotekeBiblioteke();
            s.refreshTabela();
            KnjigaGUI k = new KnjigaGUI(bib, true);
            k.show();
            this.setVisible(false);
            this.dispose();
        }
    }

    private void ispitajOsobu() {
        if (koSePrijavljuje() == 'g') {
            ugasi();
            this.setTitle("Prijavljivanje gosta sistema elektrosne biblioteke - SEB");
        } else if (koSePrijavljuje() == 'c') {
            upali();
            this.setTitle("Prijavljivanje clana sistema elektrosne biblioteke - SEB");
            //uskoro
            //napraviti da spisak knjiga bude stalan i kada se dodaju nove pri gasenju programa
            //pita da se sacuva, i ako ona sacuva da zameni prethodnu datoteteku
            //potrebno napraviti spisak clanova
        } else if (koSePrijavljuje() == 'p') {
            upali();
            this.setTitle("Prijavljivanje pisca sistema elektrosne biblioteke - SEB");
            //potrebno napraviti spisak pisaca kao i za clana
        } else {
            lozinka_L.setVisible(true);
            lozinka_L.setText("GRESKA!");
        }
    }

    private void upali() {
        lozinka_L.setVisible(true);
        lozinka_TF.setVisible(true);
    }

    private void ugasi() {
        lozinka_L.setVisible(false);
        lozinka_TF.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel administrator_L;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField korisnickoIme_TF;
    private javax.swing.JLabel lozinka_L;
    private javax.swing.JTextField lozinka_TF;
    private javax.swing.JButton prijavi_B;
    private javax.swing.JComboBox<String> vrstaClanstva_CB;
    // End of variables declaration//GEN-END:variables
}
