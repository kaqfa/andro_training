package fahri.firdaus.javaadvancedclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import fahri.firdaus.javaadvancedclass.bangundatar.BangunDatar;
import fahri.firdaus.javaadvancedclass.bangundatar.Lingkaran;
import fahri.firdaus.javaadvancedclass.bangundatar.Persegi;
import fahri.firdaus.javaadvancedclass.bangundatar.SegiTiga;
import fahri.firdaus.javaadvancedclass.bangunruang.Balok;
import fahri.firdaus.javaadvancedclass.bangunruang.BangunRuang;
import fahri.firdaus.javaadvancedclass.bangunruang.Bola;
import fahri.firdaus.javaadvancedclass.bangunruang.Kerucut;

public class MainActivity extends AppCompatActivity {

    private String txt = "";
    private TextView txtShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.txtShow = (TextView) findViewById(R.id.txtShow);
        this.txt = "Perhitungan Bangun Datar:";
        separator();
        hitungBangun();
        separator();

        this.txtShow.setText(this.txt);
    }

    private void separator(){
        this.txt  += "\n----------------------------\n";
    }

    private void hitungBangun(){
        Persegi persegi1 = new Persegi(5, 12);
        Persegi persegi2 = new Persegi(12, 12);

        Balok balok1 = new Balok(5, 12, 10);
        Balok balok2 = new Balok(15);

        this.txt += tampilDatar(persegi1);
        separator();
        this.txt += tampilDatar(persegi2);

        separator();

        this.txt += tampilRuang(balok1);
        separator();
        this.txt += tampilRuang(balok2);

        Lingkaran lingkaran1 = new Lingkaran(5);
        Bola bola1 = new Bola(5);

        separator();
        this.txt += tampilDatar(lingkaran1);
        separator();
        this.txt += tampilRuang(bola1);

        SegiTiga segiTiga1 = new SegiTiga(5, 10);
        Kerucut kerucut1 = new Kerucut(5, 10);

        separator();
        this.txt += tampilDatar(segiTiga1);
        separator();
        this.txt += tampilRuang(kerucut1);
    }

    private String tampilDatar(BangunDatar bangun){
        String txt = "";

        txt += "Nama: "+bangun.nama()+"\n";
        txt += "Luas: "+bangun.getLuas()+"\n";
        txt += "Keliling: "+bangun.getKeliling();

        return txt;
    }

    private String tampilRuang(BangunRuang bangun){
        String txt = "";

        txt += "Nama: "+bangun.nama()+"\n";
        txt += "Volume: "+bangun.volume()+"\n";
        txt += "Luas Permukaan: "+bangun.luasPermukaan();

        return txt;
    }
}
