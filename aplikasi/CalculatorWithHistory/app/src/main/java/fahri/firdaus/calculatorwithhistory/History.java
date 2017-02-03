package fahri.firdaus.calculatorwithhistory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class History extends AppCompatActivity {
    private List<Calculate> historyList = new ArrayList<>();
    private RecyclerView recyclerView;
    private HistoryAdapter historyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        Intent intent = getIntent();
        historyList = (List<Calculate>) intent.getSerializableExtra("CalculatorMain");

        recyclerView = (RecyclerView) findViewById(R.id.history);
        historyAdapter = new HistoryAdapter(historyList);
        RecyclerView.LayoutManager histLayoutMan = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(histLayoutMan);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(historyAdapter);

    }
}
