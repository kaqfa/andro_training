package fahri.firdaus.javaadvancedclass.bangunruang;

import fahri.firdaus.javaadvancedclass.bangundatar.Persegi;

/**
 * Created by kaqfa on 1/24/17.
 */

public class Balok extends Persegi implements BangunRuang {

    private int tinggi;

    public Balok(int panjang, int lebar, int tinggi){
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public  Balok(int sisi){
        super(sisi, sisi);
        this.tinggi = sisi;
    }

    @Override
    public String nama() {
        if(this.panjang==this.lebar && this.lebar==this.tinggi)
            return "Kubus";
        return "Balok";
    }

    public double volume(){
        return this.panjang*this.lebar*this.tinggi;
    }

    public double luasPermukaan(){
        return 2*(this.panjang*this.lebar + this.tinggi*this.lebar + this.panjang*this.tinggi);
    }
}
