package osnova;

public class Dokument {

    //sadrzaj, velicina dokumenta, naziv dokumenta
    String sadrzajDokumenta;
    int velicinaDokumenta;
    String nazivDokumenta;

    public Dokument(String sadrzajDokumenta, int velicinaDokumenta, String nazivDokumenta) {
        this.sadrzajDokumenta = sadrzajDokumenta;
        this.velicinaDokumenta = velicinaDokumenta;
        this.nazivDokumenta = nazivDokumenta;
    }

    public String getSadrzajDokumenta() {
        return sadrzajDokumenta;
    }

    public int getVelicinaDokumenta() {
        return velicinaDokumenta;
    }

    public String getNazivDokumenta() {
        return nazivDokumenta;
    }

    @Override
    public String toString() {
        return this.nazivDokumenta;
    }

}
