package interfejs;

import java.awt.Desktop;
import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import osnova.Biblioteka;
import osnova.Knjiga;
import osnova.VSMD;
import osnova.Validacija;

/**
 *
 * @author SMRTNIK
 */
public class KnjigaGUI extends javax.swing.JFrame {

    private Biblioteka bib;

    public KnjigaGUI(Biblioteka bib, boolean zastavica) {
        initComponents();
        this.bib = bib;
        igre_B.setVisible(zastavica);
    }

    public static void main(String[] args) {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        vratiSe_B = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaKnjiga_T = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaDatoteka_T = new javax.swing.JTable();
        igre_B = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prikaz dostupnih knjiga - SEB");
        setResizable(false);

        vratiSe_B.setText("Izlaz");
        vratiSe_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vratiSe_BActionPerformed(evt);
            }
        });

        tabelaKnjiga_T.setAutoCreateRowSorter(true);
        tabelaKnjiga_T.setModel(new javax.swing.table.DefaultTableModel(podaciKnjiga,
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelaKnjiga_T.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaKnjiga_TMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaKnjiga_T);
        tabelaKnjiga_T.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        tabelaDatoteka_T.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Naziv", "Putanja"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaDatoteka_T.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaDatoteka_TMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabelaDatoteka_T);

        igre_B.setText("Igre");
        igre_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igre_BActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(igre_B, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(vratiSe_B, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(38, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vratiSe_B)
                    .addComponent(igre_B))
                .addGap(21, 21, 21))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(203, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    static public String[][] podaciKnjiga = {{" ", " ", " ", " "}};
    static public String[][] podaciDatoteka = {{" ", " ", " ", " "}};

    private static final long serialVersionUID = 1L;
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Dozvoljene datoteke", "ser");
    public DefaultTableModel modelTabele = new DefaultTableModel();
    private void vratiSe_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vratiSe_BActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_vratiSe_BActionPerformed

    private void tabelaKnjiga_TMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaKnjiga_TMouseClicked
        try {
            JTable jt = (JTable) evt.getSource();
            int p = jt.rowAtPoint(evt.getPoint());

            String o = podaciKnjiga[p][0];
            DefaultTableModel t2 = (DefaultTableModel) tabelaDatoteka_T.getModel();

            t2.getDataVector().removeAllElements();
            t2.fireTableDataChanged();
            Knjiga k = bib.getBookByID(Integer.parseInt(o));

            for (VSMD v : k.dobaviListuDatoteka()) {
                t2.addRow(new Object[]{v.getIme(), v.getPodaci()});
                t2.fireTableDataChanged();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Tabela je prazna!", "Obavestenje", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_tabelaKnjiga_TMouseClicked

    private void tabelaDatoteka_TMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaDatoteka_TMouseClicked
        try {
            tabelaKnjiga_T.setRowSelectionAllowed(true);
            JTable jt = (JTable) evt.getSource();
            int p = jt.rowAtPoint(evt.getPoint());
            DefaultTableModel t2 = (DefaultTableModel) tabelaDatoteka_T.getModel();
            String s = (String) t2.getValueAt(p, 1);

            File file = new File(s);
            Desktop des = Desktop.getDesktop();
            try {
                des.open(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Datoteka se vise ne nalazi na upisanoj lokaciji!", "Obavestenje", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_tabelaDatoteka_TMouseClicked

    private void igre_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igre_BActionPerformed
        new IgraonicaGUI(Validacija.KLJUCCLANAPISCAGOSTA).show();
    }//GEN-LAST:event_igre_BActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton igre_B;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tabelaDatoteka_T;
    public static javax.swing.JTable tabelaKnjiga_T;
    private javax.swing.JButton vratiSe_B;
    // End of variables declaration//GEN-END:variables

//    public void refreshTabela() {
//        podaciKnjiga = bib.toStringVector();
//        for (int i = 0; i < podaciKnjiga.length; i++) {
//            modelTabele.addRow(podaciKnjiga[i]);
//        }
//    }
//
//    public void obrisi(int id) {
//        Knjiga k = bib.getBookByID(id);
//        bib.obrisiKnjigu(k);
//    }
}
