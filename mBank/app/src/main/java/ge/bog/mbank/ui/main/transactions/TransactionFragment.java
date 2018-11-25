package ge.bog.mbank.ui.main.transactions;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import ge.bog.mbank.R;
import ge.bog.mbank.ui.main.dataaccess.DataAccessSession;
import ge.bog.mbank.model.transactions.TransactionsInfo;

public class TransactionFragment extends Fragment {
    private DataAccessSession dataAccessSession;
    private TextView tvIncome;
    private TextView tvOutcome;

    private RecyclerView rvTransactions;
    private TransactionRecycleAdapter transactionRecycleAdapter;

    public static TransactionFragment newInstance(int index) {
        return new TransactionFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        dataAccessSession = new DataAccessSession();
        View view = inflater.inflate(R.layout.fragment_transactions, container, false);

        tvIncome = view.findViewById(R.id.tv_income);
        tvOutcome = view.findViewById(R.id.tv_outcome);

        rvTransactions = view.findViewById(R.id.rv_transaction_history);
        transactionRecycleAdapter = new TransactionRecycleAdapter();
        rvTransactions.setLayoutManager(new LinearLayoutManager(getContext()));
        rvTransactions.setAdapter(transactionRecycleAdapter);
        dataAccessSession.getTransactions(this);
        return view;
    }


    public void setData(TransactionsInfo body) {
        tvIncome.setText(String.format("%s", body.getIncomeSum()));
        tvOutcome.setText(String.format("%s", body.getOutcomeSum()));
        transactionRecycleAdapter.setData(body.getMyOperations());
    }
}
