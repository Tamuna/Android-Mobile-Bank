package ge.bog.mbank.model.transactions;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TransactionsInfo {
    @SerializedName("OutcomeSum")
    private Double outcomeSum;
    @SerializedName("IncomeSum")
    private Double incomeSum;
    @SerializedName("MyOperations")
    private List<Transaction> myOperations;

    public Double getOutcomeSum() {
        return outcomeSum;
    }

    public Double getIncomeSum() {
        return incomeSum;
    }

    public List<Transaction> getMyOperations() {
        return myOperations;
    }
}
