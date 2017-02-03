package fahri.firdaus.calculatorwithhistory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Calculate> history = new ArrayList<>();
    String [] oprs = {"tambah", "kurang", "kali", "bagi"};
    Spinner operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operator = (Spinner) findViewById(R.id.operator);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                                            android.R.layout.simple_spinner_item, oprs);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        operator.setAdapter(adapter);
    }

    public void calculate(View view){
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        TextView txtResult = (TextView) findViewById(R.id.txt_result);

        String operator = this.operator.getSelectedItem().toString();
        String number1 = num1.getText().toString();
        String number2 = num2.getText().toString();
        Double result, val1, val2;
        val1 = Double.parseDouble(number1);
        val2 = Double.parseDouble(number2);

        Calculate hitung = new Calculate(val1, val2, operator);
        history.add(hitung);
        txtResult.setText(Double.toString(hitung.calc()));
    }

    public void viewHist(View view){
        Intent intent = new Intent(this, History.class);
        intent.putExtra("CalculatorMain", history);
        startActivity(intent);
    }
}
