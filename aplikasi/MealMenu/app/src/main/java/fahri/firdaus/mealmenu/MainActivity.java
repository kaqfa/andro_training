package fahri.firdaus.mealmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Menu> menuList = new ArrayList<>();
    private RecyclerView recyclerView;
    private  MenuAdapter menuAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        menuAdapter = new MenuAdapter(menuList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(menuAdapter);

        prepareMenuData();
    }

    private void prepareMenuData() {
        Menu newMenu = new Menu("Rendang Daging", "Daging", "Padang");
        menuList.add(newMenu);

        newMenu = new Menu("Soto Suroboyo", "Kuah-kuah", "Suroboyo");
        menuList.add(newMenu);

        newMenu = new Menu("Sate Padang", "Sate", "Padang");
        menuList.add(newMenu);

        menuAdapter.notifyDataSetChanged();
    }

}
