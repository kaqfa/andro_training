package fahri.firdaus.geometrycalculator;

import android.content.res.ColorStateList;
import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private EditText input1;
    private EditText input2;
    private TextView result;
    private int operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = (EditText) findViewById(R.id.input1);
        input2 = (EditText) findViewById(R.id.input2);
        result = (TextView) findViewById(R.id.show_result);
        Spinner geoOpt = (Spinner) findViewById(R.id.geo_opt);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.operators, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        geoOpt.setAdapter(adapter);
        geoOpt.setOnItemSelectedListener(this);
    }

    public void calculate(View v){
        double num1, num2;
        String text;
        num1 = Double.parseDouble(input1.getText().toString());
        num2 = Double.parseDouble(input2.getText().toString());

        if(this.operation == 1){
            text = "Luas: "+num1*num2+"\n";
            text += "Keliling: "+((2*num1)+(2*num2));
        } else if(this.operation == 2){
            text = "Luas: "+(Math.PI*num1*num1)+"\n";
            text += "Keliling: "+(Math.PI * (2*num1));
        } else {
            text = "Luas: "+(num1*num2/2)+"\n";
            text += "Keliling: "+(num1+num2+(Math.sqrt((num1*num1)+(num2*num2))));
        }

        this.result.setText(text);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView label1 = (TextView) findViewById(R.id.label1);
        TextView label2 = (TextView) findViewById(R.id.label2);

        String operator = parent.getItemAtPosition(position).toString();
        if (operator.equalsIgnoreCase("persegi")){
            label1.setText("Panjang");
            label2.setText("Lebar");
            this.operation = 1;
        } else if(operator.equalsIgnoreCase("lingkaran")){
            label1.setText("Jari-Jari");
            label2.setText("disabled");
            label2.setTextColor(getResources().getColor(R.color.disabledColor));
            input2.setKeyListener(null);
            this.operation = 2;
        } else {
            label1.setText("Alas");
            label2.setText("Tinggi");
            this.operation = 3;
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
