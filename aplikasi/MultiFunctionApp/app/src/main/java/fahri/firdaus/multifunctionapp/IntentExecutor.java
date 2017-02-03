package fahri.firdaus.multifunctionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class IntentExecutor extends AppCompatActivity {

    private String action;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_executor);
        Button button = (Button) findViewById(R.id.btn_exec);

        Intent intent = getIntent();
        action = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        if(action.equals("browser"))
            button.setText("Buka URL di Browser");
        else if(action.equals("phone"))
            button.setText("Panggil Nomor Telepon");
    }
}
