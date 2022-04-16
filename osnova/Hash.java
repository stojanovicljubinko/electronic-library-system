/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osnova;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SMRTNIK
 */
public class Hash {

    private static final long serialVersionUID = 1L;
    private byte lozinkaH[];
    {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            String lozinka = "secret";
            byte hash[] = md.digest(lozinka.getBytes());
            System.out.println(Arrays.toString(hash));
            hash = lozinkaH;
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Hash.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public byte[] getLozinkaH() {
        return lozinkaH;
    }

    public Hash(byte[] lozinkaH) {
        this.lozinkaH = lozinkaH;
    }

}
