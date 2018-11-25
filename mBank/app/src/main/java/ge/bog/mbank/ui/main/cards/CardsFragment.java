package ge.bog.mbank.ui.main.cards;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import ge.bog.mbank.R;
import ge.bog.mbank.ui.main.dataaccess.DataAccessSession;
import ge.bog.mbank.model.cards.Card;

public class CardsFragment extends Fragment {
    private DataAccessSession dataAccessSession;

    private RecyclerView rvCards;
    private CardsRecyclerAdapter cardRecyclerAdapter;

    public static CardsFragment newInstance(int index) {
        return new CardsFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        dataAccessSession = new DataAccessSession();
        View view = inflater.inflate(R.layout.fragment_cards, container, false);

        rvCards = view.findViewById(R.id.rv_cards);
        cardRecyclerAdapter = new CardsRecyclerAdapter();
        rvCards.setLayoutManager(new LinearLayoutManager(getContext()));
        rvCards.setAdapter(cardRecyclerAdapter);
        dataAccessSession.getCards(this);
        return view;
    }

    public void setData(List<Card> data){
        cardRecyclerAdapter.setData(data);
    }

}

