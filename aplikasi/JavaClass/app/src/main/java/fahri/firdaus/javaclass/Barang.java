package fahri.firdaus.javaclass;

/**
 * Created by kaqfa on 1/22/17.
 */

public class Barang {

    public final static int ELEKTRONIK = 1;
    public final static int NON_ELEKTRONIK = 2;
    private String nama;
    private int jenis;
    private int harga;

    public Barang(String nama, int jenis, int harga) {
        this.nama = nama;
        this.jenis = jenis;
        this.harga = harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenis(int jenis) {
        if (jenis != 1)
            jenis = 2;
        this.jenis = jenis;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public int getJenis(){
        return jenis;
    }

    public String getJenisString() {
        if(jenis == 1)
            return "Elektronik";
        else
            return "Non Elektronik";
    }

    public int getHarga() {
        return harga;
    }

    @Override
    public String toString() {
        return this.nama+" | "+this.getJenisString()+" | "+this.harga;
    }
}
