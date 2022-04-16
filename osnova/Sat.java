/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osnova;

import interfejs.SistemElektronskeBibliotekeGUI;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author SMRTNIK
 */
public class Sat implements Runnable {

     private JLabel jl;

    public Sat(JLabel jl) {
        this.jl = jl;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Date d = new Date();
                String vreme = d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds();
                jl.setText(vreme);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(SistemElektronskeBibliotekeGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
