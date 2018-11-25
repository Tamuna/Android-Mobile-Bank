package ge.bog.mbank.ui.login;

import android.accounts.NetworkErrorException;

import ge.bog.mbank.network.Api;
import ge.bog.mbank.network.RetrofitInstance;
import ge.bog.mbank.model.login.LoginDetails;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * created by tamuna
 */
public class LoginInteractorImpl implements LoginContract.LoginInteractor {
    private Api api;
    private Retrofit retrofit;

    @Override
    public void authenticate(final OnFinishListener onFinishListener, String username, String password) {

        retrofit = RetrofitInstance.getRetofitInstance();
        api = retrofit.create(Api.class);
        api.authenticate(username, password).enqueue(new Callback<LoginDetails>() {
            @Override
            public void onResponse(Call<LoginDetails> call, Response<LoginDetails> response) {
                onFinishListener.onFinished(response.body().getSessionId());
            }

            @Override
            public void onFailure(Call<LoginDetails> call, Throwable t) {
                onFinishListener.onFailure(new NetworkErrorException());
            }
        });
    }
}
