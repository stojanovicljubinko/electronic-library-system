package interfejs;

import static interfejs.KnjigaGUI.podaciKnjiga;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import osnova.Biblioteka;
import osnova.Knjiga;
import osnova.Konzola;
import osnova.Sat;
import osnova.TabelarniPomocnik;
import osnova.VSMD;
import osnova.Validacija;

/**
 *
 * @author SMRTNIK
 */
public class SistemElektronskeBibliotekeGUI extends javax.swing.JFrame implements TabelarniPomocnik {

    Thread t;
    public static boolean kljuc = true;

    public SistemElektronskeBibliotekeGUI(String ime, boolean zastavica) {
        initComponents();
        Sat s = new Sat(digitalniSat_L);
        t = new Thread(s);
        t.start();
        ID_TF.setText("1");
        korisnikStatus_RB.setText(ime);
        if (zastavica) {
            Konzola k = new Konzola();
            Thread ko = new Thread(k);
            ko.start();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ID_L = new javax.swing.JLabel();
        naslov_L = new javax.swing.JLabel();
        autor_L = new javax.swing.JLabel();
        cena_L = new javax.swing.JLabel();
        datoteka_L = new javax.swing.JLabel();
        konzola_L = new javax.swing.JLabel();
        pretrazi_B = new javax.swing.JButton();
        dodajDatoteku_B = new javax.swing.JButton();
        dodajknjigu_B = new javax.swing.JButton();
        ID_TF = new javax.swing.JTextField();
        naslov_TF = new javax.swing.JTextField();
        autor_TF = new javax.swing.JTextField();
        cena_TF = new javax.swing.JTextField();
        datoteka_TF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        konzola_TA = new javax.swing.JTextArea();
        prikaziSveKnjige_B = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        korisnikStatus_RB = new javax.swing.JRadioButton();
        digitalniSat_L = new javax.swing.JLabel();
        pogledajKnjige_B = new javax.swing.JButton();
        napisiKnjigu_B = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        file_M = new javax.swing.JMenu();
        sacuvaj_MI = new javax.swing.JMenuItem();
        sacuvajIIzadji_MI = new javax.swing.JMenuItem();
        otvori_MI = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        izadji_MI = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistem elektronske biblioteke - SEB");
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });

        ID_L.setText("Unesite ID: ");

        naslov_L.setText("Unesite naslov knjige: ");

        autor_L.setText("Unesite autora knjige:");

        cena_L.setText("Unesite cena knjige:");

        datoteka_L.setText("Unesite datoteku:");

        konzola_L.setText("Konzola");

        pretrazi_B.setText("Pretrazi");
        pretrazi_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pretrazi_BActionPerformed(evt);
            }
        });

        dodajDatoteku_B.setText("Dodaj datoteku");
        dodajDatoteku_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajDatoteku_BActionPerformed(evt);
            }
        });

        dodajknjigu_B.setText("Dodaj knjigu");
        dodajknjigu_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajknjigu_BActionPerformed(evt);
            }
        });

        ID_TF.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                ID_TFCaretUpdate(evt);
            }
        });

        datoteka_TF.setText("Opciono");

        konzola_TA.setEditable(false);
        konzola_TA.setColumns(20);
        konzola_TA.setRows(5);
        jScrollPane1.setViewportView(konzola_TA);

        prikaziSveKnjige_B.setText("Prikazi sve knjige");
        prikaziSveKnjige_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prikaziSveKnjige_BActionPerformed(evt);
            }
        });

        jLabel1.setText("Aktivni korisnik:");

        korisnikStatus_RB.setSelected(true);
        korisnikStatus_RB.setText("Aktivan");
        korisnikStatus_RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                korisnikStatus_RBActionPerformed(evt);
            }
        });

        digitalniSat_L.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        digitalniSat_L.setText("(sat)");

        pogledajKnjige_B.setText("Pogledaj knjige");
        pogledajKnjige_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pogledajKnjige_BActionPerformed(evt);
            }
        });

        napisiKnjigu_B.setText("Napisi knjigu");
        napisiKnjigu_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                napisiKnjigu_BActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(konzola_L)
                                    .addComponent(autor_L))
                                .addGap(267, 267, 267))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(prikaziSveKnjige_B)
                                    .addGap(18, 18, 18)
                                    .addComponent(napisiKnjigu_B, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(pogledajKnjige_B))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(naslov_L)
                                    .addGap(18, 18, 18)
                                    .addComponent(ID_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(naslov_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ID_L)
                                            .addComponent(cena_L)
                                            .addComponent(datoteka_L))
                                        .addGap(29, 29, 29))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(dodajknjigu_B)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(autor_TF)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(pretrazi_B, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(dodajDatoteku_B))
                                    .addComponent(cena_TF)
                                    .addComponent(datoteka_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(22, 22, 22)))
                .addGap(56, 56, 56)
                .addComponent(digitalniSat_L, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(korisnikStatus_RB))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID_L)
                    .addComponent(ID_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(naslov_L)
                    .addComponent(naslov_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(autor_L)
                    .addComponent(autor_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cena_L)
                    .addComponent(cena_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datoteka_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datoteka_L))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pretrazi_B)
                    .addComponent(dodajDatoteku_B)
                    .addComponent(dodajknjigu_B))
                .addGap(18, 18, 18)
                .addComponent(konzola_L)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prikaziSveKnjige_B)
                    .addComponent(napisiKnjigu_B)
                    .addComponent(pogledajKnjige_B)
                    .addComponent(digitalniSat_L))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(korisnikStatus_RB, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(588, Short.MAX_VALUE)))
        );

        file_M.setText("Datoteka");

        sacuvaj_MI.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        sacuvaj_MI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonice/sacuvaj.png"))); // NOI18N
        sacuvaj_MI.setText("Sacuvaj");
        sacuvaj_MI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sacuvaj_MIActionPerformed(evt);
            }
        });
        file_M.add(sacuvaj_MI);

        sacuvajIIzadji_MI.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        sacuvajIIzadji_MI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonice/sacuvajIzadji.png"))); // NOI18N
        sacuvajIIzadji_MI.setText("Sacuvaj i izadji");
        sacuvajIIzadji_MI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sacuvajIIzadji_MIActionPerformed(evt);
            }
        });
        file_M.add(sacuvajIIzadji_MI);

        otvori_MI.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        otvori_MI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonice/datoteka.png"))); // NOI18N
        otvori_MI.setText("Otvori");
        otvori_MI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otvori_MIActionPerformed(evt);
            }
        });
        file_M.add(otvori_MI);
        file_M.add(jSeparator2);

        izadji_MI.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        izadji_MI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonice/ugasi.png"))); // NOI18N
        izadji_MI.setText("Ugasi");
        izadji_MI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izadji_MIActionPerformed(evt);
            }
        });
        file_M.add(izadji_MI);

        jMenuBar1.add(file_M);

        jMenu1.setText("Profili");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonice/pisac.png"))); // NOI18N
        jMenuItem1.setText("Pisci");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonice/clanovi.png"))); // NOI18N
        jMenuItem2.setText("Clanovi");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Dodaci");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonice/emotikon.png"))); // NOI18N
        jMenuItem3.setText("Igre");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //promenjive
    private static final long serialVersionUID = 1L;
    private Biblioteka bib = new Biblioteka();
    private List<VSMD> vsmdCache = new ArrayList<>();
    private String putanja = "";

    //promenjive - rad sa datotekama
    private File vsmdFile;
    private File bibFile;
    private String[] validFileTypes = {".wav", ".mp3", ".mp4", ".png", ".jpeg", ".docx", ".pdf"};

    //promenjive jframe
    private SistemElektronskeBibliotekeGUI screen;
    private PrijavaAdministratorGUI p = new PrijavaAdministratorGUI();

    //dodavanje
    @Override
    public void dodaj() { //dodajVSMDatotekeIzVSMCacheUKnjiguIDodajKnjiguUBiblioteku

        //promenjive
        int ID = 0;
        double cena = 0.0;
        Knjiga k = new Knjiga();

        //ukoliko se desi da korisnik ne unese odredjeno polje, korisnik ce dobiti odgovarajucu poruku
        if (Validacija.ispunjeno(ID_TF.getText(), autor_TF.getText(), cena_TF.getText())) { //nece se izvrsiti ukoliko sva polja nisu popunjena
            try { //nece se izvrsiti ukoliko ID ili cena nisu broj
                ID = Integer.parseInt(ID_TF.getText().trim());
                cena = Double.parseDouble(cena_TF.getText().trim());

                //ukoliko ID postoji trenutno (postoji knjiga sa tim ID-om, onda ce korisnik dobiti odgovarajucu poruku
                if (bib.daLiIDPostojiTrenutno(ID)) {
                    JOptionPane.showMessageDialog(screen, ID + " vec postoji!\nUnesite drugi ID.", "Obavestenje", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    //upis podataka u knjigu i dodavanje datoteka iz vsmdCache u knjigu (objekat klase Knjiga)
                    k = new Knjiga(ID, naslov_TF.getText().trim(), autor_TF.getText().trim(), cena, (ArrayList<VSMD>) vsmdCache);
                    for (int i = 0; i < vsmdCache.size(); i++) {
                        k.addVSMD(vsmdCache.get(i));
                    }
                    //dodavanje knjige (objekta klase Knjiga u Biblioteku)
                    bib.dodajKnjigu(k);
                    ocisti(); //vraca sve na pocetne vrednosti
                    {
                        //povecava ID za jedan
                        ID_TF.setText(String.valueOf(Validacija.povecaj(ID)));
                    }
                    konzola_TA.append(k.getNazivPisca() + " - " + k.getNazivKnjige() + " je dodata u biblioteku!\n");
                }
                //ako cena ili id nisu broj - catch
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(screen, "ID ili cena nisu broj!", "Obavestenje", JOptionPane.INFORMATION_MESSAGE);
            }
            //ako polja nisu popunjena - catch
        } else {
            JOptionPane.showMessageDialog(screen, "Popunite sva polja koja nisu opciona!", "Obavestenje", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    private void dodajknjigu_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodajknjigu_BActionPerformed
        dodaj();
        refreshTabela();
    }//GEN-LAST:event_dodajknjigu_BActionPerformed

    private void pretrazi_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pretrazi_BActionPerformed
        setVSMD();
    }//GEN-LAST:event_pretrazi_BActionPerformed

    private void dodajDatoteku_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodajDatoteku_BActionPerformed
        addVSMDChache();
    }//GEN-LAST:event_dodajDatoteku_BActionPerformed

    private void prikaziSveKnjige_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prikaziSveKnjige_BActionPerformed
        String reci = konzola_TA.getText().trim(); //uzima podatke iz konzole
        if (bib == null || reci.equals("")) { //ukoliko je Biblioteka prazna ili ukoliko konzola nema nista u sebi nece prikazati knjige
            JOptionPane.showMessageDialog(screen, "Nema ni jedne knjige u biblioteci!", "Obavestenje", JOptionPane.INFORMATION_MESSAGE);
        } else {
            prikaziKnjige();
            refreshTabela();
        }
    }//GEN-LAST:event_prikaziSveKnjige_BActionPerformed

    private void sacuvaj_MIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sacuvaj_MIActionPerformed
        sacuvaj();
    }//GEN-LAST:event_sacuvaj_MIActionPerformed

    private void sacuvajIIzadji_MIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sacuvajIIzadji_MIActionPerformed
        sacuvajIIzadji();
    }//GEN-LAST:event_sacuvajIIzadji_MIActionPerformed

    private void izadji_MIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izadji_MIActionPerformed
        System.exit(0);
    }//GEN-LAST:event_izadji_MIActionPerformed

    private void ID_TFCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_ID_TFCaretUpdate

    }//GEN-LAST:event_ID_TFCaretUpdate

    private void korisnikStatus_RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_korisnikStatus_RBActionPerformed
        //ako se klikne na rbutton - simulira odjavu
        if (!korisnikStatus_RB.isSelected()) {
            p.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_korisnikStatus_RBActionPerformed

    private void otvori_MIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otvori_MIActionPerformed
        ucitajDatotekeBiblioteke();
        refreshTabela();
    }//GEN-LAST:event_otvori_MIActionPerformed

    private void pogledajKnjige_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pogledajKnjige_BActionPerformed
        String podaci = konzola_TA.getText();
        //ako biblioteka sadrzi nesto otvorice prozor sa prikazom knjiga
        if (!podaci.equals("") && bib != null) {
            new KnjigaGUI(bib, false).show();
            konzola_TA.append("Otvoren odeljak za prikazivanje knjiga.\n");
            refreshTabela();
        } else {
            //ukoliko je biblioteka prazna
            JOptionPane.showMessageDialog(screen, "Konzola je prazna, molimo vas dodajte nove knjige ili otvorite prethodno stanje aplikacije.\n", "Obavestenje", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_pogledajKnjige_BActionPerformed

    private void napisiKnjigu_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_napisiKnjigu_BActionPerformed
        konzola_TA.append("Otvoren odeljak za pisanje knjiga.\n");
        new MojaKnjigaGUI().show();
    }//GEN-LAST:event_napisiKnjigu_BActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new ClanoviGUI().show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new PisciGUI().show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        prikaziSveKnjige_B.setEnabled(false);
        pogledajKnjige_B.setEnabled(false);
    }//GEN-LAST:event_formWindowLostFocus

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        prikaziSveKnjige_B.setEnabled(true);
        pogledajKnjige_B.setEnabled(true);
    }//GEN-LAST:event_formWindowGainedFocus

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new IgraonicaGUI(Validacija.KLJUCADMINA).show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ID_L;
    private javax.swing.JTextField ID_TF;
    private javax.swing.JLabel autor_L;
    private javax.swing.JTextField autor_TF;
    private javax.swing.JLabel cena_L;
    private javax.swing.JTextField cena_TF;
    private javax.swing.JLabel datoteka_L;
    private javax.swing.JTextField datoteka_TF;
    private javax.swing.JLabel digitalniSat_L;
    private javax.swing.JButton dodajDatoteku_B;
    private javax.swing.JButton dodajknjigu_B;
    private javax.swing.JMenu file_M;
    private javax.swing.JMenuItem izadji_MI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel konzola_L;
    private javax.swing.JTextArea konzola_TA;
    private javax.swing.JRadioButton korisnikStatus_RB;
    private javax.swing.JButton napisiKnjigu_B;
    private javax.swing.JLabel naslov_L;
    private javax.swing.JTextField naslov_TF;
    private javax.swing.JMenuItem otvori_MI;
    private javax.swing.JButton pogledajKnjige_B;
    private javax.swing.JButton pretrazi_B;
    public javax.swing.JButton prikaziSveKnjige_B;
    private javax.swing.JMenuItem sacuvajIIzadji_MI;
    private javax.swing.JMenuItem sacuvaj_MI;
    // End of variables declaration//GEN-END:variables

    private void setVSMD() {
        JFileChooser chooser = new JFileChooser();
        //postavljanje parametara dozvoljenih tipova podataka
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Dozvoljene datoteke", "wav", "mp3", "mp4", "png", "jpeg", "docx", "pdf");
        chooser.addChoosableFileFilter(filter);
        chooser.setFileFilter(filter);

        int rezultatCode = chooser.showOpenDialog(screen);
        if (rezultatCode == JFileChooser.APPROVE_OPTION) {
            vsmdFile = chooser.getSelectedFile();
            putanja = String.valueOf(chooser.getSelectedFile());
            datoteka_TF.setText(vsmdFile.getName());
        }
    }

    private void addVSMDChache() {
        if (vsmdFile != null) {
            for (int i = 0; i < validFileTypes.length; i++) {
                if (datoteka_TF.getText().trim().endsWith(validFileTypes[i])) {
                    byte[] podaci = new byte[(int) vsmdFile.length()];
                    try {
                        FileInputStream fis = new FileInputStream(vsmdFile);
                        fis.read(podaci);
                        fis.close();
                    } catch (FileNotFoundException ex) {
                        //greska u pronalasku fajla
                        JOptionPane.showMessageDialog(screen, "Datoteka nije pronadjena", "Obavestenje", JOptionPane.INFORMATION_MESSAGE);
                    } catch (IOException ex) {
                        //greska u citanju fajla
                        JOptionPane.showMessageDialog(screen, "Datoteka nije pronadjena", "Obavestenje", JOptionPane.INFORMATION_MESSAGE);
                    }

                    VSMD v = new VSMD(datoteka_TF.getText().trim(), putanja);
                    vsmdCache.add(v); //dodavanje objekta VSMD u csmdCache
                    vsmdFile = null; //stavljanje vsm file na null
                    konzola_TA.append(datoteka_TF.getText() + " je spreman da bude dodat u knjigu!\n");
                    datoteka_TF.setText("");
                    //zavrsi metod upravo ovde
                    return;
                }
            }
            String validFileRypeReminder = "Dozvoljeni tipovi datoteka su: .wav, .mp3, .mp4, .png, .jpeg, .docx, .pdf";
            JOptionPane.showMessageDialog(screen, datoteka_TF.getText() + " nije dozvoljen tip datoteke!" + "\n" + validFileRypeReminder);
        } else {
            JOptionPane.showMessageDialog(screen, "Nešto je pošlo po zlu!\nPokusajte ponovo izabrati vasu datoteku.\n", "Obavestenje", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void prikaziKnjige() {
        konzola_TA.append(" -------------------------------\n");
        konzola_TA.append("Ispisivanje svih knjiga iz biblioteke:\n ");
        konzola_TA.append(bib.toString());
    }

    private void sacuvaj() {
        String imeDatoteke = JOptionPane.showInputDialog(screen, "Unesite ime datoteke za cuvanje: ", "Save", JOptionPane.INFORMATION_MESSAGE); //dobavljanje imena datoteke koja se cuva
        if (imeDatoteke != null) {
            if (!imeDatoteke.trim().contentEquals("")) {
                try {
                    FileOutputStream fos = new FileOutputStream(imeDatoteke + ".ser");
                    ObjectOutputStream out = new ObjectOutputStream(fos);
                    out.writeObject(bib);
                    fos.close();
                    out.close();
                    konzola_TA.append("Uspesno sacuvana trenutna biblioteka knjiga.\n");
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(SistemElektronskeBibliotekeGUI.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(SistemElektronskeBibliotekeGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                konzola_TA.append("Cuvanje je zaustavljeno!\n");
            }
        } else {
            konzola_TA.append("Cuvanje je zaustavljeno!\n");
        }
    }

    private void sacuvajIIzadji() {
        sacuvaj();
        System.exit(0);
    }

    protected void ucitajDatotekeBiblioteke() {
        FileFilter filter = new FileNameExtensionFilter("Dozvoljene datoteke", "ser");
        JFileChooser chooser = new JFileChooser();
        chooser.addChoosableFileFilter(filter);
        chooser.setFileFilter(filter);
        int rezultatCode = chooser.showOpenDialog(screen);
        if (rezultatCode == JFileChooser.APPROVE_OPTION) {

            bibFile = chooser.getSelectedFile();
            try {
                FileInputStream fis = new FileInputStream(bibFile);
                ObjectInputStream ois = new ObjectInputStream(fis);
                bib = (Biblioteka) ois.readObject();
                konzola_TA.append("Uspesno ucitana biblioteka knjiga.\n");
                ois.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(SistemElektronskeBibliotekeGUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(SistemElektronskeBibliotekeGUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(SistemElektronskeBibliotekeGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void refreshTabela() {
        KnjigaGUI k = new KnjigaGUI(bib, false);
        podaciKnjiga = bib.toStringVector();
        for (int i = 0; i < podaciKnjiga.length; i++) {
            k.modelTabele.addRow(podaciKnjiga[i]);
        }
    }

    private void ocisti() {
        vsmdCache.clear();
        datoteka_TF.setText("Opciono");
        naslov_TF.setText("");
        autor_TF.setText("");
        cena_TF.setText("");
    }
}
