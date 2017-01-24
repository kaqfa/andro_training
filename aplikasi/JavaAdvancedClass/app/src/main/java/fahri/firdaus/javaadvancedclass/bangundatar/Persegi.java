package fahri.firdaus.javaadvancedclass.bangundatar;

/**
 * Created by kaqfa on 1/24/17.
 */

public class Persegi implements BangunDatar {
    protected int panjang;
    protected int lebar;

    public Persegi(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public String nama(){
        if (this.panjang != this.lebar)
            return "Persegi Panjang";
        return "Persegi";
    }

    public double getLuas(){
        return this.panjang*this.lebar;
    }

    public double getKeliling(){
        return 2*this.panjang + 2*this.lebar;
    }
}
