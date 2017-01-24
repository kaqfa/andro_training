package fahri.firdaus.javaadvancedclass.bangundatar;

/**
 * Created by kaqfa on 1/24/17.
 */

public class Lingkaran implements BangunDatar {
    protected int jari;

    public Lingkaran(int jari) {
        this.jari = jari;
    }

    @Override
    public String nama() {
        return "Lingkaran";
    }

    @Override
    public double getLuas() {
        return (Math.PI*(this.jari*this.jari));
    }

    @Override
    public double getKeliling() {
        return (Math.PI*(this.jari*2));
    }
}
