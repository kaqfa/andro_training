package fahri.firdaus.graphiccalculator;

import android.support.annotation.FloatRange;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText monitor;
    private float result, tempResult = 0;
    private char tempOperator = '+';

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        monitor = (EditText) findViewById(R.id.monitor);
    }

    public void operate(char op){
        result = Float.parseFloat(monitor.getText().toString());
        if(op == '+'){
            result += tempResult;
        } else if(op == '-'){
            result -= tempResult;
        } else if(op == '*'){
            result *= tempResult;
        } else if(op == '/'){
            result /= tempResult;
        }

        tempOperator = op;
    }

    public void addNum(int num){
        result = Float.parseFloat(monitor.getText().toString());
        result *= 10;
        result += num;
        monitor.setText(Float.toString(result));
    }

    public void cZero(View view){
        addNum(0);
    }

    public void cOne(View view){
        addNum(1);
    }

    public void cTwo(View view){
        addNum(2);
    }

    public void cThree(View view){
        addNum(3);
    }

    public void cFour(View view){
        addNum(4);
    }

    public void cFive(View view){
        addNum(5);
    }

    public void cSix(View view){
        addNum(6);
    }

    public void cSeven(View view){
        addNum(7);
    }

    public void cEight(View view){
        addNum(8);
    }

    public void cNine(View view){
        addNum(9);
    }

    public void cPlus(View view){

    }

    public void cMin(View view){

    }

    public void cMul(View view){

    }

    public void cDiv(View view){

    }

    public void cComma(View view){

    }

    public void cCi(View view){
        monitor.setText("0.0");
        result = 0;
    }
}
