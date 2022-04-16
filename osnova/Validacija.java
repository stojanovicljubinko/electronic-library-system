package osnova;

import java.awt.Image;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author SMRTNIK
 */
public class Validacija {

    public static final Pattern uzorak1 = Pattern.compile("^([a-zA-Z])+([\\w]{2,})+$"); // za gosta

    private static void setIconImage(Image image) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    Biblioteka bib = new Biblioteka();
    public final static boolean KLJUCADMINA = true;
    public final static boolean KLJUCCLANAPISCAGOSTA = false;
    private static final String KORISNIK1 = "Admin";
    private static final String KORISNIK2 = "Ljubinko Stojanovic";
    private static final String KORISNIK3 = "Sasa Adamovic";
    private static byte hashL[] = {94, -66, 34, -108, -20, -48, -32, -16, -114, -85, 118, -112, -46, -90, -18, 105};

    public static String getKORISNIK1() {
        return KORISNIK1;
    }

    public static String getKORISNIK2() {
        return KORISNIK2;
    }

    public static String getKORISNIK3() {
        return KORISNIK3;
    }

    public static int povecaj(int i) {
        i -= -1;
        return i;
    }

    public static boolean ispunjeno(String naslov, String autor, String cena) {
        if (!naslov.trim().contentEquals("")
                && !autor.trim().contentEquals("")
                && !cena.trim().contentEquals("")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValidUserName(String ime) {
        Matcher matcher = uzorak1.matcher(ime);
        return matcher.matches();
    }

    public static byte[] getPass() {
        return hashL;
    }
}
