package interfejs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

public class CitacGUI extends javax.swing.JFrame {

    public CitacGUI() {
        initComponents();
    }
    PretraziReci pr = new PretraziReci();

    public class PretraziReci {

        List<String> ls;
        List<String> recnik = new ArrayList<>();

        public PretraziReci() {
            this.ls = new ArrayList<>();
        }

        public List<String> getLs() {
            return ls;
        }

        public String pronadjiFajl() {
            JFileChooser jfc = new JFileChooser();
            jfc.showOpenDialog(jfc);
            return jfc.getSelectedFile().getAbsolutePath();
        }

        public void ucitajReci(String adr) {
            try {
                byte tekst[] = Files.readAllBytes(Paths.get(adr));
                String t = new String(tekst);
                t = t.toLowerCase();
                t = t.replace('.', ' ');
                t = t.replace(',', ' ');
                t = t.replace('?', ' ');
                t = t.replace(':', ' ');
                t = t.replace('!', ' ');
                t = t.replace('"', ' ');
                t = t.replace('<', ' ');
                t = t.replace('>', ' ');
                t = t.replace('~', ' ');
                t = t.replace('}', ' ');
                t = t.replace('{', ' ');
                t = t.replace('~', ' ');
                t = t.replace("\n", "").replace("\r", "");
                StringTokenizer st = new StringTokenizer(t, " ");
                while (st.hasMoreTokens()) {
                    this.ls.add(st.nextToken());
                }
                System.out.println("Broj reci u listi je " + this.ls.size());
            } catch (IOException ex) {
                Logger.getLogger(PretraziReci.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        public void prebrojReci(List<String> ls) {
            HashMap<String, Integer> brojacReci = new HashMap<String, Integer>();
            for (Iterator<String> iterator = ls.iterator(); iterator.hasNext();) {
                String next = iterator.next();
                if (brojacReci.containsKey(next)) {
                    brojacReci.put(next, brojacReci.get(next) + 1);
                } else {
                    brojacReci.put(next, 1);
                }
            }

            Map<String, Integer> sortiranaMapa = sortByValue(brojacReci);
            for (Map.Entry entry : sortiranaMapa.entrySet()) {
                pronadjeneReci_TA.append(entry.getKey() + "(sadrzi " + entry.getValue() + " duplikata)" + "\n");
            }

        }

        public HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) {
            // Create a list from elements of HashMap
            List<Map.Entry<String, Integer>> list
                    = new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());

            // Sort the list
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                public int compare(Map.Entry<String, Integer> o1,
                        Map.Entry<String, Integer> o2) {
                    return (o1.getValue()).compareTo(o2.getValue());
                }
            });

            // put data from sorted list to hashmap 
            HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
            for (Map.Entry<String, Integer> aa : list) {
                temp.put(aa.getKey(), aa.getValue());
            }
            return temp;
        }

        public boolean proveraDuplikata(List<String> recnik, String x) {
            boolean status = false;
            for (Iterator<String> iterator = recnik.iterator(); iterator.hasNext();) {
                String next = iterator.next();
                if (x.equals(next)) {
                    status = true;
                    break;
                }
            }
            return status;
        }

        public void generisiRecnik() {
            for (Iterator<String> iterator = ls.iterator(); iterator.hasNext();) {
                String next = iterator.next();
                if (!proveraDuplikata(recnik, next)) {
                    this.recnik.add(next);
                }
            }
        }

        public void prikaziRecnik() {
            for (Iterator<String> iterator = recnik.iterator(); iterator.hasNext();) {
                String next = iterator.next();
                System.out.println(next);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ucitaj_B = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pronadjeneReci_TA = new javax.swing.JTextArea();
        ukupanBrojReci_TF = new javax.swing.JTextField();
        brojReci_TF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        izlaz_B = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Citac reci elektronske biblioteke - SEB");
        setResizable(false);

        ucitaj_B.setText("Pronadji datoteku");
        ucitaj_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ucitaj_BActionPerformed(evt);
            }
        });

        pronadjeneReci_TA.setColumns(20);
        pronadjeneReci_TA.setRows(5);
        jScrollPane1.setViewportView(pronadjeneReci_TA);

        jLabel1.setText("Ukupan broj reci u datoteci:");

        jLabel2.setText("Broj reci u recniku:");

        izlaz_B.setText("Izlaz");
        izlaz_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izlaz_BActionPerformed(evt);
            }
        });

        jLabel3.setText("Uhvacene reci");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(brojReci_TF)
                            .addComponent(ukupanBrojReci_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(izlaz_B, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ucitaj_B, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ukupanBrojReci_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brojReci_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ucitaj_B)
                    .addComponent(izlaz_B))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ucitaj_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ucitaj_BActionPerformed
        ucitajDatoteku();
    }//GEN-LAST:event_ucitaj_BActionPerformed

    private void izlaz_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izlaz_BActionPerformed
        MojaKnjigaGUI mk = new MojaKnjigaGUI();
        mk.setFocusable(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_izlaz_BActionPerformed

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
            java.util.logging.Logger.getLogger(CitacGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CitacGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CitacGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CitacGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CitacGUI().setVisible(true);
            }
        });
    }

    private void ucitajDatoteku() {
        pronadjeneReci_TA.setText(""); //greska u pronalasku fajla
        try {
            pr.ucitajReci(pr.pronadjiFajl());
        } catch (Exception e) {
            pronadjeneReci_TA.append("Otvaranje otkazano!");
        }
        pr.prebrojReci(pr.ls);
        pr.generisiRecnik();
        pr.prikaziRecnik();
        ukupanBrojReci_TF.setText(String.valueOf(pr.ls.size()));
        brojReci_TF.setText(String.valueOf(pr.recnik.size()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField brojReci_TF;
    private javax.swing.JButton izlaz_B;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea pronadjeneReci_TA;
    private javax.swing.JButton ucitaj_B;
    private javax.swing.JTextField ukupanBrojReci_TF;
    // End of variables declaration//GEN-END:variables
}
