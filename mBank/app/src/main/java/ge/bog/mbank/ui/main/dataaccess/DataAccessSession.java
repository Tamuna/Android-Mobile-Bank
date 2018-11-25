package ge.bog.mbank.ui.main.dataaccess;

import java.util.List;

import ge.bog.mbank.network.Api;
import ge.bog.mbank.network.RetrofitInstance;
import ge.bog.mbank.model.assetsandliabilities.AllActives;
import ge.bog.mbank.model.cards.Card;
import ge.bog.mbank.model.clientinfo.ClientInfo;
import ge.bog.mbank.model.transactions.TransactionsInfo;
import ge.bog.mbank.ui.main.assetsandliabilities.ActivesFragment;
import ge.bog.mbank.ui.main.cards.CardsFragment;
import ge.bog.mbank.ui.main.profile.ProfileFragment;
import ge.bog.mbank.ui.main.transactions.TransactionFragment;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class DataAccessSession {
    private Api api;
    private Retrofit retrofit;

    public void getActives(final ActivesFragment activesFragment) {
        api.getActives().enqueue(new Callback<AllActives>() {
            @Override
            public void onResponse(Call<AllActives> call, Response<AllActives> response) {
                if (response.body() != null) {
                    activesFragment.setData(response.body());
                }
            }

            @Override
            public void onFailure(Call<AllActives> call, Throwable t) {

            }
        });
    }

    public void getClient(final ProfileFragment profileFragment) {
        api.getClientInfo().enqueue(new Callback<ClientInfo>() {
            @Override
            public void onResponse(Call<ClientInfo> call, Response<ClientInfo> response) {
                if (response.body() != null) {
                    profileFragment.setData(response.body());
                }
            }

            @Override
            public void onFailure(Call<ClientInfo> call, Throwable t) {
            }
        });
    }


    public void getCards(final CardsFragment cardsFragment) {
        api.getCards().enqueue(new Callback<List<Card>>() {
            @Override
            public void onResponse(Call<List<Card>> call, Response<List<Card>> response) {
                if (response.body() != null) {
                    cardsFragment.setData(response.body());
                }
            }

            @Override
            public void onFailure(Call<List<Card>> call, Throwable t) {
            }
        });
    }

    public void getTransactions(final TransactionFragment transactionFragment) {
        final TransactionsInfo[] result = {new TransactionsInfo()};
        api.getTransactions().enqueue(new Callback<TransactionsInfo>() {
            @Override
            public void onResponse(Call<TransactionsInfo> call, Response<TransactionsInfo> response) {
                if (response.body() != null) {
                    transactionFragment.setData(response.body());
                }
            }

            @Override
            public void onFailure(Call<TransactionsInfo> call, Throwable t) {
            }
        });
    }

    public DataAccessSession() {
        retrofit = RetrofitInstance.getRetofitInstance();
        api = retrofit.create(Api.class);
    }
}
