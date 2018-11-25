package ge.bog.mbank.network;

import java.util.List;

import ge.bog.mbank.model.assetsandliabilities.AllActives;
import ge.bog.mbank.model.cards.Card;
import ge.bog.mbank.model.clientinfo.ClientInfo;
import ge.bog.mbank.model.login.LoginDetails;
import ge.bog.mbank.model.transactions.TransactionsInfo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * created by tamuna
 */
public interface Api {
    @GET("api/Clients/Login/{username}/{password}")
    Call<LoginDetails> authenticate(@Path("username") String username, @Path("password") String password);

    @GET("api/Clients/ClientInfo")
    Call<ClientInfo> getClientInfo();

    @GET("api/Products/Transactions")
    Call<TransactionsInfo> getTransactions();

    @GET("api/Products/AssetsAndLiabilities")
    Call<AllActives> getActives();

    @GET("api/Products/Cards")
    Call<List<Card>> getCards();
}
