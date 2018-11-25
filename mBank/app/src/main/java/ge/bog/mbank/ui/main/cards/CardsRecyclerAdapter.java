package ge.bog.mbank.ui.main.cards;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ge.bog.mbank.R;
import ge.bog.mbank.model.cards.Card;

/**
 * Created by tamuna
 */
public class CardsRecyclerAdapter extends RecyclerView.Adapter<CardViewHolder> {

    private List<Card> data = new ArrayList<>();

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cell_card, viewGroup, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder cardViewHolder, int i) {
        cardViewHolder.setData(data.get(i));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void setData(List<Card> data) {
        this.data.clear();
        this.data.addAll(data);
        notifyDataSetChanged();
    }
}
