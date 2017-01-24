package fahri.firdaus.javaadvancedclass.bangunruang;

import fahri.firdaus.javaadvancedclass.bangundatar.SegiTiga;

/**
 * Created by kaqfa on 1/24/17.
 */

public class Kerucut extends SegiTiga implements BangunRuang {

    public Kerucut(int alas, int tinggi) {
        super(alas, tinggi);
    }

    @Override
    public String nama() {
        return "Kerucut";
    }

    @Override
    public double volume() {
        return  (Math.PI * this.alas * this.alas * this.tinggi) / 3;
    }

    @Override
    public double luasPermukaan() {
        return Math.PI * this.alas * this.tinggi;
    }
}
