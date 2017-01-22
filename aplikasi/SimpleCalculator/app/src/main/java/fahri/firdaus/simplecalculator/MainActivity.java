package fahri.firdaus.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View view){
        TextView txtResult = (TextView) findViewById(R.id.result);
        EditText edit1 = (EditText) findViewById(R.id.num1);
        EditText edit2 = (EditText) findViewById(R.id.num2);
        double num1 = Double.parseDouble(edit1.getText().toString());
        double num2 = Double.parseDouble(edit2.getText().toString());

        RadioGroup operator = (RadioGroup) findViewById(R.id.operator);
        int selected = operator.getCheckedRadioButtonId();

        if(selected == R.id.plus){
            txtResult.setText(Double.toString(num1+num2));
        } else if(selected == R.id.minus){
            txtResult.setText(Double.toString(num1-num2));
        } else if(selected == R.id.multiply){
            txtResult.setText(Double.toString(num1*num2));
        } else {
            txtResult.setText(Double.toString(num1/num2));
        }
    }
}
