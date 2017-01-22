package fahri.firdaus.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(){
        EditText edit1 = (EditText) findViewById(R.id.num1);
        EditText edit2 = (EditText) findViewById(R.id.num2);
    }
}
