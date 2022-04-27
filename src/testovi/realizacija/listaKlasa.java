/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testovi.realizacija;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 *
 * @author SMRTNIK
 */
public class listaKlasa {

    protected static Set<ArrayList<String>> unikatna = new HashSet<ArrayList<String>>();

    public static void setUnikatna(ArrayList<String> ista) {
        unikatna.add(ista);
    }

    public static Set<ArrayList<String>> getUnikatna() {
        return unikatna;
    }
}
