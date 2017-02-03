package fahri.firdaus.calculatorwithhistory;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by kaqfa on 2/4/17.
 */

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.MyViewHolder> {
    private List<Calculate> historyList;

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                                .inflate(R.layout.history_list, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Calculate calculate = historyList.get(position);
        holder.num1.setText(Double.toString(calculate.num1));
        holder.num2.setText(Double.toString(calculate.num2));
        holder.operator.setText(calculate.operator);
        holder.result.setText(Double.toString(calculate.calc()));
    }

    @Override
    public int getItemCount() {
        return historyList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        public TextView num1, num2, operator, result;

        public MyViewHolder(View itemView) {
            super(itemView);
            num1 = (TextView) itemView.findViewById(R.id.num1);
            num2 = (TextView) itemView.findViewById(R.id.num2);
            operator = (TextView) itemView.findViewById(R.id.operator);
            result = (TextView) itemView.findViewById(R.id.txt_result);
        }
    }

    public HistoryAdapter(List<Calculate> historyList){
        this.historyList = historyList;
    }
}
