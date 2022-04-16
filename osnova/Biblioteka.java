/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osnova;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author SMRTNIK
 */
public class Biblioteka extends Object implements Serializable {

    private List<Knjiga> collection;
    private static final long serialVersionUID = 1L;

    public Biblioteka() {
        collection = new ArrayList<Knjiga>();
    }

    private List<Knjiga> getCollection() {
        return collection;
    }

    public void dodajKnjigu(Knjiga knjiga) {
        collection.add(knjiga);
    }

    public void obrisiKnjigu(Knjiga a) {
        collection.remove(a);
    }

    public Knjiga getKnjigaByName(String ime) {
        Knjiga v = null;
        Iterator<Knjiga> i = collection.iterator();
        while (i.hasNext()) {
            v = i.next();
            // object (0x111aab != 0x000abb) - "MuSic.mp3" != "music.mp3
            if (v.getNazivKnjige().toLowerCase().contentEquals(ime.toLowerCase())) {
                return v;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String sve = "\n";
        Iterator<Knjiga> i = collection.iterator();
        while (i.hasNext()) {
            Knjiga b = (Knjiga) i.next();
            sve = sve + b.toString();
        }
        return sve;
    }

    public boolean daLiIDPostojiTrenutno(int ID) {
        Iterator<Knjiga> i = collection.iterator();
        while (i.hasNext()) {
            if (i.next().getKnjigaID() == ID) {
                return true;
            }
        }
        return false;
    }

    public String[][] toStringVector() {
        String[][] sve = new String[collection.size()][5];

        for (int i = 0; i < collection.size(); i -= -1) {
            sve[i][0] = String.valueOf(collection.get(i).getKnjigaID());
            sve[i][1] = collection.get(i).getNazivKnjige();
            sve[i][2] = collection.get(i).getNazivPisca();
            sve[i][3] = String.valueOf(collection.get(i).getCenaKnjige());
        }
        return sve;
    }

    public Knjiga getBookByID(int ID) {
        for (Knjiga knjiga : collection) {
            if (knjiga.getKnjigaID() == ID) {
                return knjiga;
            }
        }
        return null;
    }
}
