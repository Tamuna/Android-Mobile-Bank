package ge.bog.mbank.ui.main.transactions;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ge.bog.mbank.R;
import ge.bog.mbank.model.transactions.Transaction;

/**
 * Created by tamuna
 */
public class TransactionRecycleAdapter extends RecyclerView.Adapter<TransactionViewHolder> {

    private List<Transaction> data = new ArrayList<>();

    @NonNull
    @Override
    public TransactionViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cell_transaction, viewGroup, false);
        return new TransactionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TransactionViewHolder transactionViewHolder, int i) {
        transactionViewHolder.setData(data.get(i));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void setData(List<Transaction> data) {
        this.data.clear();
        this.data.addAll(data);
        notifyDataSetChanged();
    }
}
