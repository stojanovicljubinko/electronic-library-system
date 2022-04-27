/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osnova;

import interfejs.igre.IksOksGUI;

/**
 *
 * @author samue
 */
public class KontrolerIksOks {

    private int[][] tabla;
    private int igrac;
    private int oznaceno;
    private IksOksGUI screen;

    public KontrolerIksOks(IksOksGUI ekran) {
        this.screen = ekran;
        this.tabla = new int[3][3];
        this.igrac = 1;
        this.oznaceno = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.tabla[i][j] = 0;
            }
        }
    }

    public int[][] getTabla() {
        return tabla;
    }

    public void setTabla(int i, int j, int vrednost) {
        this.tabla[i][j] = vrednost;
    }

    public int getIgrac() {
        return igrac;
    }

    public void setIgrac(int igrac) {
        this.igrac = igrac;
    }

    public int getOznaceno() {
        return oznaceno;
    }

    public void setOznaceno(int oznaceno) {
        this.oznaceno = oznaceno;
    }

    public void novaIgra() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.setTabla(i, j, 0);
            }
        }
        this.setIgrac(1);
        this.setOznaceno(0);
    }

    public int oznaciti(int i, int j) {

        int povratak;
        int tab[][] = this.getTabla();
        if (tab[i][j] != 0) {
            povratak = 0;
        } else {
            int igr = this.getIgrac();
            int ozn = this.getOznaceno();
            this.setTabla(i, j, igr);
            this.setOznaceno(ozn + 1);
            this.provera();
            povratak = igr;
            if (igr == 1) {
                this.setIgrac(2);
            } else {
                this.setIgrac(1);
            }
            this.screen.pokaziSledecegIgraca(this.getIgrac());
        }

        return povratak;
    }

    public void provera() {
        int racun = this.getOznaceno();
        //prvo proveri ima li pobednika
        //da li pobednik postoji
        int pobednik = this.proveriPobednika();
        if (pobednik != 0) {
            this.screen.upozorenje("Igrac " + pobednik + " je pobedio!");
        } else if (racun == 9) {
            this.screen.upozorenje("Nema pobednika");
        }
    }

    public int proveriPobednika() {
        int povratak = 0;
        int tab[][] = this.getTabla();
        for (int i = 0; i < 3; i++) {
            if(IksOksGUI.getZastavica()){
            for (int j = 0; j < 3; j++) {
            System.out.print(tab[i][j] + " "); //ispisivanje liste 
            }
            System.out.print("\n"); //razdvajanje
        }}
        if (tab[0][0] != 0) {
            if (tab[0][1] == tab[0][0]) {
                if (tab[0][2] == tab[0][0]) {
                    return tab[0][0];
                }
            }
            if (tab[1][1] == tab[0][0]) {
                if (tab[2][2] == tab[0][0]) {
                    return tab[0][0];
                }
            }
            if (tab[1][0] == tab[0][0]) {
                if (tab[2][0] == tab[0][0]) {
                    return tab[0][0];
                }
            }
        }
        if (tab[0][1] != 0) {
            if (tab[1][1] == tab[0][1]) {
                if (tab[2][1] == tab[0][1]) {
                    return tab[0][1];
                }
            }
        }
        if (tab[0][2] != 0) {
            if (tab[1][2] == tab[0][2]) {
                if (tab[2][2] == tab[0][2]) {
                    return tab[0][2];
                }
            }
        }
        if (tab[1][0] != 0) {
            if (tab[1][1] == tab[1][0]) {
                if (tab[1][2] == tab[1][0]) {
                    return tab[1][0];
                }
            }
        }
        if (tab[2][0] != 0) {
            if (tab[1][1] == tab[2][0]) {
                if (tab[0][2] == tab[2][0]) {
                    return tab[2][0];
                }
            }
            if (tab[2][1] == tab[2][0]) {
                if (tab[2][2] == tab[2][0]) {
                    return tab[2][0];
                }
            }
        }
        return povratak;
    }
}
