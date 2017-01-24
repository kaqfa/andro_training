package fahri.firdaus.javaadvancedclass.bangunruang;

import fahri.firdaus.javaadvancedclass.bangundatar.Lingkaran;

/**
 * Created by kaqfa on 1/24/17.
 */

public class Bola extends Lingkaran implements BangunRuang {

    public Bola(int jari) {
        super(jari);
    }

    @Override
    public String nama() {
        return "Bola";
    }

    @Override
    public double volume() {
        return (4/3) * Math.PI * this.jari * this.jari * this.jari;
    }

    @Override
    public double luasPermukaan() {
        return 4 * Math.PI * this.jari * this.jari;
    }
}
