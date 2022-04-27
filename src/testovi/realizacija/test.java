package testovi.realizacija;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import interfejs.igre.Kviz;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SMRTNIK
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static int possibleSubArrays(int[] niz) {

        Set<ArrayList<Integer>> unikatnaPodLista = new HashSet<ArrayList<Integer>>();

        for (int i = 0; i < niz.length; i++) {
            for (int j = i; j < niz.length; j++) {
                ArrayList<Integer> podNiz = new ArrayList<Integer>();
                for (int k = i; k <= j; k++) {
                    podNiz.add(niz[k]);
                    unikatnaPodLista.add(podNiz);
                }
            }
        }
        System.out.println("Niz pod-nizova: " + unikatnaPodLista);
        
        return unikatnaPodLista.size();
    }

    public static void main(String[] args) {
//      Random random = new Random();
//        int rand = 1;
//      int randUzorak = random.nextInt(11);
//        if (randUzorak != 0) {
//            rand = randUzorak;
//    }
        int n = 10;
        ArrayList<Integer> list = new ArrayList<Integer>(n);
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            int broj = random.nextInt(11);
            if (broj != 0) {
                list.add(broj);
            }
        }
        System.out.println(list);
        Kviz k = new Kviz(true);

        int[] niz = {1, 2, 3, 4};
        int velicina = possibleSubArrays(niz);
        System.out.println("Velicina unikatnog podniza je: " + velicina);
        int broj = 100;
        broj-=-20;
        System.out.println("Izbo" + broj);
    }

}
