package fahri.firdaus.shopreceipt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void  printReceipt(View view){
        int [] num_barang = new int[6];
        String [] barang = new String[6];

        barang[0] = ((EditText) findViewById(R.id.plasma_num)).getText().toString();
        barang[1] = ((EditText) findViewById(R.id.microwave_num)).getText().toString();
        barang[2] = ((EditText) findViewById(R.id.vacum_num)).getText().toString();
        barang[3] = ((EditText) findViewById(R.id.ac_num)).getText().toString();
        barang[4] = ((EditText) findViewById(R.id.secure_num)).getText().toString();
        barang[5] = ((EditText) findViewById(R.id.dvd_num)).getText().toString();

        num_barang[0] = Integer.parseInt(barang[0]);
        num_barang[1] = Integer.parseInt(barang[1]);
        num_barang[2] = Integer.parseInt(barang[2]);
        num_barang[3] = Integer.parseInt(barang[3]);
        num_barang[4] = Integer.parseInt(barang[4]);
        num_barang[5] = Integer.parseInt(barang[5]);

        Intent intent = new Intent(this, ReceiptActivity.class);
        intent.putExtra("main.plasma.num", num_barang[0]);
        intent.putExtra("main.microwave.num", num_barang[1]);
        intent.putExtra("main.vacum.num", num_barang[2]);
        intent.putExtra("main.ac.num", num_barang[3]);
        intent.putExtra("main.secure.num", num_barang[4]);
        intent.putExtra("main.dvd.num", num_barang[5]);

        startActivity(intent);
    }
}
