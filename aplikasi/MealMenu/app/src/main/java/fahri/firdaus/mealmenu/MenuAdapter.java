package fahri.firdaus.mealmenu;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by kaqfa on 1/26/17.
 */

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MyViewHolder> {

    private List<Menu> menuList;

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView title, category, from;

        public MyViewHolder(View view){
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            category = (TextView) view.findViewById(R.id.category);
            from = (TextView) view.findViewById(R.id.from);
        }
    }

    public MenuAdapter(List<Menu> menuList) {
        this.menuList = menuList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.meal_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Menu menu = menuList.get(position);
        holder.title.setText(menu.getTitle());
        holder.category.setText(menu.getCategory());
        holder.from.setText(menu.getFrom());
    }

    @Override
    public int getItemCount() {
        return menuList.size();
    }


}
