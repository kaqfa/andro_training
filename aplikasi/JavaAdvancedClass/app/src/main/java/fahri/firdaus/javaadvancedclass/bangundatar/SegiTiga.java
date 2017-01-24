package fahri.firdaus.javaadvancedclass.bangundatar;

/**
 * Created by kaqfa on 1/24/17.
 */

public class SegiTiga implements BangunDatar {

    protected int alas;
    protected int tinggi;

    public SegiTiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public String nama() {
        return "Segitiga Siku-Siku";
    }

    @Override
    public double getLuas() {
        return (alas*tinggi) / 2;
    }

    @Override
    public double getKeliling() {
        return alas+tinggi+(Math.sqrt((alas*alas+tinggi*tinggi)));
    }
}
