package interfejs;

import java.awt.Color;
import java.awt.HeadlessException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import osnova.Validacija;

/**
 *
 * @author SMRTNIK
 */
public class PrijavaAdministratorGUI extends javax.swing.JFrame {

    public PrijavaAdministratorGUI() {
        initComponents();
        greska_L.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        korisnickoIme_TF = new javax.swing.JTextField();
        lozinka_TF = new javax.swing.JPasswordField();
        prijavi_B = new javax.swing.JButton();
        gost_L = new javax.swing.JLabel();
        greska_L = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prijavljivanje administratora sistema elektrosne biblioteke - SEB");
        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(false);

        jLabel1.setText("Korisnicko ime:");

        jLabel2.setText("Lozinka:");

        prijavi_B.setText("Prijavi se");
        prijavi_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prijavi_BActionPerformed(evt);
            }
        });

        gost_L.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        gost_L.setForeground(new java.awt.Color(102, 102, 102));
        gost_L.setText("Prijavi se kao gost ili pisac");
        gost_L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gost_LMouseClicked(evt);
            }
        });

        greska_L.setForeground(new java.awt.Color(0, 102, 204));
        greska_L.setText("greska");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prijavi_B, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gost_L))
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(korisnickoIme_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lozinka_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(greska_L, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(korisnickoIme_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lozinka_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(greska_L)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(gost_L)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prijavi_B)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//dodati legalne izraze za sifre i ostalo[a-bA-B]
//[1:30 AM]
//[a-zA-Z-0-9]{8,16}
    //dodati ubacivanje loga
    //znati sve sta se radi u sistemu
    // napraviti prijavljivanje za admina - bibliotekara, klijenta, itd, odnosno doktor, sestra, korisnik
    private void prijavi_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prijavi_BActionPerformed
        prijavi();
    }//GEN-LAST:event_prijavi_BActionPerformed

    private void gost_LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gost_LMouseClicked
        new PrijavaGostClanPisacGUI().show();
        this.setVisible(false);
    }//GEN-LAST:event_gost_LMouseClicked
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("FlatLaf Light".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrijavaAdministratorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrijavaAdministratorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrijavaAdministratorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrijavaAdministratorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrijavaAdministratorGUI().setVisible(true);
            }
        });
    }

    private void prijavi() {
        try {
            String ki = this.korisnickoIme_TF.getText();
            String l = this.lozinka_TF.getText();
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte unosL[] = md.digest(l.getBytes());

            //pogresno korisnickoime i lozinka
            if (!((ki.equals(Validacija.getKORISNIK1()) || ki.equals(Validacija.getKORISNIK2()) || ki.equals(Validacija.getKORISNIK3())) && Arrays.equals(Validacija.getPass(), unosL))) {
                greska_L.setText("pogresno korisnicko ime i lozinka");
                greska_L.setVisible(true);
            } else if (korisnickoIme_TF.getText().isEmpty() || lozinka_TF.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Potrebno je uneti sva polja!");
                //tacno korisnicko ime i pogresna lozinka
            } else if ((ki.equals(Validacija.getKORISNIK1()) || ki.equals(Validacija.getKORISNIK2()) || ki.equals(Validacija.getKORISNIK3())) && !(Arrays.equals(Validacija.getPass(), unosL))) {
                greska_L.setText("pogresna lozinka");
                greska_L.setVisible(true);
                //pogresno korisnicko ime i tacna lozinka
            } else if (!(ki.equals(Validacija.getKORISNIK1()) || ki.equals(Validacija.getKORISNIK2()) || ki.equals(Validacija.getKORISNIK3())) && Arrays.equals(Validacija.getPass(), unosL)) {
                greska_L.setText("pogresna korisnicko ime");
                greska_L.setVisible(true);
                //tacno korisnicko ime i lozinka
            } else if ((ki.equals(Validacija.getKORISNIK1()) || ki.equals(Validacija.getKORISNIK2()) || ki.equals(Validacija.getKORISNIK3())) && Arrays.equals(Validacija.getPass(), unosL)) {
                new SistemElektronskeBibliotekeGUI(korisnickoIme_TF.getText().toString(), true).show();
                this.setVisible(false);
                this.dispose();
            } else {
                System.out.println("greska");
            }

        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(PrijavaAdministratorGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gost_L;
    private javax.swing.JLabel greska_L;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JTextField korisnickoIme_TF;
    private javax.swing.JPasswordField lozinka_TF;
    private javax.swing.JButton prijavi_B;
    // End of variables declaration//GEN-END:variables
}
