package fahri.firdaus.javaclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtShow;
    String txt;
    Barang barang [] = new Barang[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtShow = (TextView) findViewById(R.id.show_text);

        initBarang();
        Transaksi oldTrans, newTrans;

        oldTrans = new Transaksi("123");
        oldTrans.addItem(this.barang[2]);
        oldTrans.addItem(this.barang[4]);

        newTrans = new Transaksi("456");
        newTrans.addItem(this.barang[1]);
        newTrans.addItem(this.barang[3]);
        newTrans.addItem(this.barang[0]);
        newTrans.addItem("Apple iMac", Barang.ELEKTRONIK, 20000000);

        txt = "Daftar Transaksi Hari Ini";
        addSeparator();
        txt += oldTrans.toString();
        addSeparator();
        txt += oldTrans.getTextItems();
        addSeparator();
        txt += newTrans.toString();
        addSeparator();
        txt += newTrans.getTextItems();

        txtShow.setText(this.txt);
    }

    private void addSeparator(){
        this.txt += "\n=============================\n";
    }

    private void initBarang(){
        barang[0] = new Barang("Alienware", Barang.ELEKTRONIK, 15000000);
        barang[1] = new Barang("Macbook Pro", Barang.ELEKTRONIK, 18000000);
        barang[2] = new Barang("iPhone 9S", Barang.ELEKTRONIK, 10000000);
        barang[3] = new Barang("Tas Laptop", Barang.NON_ELEKTRONIK, 400000);
        barang[4] = new Barang("Lunatik Taktik", Barang.NON_ELEKTRONIK, 700000);
    }

}
