/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osnova;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 * @author SMRTNIK
 */
public class Stampac {

    private Queue<Dokument> hp;

    public Stampac() {
        this.hp = new LinkedList<Dokument>();
    }

    public void dodaj(Dokument d) {
        this.hp.add(d);
    }

    public String brojDokumenata() {
        return String.valueOf(this.hp.size());
    }

    public void dokumentiReda(JComboBox jcb) {
        jcb.removeAllItems();
        Iterator<Dokument> it = this.hp.iterator();
        while (it.hasNext()) {
            jcb.addItem(it.next());
        }
    }

    public void obrisi(Dokument x) {
        this.hp.remove(x);
    }

    public void stampaj() {
        while (this.hp.size() > 0) {
            Dokument x = this.hp.poll();
            try {
                Files.write(Paths.get(x.nazivDokumenta+".txt"), x.sadrzajDokumenta.getBytes());
            } catch (IOException ex) {
                Logger.getLogger(Stampac.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public Queue<Dokument> getHp() {
        return hp;
    }
}
