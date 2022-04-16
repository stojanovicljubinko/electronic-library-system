/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osnova;

import java.io.Serializable;

/**
 *
 * @author SMRTNIK
 */
public class VSMD implements Serializable {

    private static final long serialVersionUID = 1L;
    private String ime;
    private String putanja;

    public VSMD() {
        ime = null;
        putanja = null;
    }

    public VSMD(String ime, String putanja) {
        this.ime = ime;
        this.putanja = putanja;
    }

    public String getIme() {
        return ime;
    }

    public String getPodaci() {
        return putanja;
    }

}
