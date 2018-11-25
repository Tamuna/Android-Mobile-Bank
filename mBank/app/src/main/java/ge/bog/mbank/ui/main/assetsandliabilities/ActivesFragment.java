package ge.bog.mbank.ui.main.assetsandliabilities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ge.bog.mbank.R;
import ge.bog.mbank.ui.main.dataaccess.DataAccessSession;
import ge.bog.mbank.model.assetsandliabilities.AllActives;

public class ActivesFragment extends Fragment {
    private DataAccessSession dataAccessSession;
    private RecyclerView rvActives;
    private ActiveRecycleAdapter ActiveRecycleAdapter;

    public static ActivesFragment newInstance(int index) {
        return new ActivesFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        dataAccessSession = new DataAccessSession();
        View view = inflater.inflate(R.layout.fragment_actives, container, false);
        rvActives = view.findViewById(R.id.rv_actives);
        ActiveRecycleAdapter = new ActiveRecycleAdapter();
        rvActives.setLayoutManager(new LinearLayoutManager(getContext()));
        rvActives.setAdapter(ActiveRecycleAdapter);
        rvActives.setHasFixedSize(true);
        dataAccessSession.getActives(this);
        return view;
    }


    public void setData(AllActives actives) {
        List<Object> sectionedData = new ArrayList<>();
        sectionedData.add(getContext().getResources().getString(R.string.assets));
        sectionedData.addAll(actives.getAssets());
        sectionedData.add(getContext().getResources().getString(R.string.available_amount));
        sectionedData.addAll(actives.getAvailableAmounts());
        sectionedData.add(getContext().getResources().getString(R.string.liabilities));
        sectionedData.addAll(actives.getLiabilities());
        sectionedData.add(getContext().getResources().getString(R.string.points));
        sectionedData.addAll(actives.getPoints());

        ActiveRecycleAdapter.setData(sectionedData);
    }
}
