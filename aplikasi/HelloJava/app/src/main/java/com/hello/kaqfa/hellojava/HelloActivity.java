package com.hello.kaqfa.hellojava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class HelloActivity extends AppCompatActivity {

    private final static String TAG = "hellojava.HelloActivity";
    private String txtMessage = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        TextView txt = (TextView) findViewById(R.id.text_display);

        greetingMessage();
        textSeparator();
        txtMessage = txtMessage+"hasil perhitungan 12 + 19 adalah: "+simpleMath(12, 19, '+');
        textSeparator();
        txtMessage += "hasil perhitungan 20 x 60 adalah: "+simpleMath(20, 60, 'x');
        textSeparator();
        txtMessage += "hasil perhitungan 8 ^ 3 adalah: "+simpleMath(8, 3, '^');
        textSeparator();
        txtMessage += "hasil perhitungan 8 & 12 adalah: "+simpleMath(8, 12, '&');
        textSeparator();
        txtMessage += cekString("senin", "senin");
        textSeparator();
        txtMessage += cekString("senin", "selasa");

        txt.setText(this.txtMessage);
    }

    private void greetingMessage(){
        this.txtMessage = "Selamat datang di pemrograman Android"+
                "kali ini kita akan belajar dasar-dasar pemrograman java"+
                "melalui Android";
    }

    private void textSeparator(){
        this.txtMessage += "\n--------------------------------\n";
    }

    private double simpleMath(int num1, int num2, char operator){
        if(operator == '+'){
            return num1 + num2;
        } else if(operator == '-'){
            return num1 - num2;
        } else if(operator == 'x'){
            return num1 * num2;
        } else if(operator == '/'){
            return num1 / num2;
        } else if(operator == '^'){
            double hasil = num1;
            for(int i = 1; i < num2; i++){
                hasil *= num1;
            }

            return hasil;
        } else {
            Log.d(TAG, "operator salah, nggak ada yang kayak gitu lho");
            return 0;
        }
    }

    private String cekString(String text1, String text2){
        if(text1.equals(text2)){
            return text1+" & "+text2+" sama yah...";
        } else {
            return text1+" tidak sama dengan "+text2;
        }
    }
}
