package interfejs.igre;

import java.util.ArrayList;
import java.util.Collections;
import osnova.KontrolerKviz;
import osnova.Sat;

/**
 *
 * @author SMRTNIK
 */
public class Kviz extends javax.swing.JFrame {

    Thread t;
    public boolean zastavica;

    public Kviz(boolean zastavica) {
        initComponents();
        Sat s = new Sat(digitalniSat_L);
        t = new Thread(s);
        t.start();
        this.zastavica = zastavica;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        obavestenje_L = new javax.swing.JDialog();
        novaigra2_B = new javax.swing.JButton();
        napomena_L = new java.awt.Label();
        ugasi_B = new javax.swing.JButton();
        rezultatNapomena_L = new java.awt.Label();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        tekst2_RB = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        tekst1_RB = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        digitalniSat_L = new javax.swing.JLabel();
        tekst3_RB = new javax.swing.JRadioButton();
        tekst4_RB = new javax.swing.JRadioButton();
        rezultat_TF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaKviz_TA = new javax.swing.JTextArea();
        potvrdi_B = new javax.swing.JButton();
        zapocni_B = new javax.swing.JButton();
        brojPitanja_TF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        obavestenje_L.setTitle("Obavestenje");
        obavestenje_L.setAlwaysOnTop(true);
        obavestenje_L.setForeground(java.awt.Color.gray);
        obavestenje_L.setLocation(new java.awt.Point(50, 50));
        obavestenje_L.setName("caixaAlerta"); // NOI18N
        obavestenje_L.setResizable(false);
        obavestenje_L.setSize(new java.awt.Dimension(350, 250));
        obavestenje_L.setType(java.awt.Window.Type.POPUP);

        novaigra2_B.setText("Nova igra");
        novaigra2_B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                novaigra2_BMousePressed(evt);
            }
        });
        novaigra2_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaigra2_BActionPerformed(evt);
            }
        });

        napomena_L.setAlignment(java.awt.Label.CENTER);
        napomena_L.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        napomena_L.setName(""); // NOI18N
        napomena_L.setText("Obavestenje");

        ugasi_B.setText("Izlaz");
        ugasi_B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ugasi_BMousePressed(evt);
            }
        });
        ugasi_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ugasi_BActionPerformed(evt);
            }
        });

        rezultatNapomena_L.setAlignment(java.awt.Label.CENTER);
        rezultatNapomena_L.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        rezultatNapomena_L.setName(""); // NOI18N
        rezultatNapomena_L.setText("Obavestenje");

        javax.swing.GroupLayout obavestenje_LLayout = new javax.swing.GroupLayout(obavestenje_L.getContentPane());
        obavestenje_L.getContentPane().setLayout(obavestenje_LLayout);
        obavestenje_LLayout.setHorizontalGroup(
            obavestenje_LLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(napomena_L, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(obavestenje_LLayout.createSequentialGroup()
                .addGroup(obavestenje_LLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(obavestenje_LLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rezultatNapomena_L, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(obavestenje_LLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(novaigra2_B)
                        .addGap(82, 82, 82)
                        .addComponent(ugasi_B)
                        .addGap(0, 86, Short.MAX_VALUE)))
                .addContainerGap())
        );
        obavestenje_LLayout.setVerticalGroup(
            obavestenje_LLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(obavestenje_LLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(napomena_L, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rezultatNapomena_L, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(obavestenje_LLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novaigra2_B)
                    .addComponent(ugasi_B))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kviz sistema elektrosne biblioteke - SEB");
        setResizable(false);

        jLabel8.setText("4.");

        buttonGroup1.add(tekst2_RB);
        tekst2_RB.setText("odgovor b");

        jLabel1.setText("sistema elektrosnke biblioteke");

        buttonGroup1.add(tekst1_RB);
        tekst1_RB.setText("odgovor a");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("java");

        digitalniSat_L.setText("(sat)");

        buttonGroup1.add(tekst3_RB);
        tekst3_RB.setText("odgovor c");

        buttonGroup1.add(tekst4_RB);
        tekst4_RB.setText("odgovor d");

        rezultat_TF.setText("Vas rezultat: ");

        tabelaKviz_TA.setColumns(20);
        tabelaKviz_TA.setLineWrap(true);
        tabelaKviz_TA.setRows(5);
        tabelaKviz_TA.setWrapStyleWord(true);
        jScrollPane1.setViewportView(tabelaKviz_TA);

        potvrdi_B.setText("Potvrdi");
        potvrdi_B.setEnabled(false);
        potvrdi_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potvrdi_BActionPerformed(evt);
            }
        });

        zapocni_B.setText("Zapocnite");
        zapocni_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zapocni_BActionPerformed(evt);
            }
        });

        jLabel5.setText("1.");

        jLabel6.setText("3.");

        jLabel7.setText("2.");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setText("KVIZ");

        jLabel4.setText("izadji");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(48, 48, 48)
                        .addComponent(rezultat_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(digitalniSat_L))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(brojPitanja_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tekst1_RB, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tekst3_RB, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tekst4_RB, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tekst2_RB, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(zapocni_B, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(potvrdi_B, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rezultat_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(digitalniSat_L))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(brojPitanja_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tekst1_RB, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zapocni_B)
                    .addComponent(jLabel7)
                    .addComponent(tekst2_RB, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tekst3_RB, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(potvrdi_B)
                    .addComponent(jLabel8)
                    .addComponent(tekst4_RB, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     int brojPitanja = 1;
    int rezultat = 0;
    private void zapocni_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zapocni_BActionPerformed
        if (this.zastavica) {
            System.out.println(b);
        }
        zapocni(this.brojPitanja);
        zapocni_B.setEnabled(false);
        potvrdi_B.setEnabled(true);
    }//GEN-LAST:event_zapocni_BActionPerformed

    private void potvrdi_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potvrdi_BActionPerformed
        KontrolerKviz kontroler = new KontrolerKviz();
        if (this.brojPitanja != 15 || this.brojPitanja <= 15) {
            if (tekst1_RB.isSelected()) {
                for (int i = 0; i < kontroler.getKLJUCEVIKVIZA().length; i++) {
                    if (tekst1_RB.getText().equals(kontroler.getKLJUCEVIKVIZA()[i])) {
                        ++this.rezultat;
                        System.out.println(this.rezultat);
                        zapocni(this.brojPitanja);
                        rezultat_TF.setText("Vas rezultat:   " + this.rezultat);
                    }
                }
                ++brojPitanja;
                clearSelection();
                zapocni(brojPitanja);
                brojPitanja_TF.setText(String.valueOf(this.brojPitanja));
            } else if (tekst2_RB.isSelected()) {
                for (int i = 0; i < kontroler.getKLJUCEVIKVIZA().length; i++) {
                    if (tekst2_RB.getText().equals(kontroler.getKLJUCEVIKVIZA()[i])) {
                        ++this.rezultat;
                        System.out.println(this.rezultat);
                        zapocni(this.brojPitanja);
                        rezultat_TF.setText("Vas rezultat:   " + this.rezultat);
                    }
                }
                ++brojPitanja;
                clearSelection();
                zapocni(brojPitanja);
                brojPitanja_TF.setText(String.valueOf(this.brojPitanja));
            } else if (tekst3_RB.isSelected()) {
                for (int i = 0; i < kontroler.getKLJUCEVIKVIZA().length; i++) {
                    if (tekst3_RB.getText().equals(kontroler.getKLJUCEVIKVIZA()[i])) {
                        ++this.rezultat;

                        System.out.println(this.rezultat);
                        zapocni(this.brojPitanja);
                        rezultat_TF.setText("Vas rezultat:   " + this.rezultat);
                    }
                }
                ++brojPitanja;
                clearSelection();
                zapocni(brojPitanja);
                brojPitanja_TF.setText(String.valueOf(this.brojPitanja));
            } else if (tekst4_RB.isSelected()) {
                for (int i = 0; i < kontroler.getKLJUCEVIKVIZA().length; i++) {
                    if (tekst4_RB.getText().equals(kontroler.getKLJUCEVIKVIZA()[i])) {
                        ++this.rezultat;
                        System.out.println(this.rezultat);
                        zapocni(this.brojPitanja);
                        rezultat_TF.setText("Vas rezultat:   " + this.rezultat);
                    }
                }
                clearSelection();
                ++brojPitanja;
                zapocni(brojPitanja);
                brojPitanja_TF.setText(String.valueOf(this.brojPitanja));
            }
            if (this.brojPitanja == 16) {
                brojPitanja_TF.setText("15");
                if (this.rezultat <= 8) {
                    napomena_L.setText("Lose!");
                    rezultatNapomena_L.setText("Vas rezultat je:   " + this.rezultat);
                    obavestenje_L.setVisible(true);
                } else if (this.rezultat >= 8 && this.rezultat <= 11) {
                    napomena_L.setText("Dobro!");
                    rezultatNapomena_L.setText("Vas rezultat je:   " + this.rezultat);
                    obavestenje_L.setVisible(true);
                } else if (this.rezultat >= 15) {
                    napomena_L.setText("Odlicno!");
                    rezultatNapomena_L.setText("Vas rezultat je:   " + this.rezultat);
                    obavestenje_L.setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_potvrdi_BActionPerformed
    public void clearSelection() {
        buttonGroup1.clearSelection();
    }
    private void novaigra2_BMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novaigra2_BMousePressed
        this.brojPitanja = 1;
        this.rezultat = 0;
        zapocni(this.brojPitanja);
        potvrdi_B.setEnabled(false);
        zapocni_B.setEnabled(true);
        zapocni_B.setVisible(true);
        obavestenje_L.setVisible(false);
    }//GEN-LAST:event_novaigra2_BMousePressed

    private void novaigra2_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaigra2_BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_novaigra2_BActionPerformed

    private void ugasi_BMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ugasi_BMousePressed
        this.setVisible(false);
    }//GEN-LAST:event_ugasi_BMousePressed

    private void ugasi_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ugasi_BActionPerformed
        this.setVisible(false);
        this.dispose();
        obavestenje_L.setVisible(false);
    }//GEN-LAST:event_ugasi_BActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(Kviz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kviz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kviz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kviz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kviz(true).setVisible(true);
            }
        });
    }
    ArrayList<Integer> b = dobijNiz(15);

    public void zapocni(int brojPitanja) {
        KontrolerKviz k = new KontrolerKviz();
        ArrayList<Integer> birac = new ArrayList<>();
        ArrayList<ArrayList<String>> s = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            s.add(k.odaberiIgru(b.get(i)));
        }
        for (int i = 1; i < 5; i++) {
            birac.add(i);
        }
        switch (brojPitanja) {
            case 1:
                Collections.shuffle(birac);
                tabelaKviz_TA.setText(s.get(0).get(0));
                tekst1_RB.setText(s.get(0).get(birac.get(0)));
                tekst2_RB.setText(s.get(0).get(birac.get(1)));
                tekst3_RB.setText(s.get(0).get(birac.get(2)));
                tekst4_RB.setText(s.get(0).get(birac.get(3)));
                rezultat_TF.setText("Vas rezultat:   " + rezultat);
                brojPitanja_TF.setText(String.valueOf(this.brojPitanja));
                this.zapocni_B.setVisible(false);
                break;

            case 2:
                Collections.shuffle(birac);
                tabelaKviz_TA.setText(s.get(1).get(0));
                tekst1_RB.setText(s.get(1).get(birac.get(0)));
                tekst2_RB.setText(s.get(1).get(birac.get(1)));
                tekst3_RB.setText(s.get(1).get(birac.get(2)));
                tekst4_RB.setText(s.get(1).get(birac.get(3)));
                break;

            case 3:
                Collections.shuffle(birac);
                tabelaKviz_TA.setText(s.get(2).get(0));
                tekst1_RB.setText(s.get(2).get(birac.get(0)));
                tekst2_RB.setText(s.get(2).get(birac.get(1)));
                tekst3_RB.setText(s.get(2).get(birac.get(2)));
                tekst4_RB.setText(s.get(2).get(birac.get(3)));
                break;

            case 4:
                Collections.shuffle(birac);
                tabelaKviz_TA.setText(s.get(3).get(0));
                tekst1_RB.setText(s.get(3).get(birac.get(0)));
                tekst2_RB.setText(s.get(3).get(birac.get(1)));
                tekst3_RB.setText(s.get(3).get(birac.get(2)));
                tekst4_RB.setText(s.get(3).get(birac.get(3)));
                break;

            case 5:
                Collections.shuffle(birac);
                tabelaKviz_TA.setText(s.get(4).get(0));
                tekst1_RB.setText(s.get(4).get(birac.get(0)));
                tekst2_RB.setText(s.get(4).get(birac.get(1)));
                tekst3_RB.setText(s.get(4).get(birac.get(2)));
                tekst4_RB.setText(s.get(4).get(birac.get(3)));
                break;

            case 6:
                Collections.shuffle(birac);
                tabelaKviz_TA.setText(s.get(5).get(0));
                tekst1_RB.setText(s.get(5).get(birac.get(0)));
                tekst2_RB.setText(s.get(5).get(birac.get(1)));
                tekst3_RB.setText(s.get(5).get(birac.get(2)));
                tekst4_RB.setText(s.get(5).get(birac.get(3)));
                break;
            case 7:
                Collections.shuffle(birac);
                tabelaKviz_TA.setText(s.get(6).get(0));
                tekst1_RB.setText(s.get(6).get(birac.get(0)));
                tekst2_RB.setText(s.get(6).get(birac.get(1)));
                tekst3_RB.setText(s.get(6).get(birac.get(2)));
                tekst4_RB.setText(s.get(6).get(birac.get(3)));
                break;

            case 8:
                Collections.shuffle(birac);
                tabelaKviz_TA.setText(s.get(7).get(0));
                tekst1_RB.setText(s.get(7).get(birac.get(0)));
                tekst2_RB.setText(s.get(7).get(birac.get(1)));
                tekst3_RB.setText(s.get(7).get(birac.get(2)));
                tekst4_RB.setText(s.get(7).get(birac.get(3)));
                break;
            case 9:
                Collections.shuffle(birac);
                tabelaKviz_TA.setText(s.get(8).get(0));
                tekst1_RB.setText(s.get(8).get(birac.get(0)));
                tekst2_RB.setText(s.get(8).get(birac.get(1)));
                tekst3_RB.setText(s.get(8).get(birac.get(2)));
                tekst4_RB.setText(s.get(8).get(birac.get(3)));
                break;
            case 10:
                Collections.shuffle(birac);
                tabelaKviz_TA.setText(s.get(9).get(0));
                tekst1_RB.setText(s.get(9).get(birac.get(0)));
                tekst2_RB.setText(s.get(9).get(birac.get(1)));
                tekst3_RB.setText(s.get(9).get(birac.get(2)));
                tekst4_RB.setText(s.get(9).get(birac.get(3)));
                break;
            case 11:
                Collections.shuffle(birac);
                tabelaKviz_TA.setText(s.get(10).get(0));
                tekst1_RB.setText(s.get(10).get(birac.get(0)));
                tekst2_RB.setText(s.get(10).get(birac.get(1)));
                tekst3_RB.setText(s.get(10).get(birac.get(2)));
                tekst4_RB.setText(s.get(10).get(birac.get(3)));
                break;
            case 12:
                Collections.shuffle(birac);
                tabelaKviz_TA.setText(s.get(11).get(0));
                tekst1_RB.setText(s.get(11).get(birac.get(0)));
                tekst2_RB.setText(s.get(11).get(birac.get(1)));
                tekst3_RB.setText(s.get(11).get(birac.get(2)));
                tekst4_RB.setText(s.get(11).get(birac.get(3)));
                break;
            case 13:
                Collections.shuffle(birac);
                tabelaKviz_TA.setText(s.get(12).get(0));
                tekst1_RB.setText(s.get(12).get(birac.get(0)));
                tekst2_RB.setText(s.get(12).get(birac.get(1)));
                tekst3_RB.setText(s.get(12).get(birac.get(2)));
                tekst4_RB.setText(s.get(12).get(birac.get(3)));
                break;
            case 14:
                Collections.shuffle(birac);
                tabelaKviz_TA.setText(s.get(13).get(0));
                tekst1_RB.setText(s.get(13).get(birac.get(0)));
                tekst2_RB.setText(s.get(13).get(birac.get(1)));
                tekst3_RB.setText(s.get(13).get(birac.get(2)));
                tekst4_RB.setText(s.get(13).get(birac.get(3)));
                break;
            case 15:
                Collections.shuffle(birac);
                tabelaKviz_TA.setText(s.get(14).get(0));
                tekst1_RB.setText(s.get(14).get(birac.get(0)));
                tekst2_RB.setText(s.get(14).get(birac.get(1)));
                tekst3_RB.setText(s.get(14).get(birac.get(2)));
                tekst4_RB.setText(s.get(14).get(birac.get(3)));
                break;
        }
    }

    public static ArrayList<Integer> dobijNiz(int ma) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for (int i = 1; i < ma + 1; i++) {
            lista.add(i);
        }
        Collections.shuffle(lista);
        return lista;
    }

    private void potvrdi() {

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField brojPitanja_TF;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel digitalniSat_L;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label napomena_L;
    private javax.swing.JButton novaigra2_B;
    private javax.swing.JDialog obavestenje_L;
    private javax.swing.JButton potvrdi_B;
    private java.awt.Label rezultatNapomena_L;
    private javax.swing.JTextField rezultat_TF;
    public static javax.swing.JTextArea tabelaKviz_TA;
    private javax.swing.JRadioButton tekst1_RB;
    private javax.swing.JRadioButton tekst2_RB;
    private javax.swing.JRadioButton tekst3_RB;
    private javax.swing.JRadioButton tekst4_RB;
    private javax.swing.JButton ugasi_B;
    private javax.swing.JButton zapocni_B;
    // End of variables declaration//GEN-END:variables
}
