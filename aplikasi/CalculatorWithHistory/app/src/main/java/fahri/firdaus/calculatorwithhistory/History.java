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

//        ListView listView = (ListView) findViewById(R.id.history);
//        Intent intent = getIntent();
//        historyList = (List<Calculate>) intent.getSerializableExtra("CalculatorMain");
//
//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, historyList);
//        listView.setAdapter(adapter);
    }

    private void prepareHistoryData(){
        Intent intent = getIntent();
        historyList = (List<Calculate>) intent.getSerializableExtra("CalculatorMain");
//
//        for(int i = 0; i < historyList.size(); i++){
//            Log.d("history.list", Double.toString(historyList.get(i).calc()));
//        }

        historyList.add(new Calculate(12, 12, "tambah"));
        historyList.add(new Calculate(24, 12, "kurang"));

        historyAdapter.notifyDataSetChanged();
    }
}
