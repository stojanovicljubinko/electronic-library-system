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
public class Knjiga implements Serializable {

    private static final long serialVersionUID = 1L;
    private int knjigaID;
    private String nazivKnjige, nazivPisca;
    private double cenaKnjige;

    private List<VSMD> vsmds;

    public Knjiga() {
        knjigaID = 0;
        nazivKnjige = null;
        nazivPisca = null;
        cenaKnjige = 0;
        vsmds = new ArrayList<VSMD>();
    }

    public Knjiga(int knjigaID, String nazivKnjige, String nazivPisca, double cenaKnjige, ArrayList<VSMD> vsmds) {
        this.knjigaID = knjigaID;
        this.nazivKnjige = nazivKnjige;
        this.nazivPisca = nazivPisca;
        this.cenaKnjige = cenaKnjige;
        this.vsmds = vsmds;
    }

    public void addVSMD(VSMD v) {
        vsmds.add(v);
    }

    public String getNazivKnjige() {
        return nazivKnjige;
    }

    public String getNazivPisca() {
        return nazivPisca;
    }

    public double getCenaKnjige() {
        return cenaKnjige;
    }

    public VSMD getVSMDByName(String ime) {
        VSMD v = null;
        Iterator<VSMD> i = vsmds.iterator();
        while (i.hasNext()) {
            v = i.next();
            // object (0x111aab != 0x000abb) - "MuSic.mp3" != "music.mp3
            if (v.getIme().toLowerCase().contentEquals(ime.toLowerCase())) {
                return v;
            }
        }
        return null;
    }

    public int getKnjigaID() {
        return knjigaID;
    }

    @Override
    public String toString() {
        String vsmdImena = "";
        String vsmdAmount = "(" + String.valueOf(vsmds.size()) + ")";

        Iterator<VSMD> i = vsmds.iterator();
        while (i.hasNext()) {
            vsmdImena += i.next().getIme() + ", ";
        }
        return "\nnazivKnjige: " + nazivKnjige + "\nnazivPisca: " + nazivPisca
                + "\nknjigaID: " + knjigaID + "\ncenaKnjige: " + cenaKnjige + "\nVSMD Datoteke" + vsmdAmount + ": " + vsmdImena + "\n";
    }

    //dodato za otvaranje tabele
    public String[][] toStringVectorDatoteka() {
        String sve[][] = new String[vsmds.size()][2];
        VSMD v;
        for (int i = 0; i < vsmds.size(); i++) {
            v = vsmds.get(i);
            if (v.getIme().endsWith("wav") || v.getIme().endsWith("mp3")) {
                sve[i][0] = v.getIme();
            } else if (v.getIme().endsWith("png") || v.getIme().endsWith("jpeg")) {
                sve[i][1] = v.getIme();
            } else {
                sve[i][2] = v.getIme();
            }
        }
        return sve;
    }

    public ArrayList<VSMD> dobaviListuDatoteka() {
        return (ArrayList<VSMD>) vsmds;
    }
}
