package interfejs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Queue;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import osnova.Stampac;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import osnova.Dokument;

/**
 *
 * @author SMRTNIK
 */
public class MojaKnjigaGUI extends javax.swing.JFrame {

    Stack<String> undo = new Stack<>();
    Stack<String> redo = new Stack<>();
    int brojac = 0;
    Stampac p = new Stampac();

    public MojaKnjigaGUI() {
        initComponents();
        new Thread(new AutoStampa(p.getHp())).start();
        this.undo.push("");
    }

    class AutoStampa implements Runnable {

        Queue<Dokument> x;

        public AutoStampa(Queue<Dokument> x) {
            this.x = x;
        }

        @Override
        public void run() {

            while (true) {
                try {
                    while (this.x.size() > 0) {
                        Dokument x = this.x.poll();
                        try {
                            Files.write(Paths.get(x.getNazivDokumenta()), x.getSadrzajDokumenta().getBytes());
                        } catch (IOException ex) {
                            Logger.getLogger(Stampac.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        reset();
                    }
                    Thread.sleep(100000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Stampac.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        nazivfajla_TF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        sadrzajFajla_TF = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        velicinaFajla_TF = new javax.swing.JTextField();
        dodajUred_B = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        brojDokumenata_TF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dokumentiReda_CB = new javax.swing.JComboBox<>();
        obrisi_B = new javax.swing.JButton();
        prikaziSadrzaj_B = new javax.swing.JButton();
        stampaj_B = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        izlaz_MI = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        undo_MI = new javax.swing.JMenuItem();
        redo_MIđ = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pisanje knjige elektronske biblioteke - SEB");
        setResizable(false);

        jLabel1.setText("Naziv fajla:");

        sadrzajFajla_TF.setColumns(20);
        sadrzajFajla_TF.setLineWrap(true);
        sadrzajFajla_TF.setRows(5);
        sadrzajFajla_TF.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                sadrzajFajla_TFCaretUpdate(evt);
            }
        });
        jScrollPane1.setViewportView(sadrzajFajla_TF);

        jLabel2.setText("Sadrzaj fajla:");

        jLabel3.setText("Velicina datoteke:");

        dodajUred_B.setText("Dodaj dokument u red za cuvanje");
        dodajUred_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajUred_BActionPerformed(evt);
            }
        });

        jLabel4.setText("Broj dokumenata:");

        brojDokumenata_TF.setEditable(false);

        jLabel5.setText("Dokumenti u redu:");

        obrisi_B.setText("Obrisi");
        obrisi_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obrisi_BActionPerformed(evt);
            }
        });

        prikaziSadrzaj_B.setText("Prikazi sadrzaj");
        prikaziSadrzaj_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prikaziSadrzaj_BActionPerformed(evt);
            }
        });

        stampaj_B.setText("Sacuvaj");
        stampaj_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stampaj_BActionPerformed(evt);
            }
        });

        jButton1.setText("Izlaz");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Citac reci");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Izlaz");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jMenu1.setText("Datoteka");

        izlaz_MI.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        izlaz_MI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonice/ugasi.png"))); // NOI18N
        izlaz_MI.setText("Ugasi");
        izlaz_MI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izlaz_MIActionPerformed(evt);
            }
        });
        jMenu1.add(izlaz_MI);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Uredi");

        undo_MI.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        undo_MI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonice/undo.png"))); // NOI18N
        undo_MI.setText("Undo");
        undo_MI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undo_MIActionPerformed(evt);
            }
        });
        jMenu2.add(undo_MI);

        redo_MIđ.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        redo_MIđ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonice/redo.png"))); // NOI18N
        redo_MIđ.setText("Redo");
        redo_MIđ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redo_MIđActionPerformed(evt);
            }
        });
        jMenu2.add(redo_MIđ);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nazivfajla_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(velicinaFajla_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(obrisi_B, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(54, 54, 54)
                                        .addComponent(prikaziSadrzaj_B)
                                        .addGap(60, 60, 60)
                                        .addComponent(stampaj_B, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dokumentiReda_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dodajUred_B, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(brojDokumenata_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nazivfajla_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(brojDokumenata_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(velicinaFajla_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dokumentiReda_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dodajUred_B))
                    .addComponent(jLabel5))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(obrisi_B)
                    .addComponent(stampaj_B)
                    .addComponent(prikaziSadrzaj_B)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sadrzajFajla_TFCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_sadrzajFajla_TFCaretUpdate
        int vd = this.sadrzajFajla_TF.getText().length();
        this.velicinaFajla_TF.setText(String.valueOf(vd));
        if (this.sadrzajFajla_TF.getText().length() > brojac) {
            brojac = this.sadrzajFajla_TF.getText().length();
            this.undo.push(this.sadrzajFajla_TF.getText());
        } else {
        }
    }//GEN-LAST:event_sadrzajFajla_TFCaretUpdate

    private void dodajUred_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodajUred_BActionPerformed

        String podaci = nazivfajla_TF.getText();
        if (podaci.equals("")) {
            JOptionPane.showMessageDialog(this, "Trenutno nema datoteka za cuvanje!", "Obavestenje", INFORMATION_MESSAGE);
        } else {
            p.dodaj(new Dokument(this.sadrzajFajla_TF.getText(), Integer.parseInt(this.velicinaFajla_TF.getText()), this.nazivfajla_TF.getText()));
            reset();
        }
    }//GEN-LAST:event_dodajUred_BActionPerformed

    private void prikaziSadrzaj_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prikaziSadrzaj_BActionPerformed

        if (this.dokumentiReda_CB.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Trenutno nema datoteka za prikazivanje!", "Obavestenje", INFORMATION_MESSAGE);
        } else {
            Dokument x = (Dokument) this.dokumentiReda_CB.getSelectedItem();
            this.sadrzajFajla_TF.setText(x.getSadrzajDokumenta());
            this.nazivfajla_TF.setText(x.getNazivDokumenta());
        }
    }//GEN-LAST:event_prikaziSadrzaj_BActionPerformed

    private void obrisi_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obrisi_BActionPerformed

        Dokument x = (Dokument) this.dokumentiReda_CB.getSelectedItem();
        this.p.obrisi(x);
        reset();
    }//GEN-LAST:event_obrisi_BActionPerformed

    private void stampaj_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stampaj_BActionPerformed
     this.p.stampaj();
        reset();
    }//GEN-LAST:event_stampaj_BActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        new CitacGUI().show();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void izlaz_MIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izlaz_MIActionPerformed
        System.exit(0);
    }//GEN-LAST:event_izlaz_MIActionPerformed

    private void undo_MIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undo_MIActionPerformed
        if (!this.undo.empty()) {
            this.redo.push(this.undo.pop());
            if (!this.undo.empty()) {
                this.sadrzajFajla_TF.setText(this.undo.peek());
            }
        }
    }//GEN-LAST:event_undo_MIActionPerformed

    private void redo_MIđActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redo_MIđActionPerformed
        if (!this.redo.empty()) {
            this.undo.push(this.redo.pop());
            if (!this.redo.empty()) {
                this.sadrzajFajla_TF.setText(this.redo.peek());
            }
        }
    }//GEN-LAST:event_redo_MIđActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    public void reset() {
        p.dokumentiReda(dokumentiReda_CB);
        this.brojDokumenata_TF.setText(p.brojDokumenata());
        this.nazivfajla_TF.setText("");
        this.velicinaFajla_TF.setText("");
        this.sadrzajFajla_TF.setText("");
    }

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
            java.util.logging.Logger.getLogger(MojaKnjigaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MojaKnjigaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MojaKnjigaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MojaKnjigaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MojaKnjigaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField brojDokumenata_TF;
    private javax.swing.JButton dodajUred_B;
    private javax.swing.JComboBox<String> dokumentiReda_CB;
    private javax.swing.JMenuItem izlaz_MI;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nazivfajla_TF;
    private javax.swing.JButton obrisi_B;
    private javax.swing.JButton prikaziSadrzaj_B;
    private javax.swing.JMenuItem redo_MIđ;
    private javax.swing.JTextArea sadrzajFajla_TF;
    private javax.swing.JButton stampaj_B;
    private javax.swing.JMenuItem undo_MI;
    private javax.swing.JTextField velicinaFajla_TF;
    // End of variables declaration//GEN-END:variables
}
