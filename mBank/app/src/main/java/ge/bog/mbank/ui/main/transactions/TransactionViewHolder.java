package ge.bog.mbank.ui.main.transactions;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import ge.bog.mbank.R;
import ge.bog.mbank.model.transactions.Transaction;
import ge.bog.mbank.ui.util.Helper;

/**
 * Created by tamuna;
 */
public class TransactionViewHolder extends RecyclerView.ViewHolder {
    private TextView tvTransactionDate;
    private TextView tvTransactionDest;
    private TextView tvTransactionType;
    private TextView tvTransactionAmount;
    private static final String INCOME = "ჩარიცხვა";

    private View itemView;

    public TransactionViewHolder(@NonNull View itemView) {
        super(itemView);
        tvTransactionDate = itemView.findViewById(R.id.transaction_tv_date);
        tvTransactionDest = itemView.findViewById(R.id.transaction_tv_destination);
        tvTransactionType = itemView.findViewById(R.id.transaction_tv_type);
        tvTransactionAmount = itemView.findViewById(R.id.transaction_tv_amount);
        this.itemView = itemView;
    }

    public void setData(Transaction transaction) {
        String sign = "-";
        if (transaction.getEntryGroupName().equals(INCOME))
            sign = "+";
        tvTransactionAmount.setText(String.format("%s%s %s", sign, transaction.getAmount(), itemView.getContext().getResources().getString(R.string.gel)));
        String destination = transaction.getMerchantName();
        if (destination == null)
            destination = itemView.getContext().getResources().getString(R.string.personal);
        tvTransactionDest.setText(destination);
        tvTransactionType.setText(transaction.getEntryGroupName());
        tvTransactionDate.setText(wrapDate(transaction.getPostDate()));
    }

    private String wrapDate(Long date) {
        long millisNow = System.currentTimeMillis();
        long diff = millisNow - date;
        long millisInDay = 86400000;

        if (diff < millisInDay)
            return itemView.getContext().getResources().getString(R.string.today);
        else if (diff < 2 * millisInDay)
            return itemView.getContext().getResources().getString(R.string.yesterday);
        return Helper.convertToDate(date, '.');
    }
}
