package ge.bog.mbank.ui.login;

import android.accounts.NetworkErrorException;

import ge.bog.mbank.R;
import ge.bog.mbank.exceptions.ValidationException;
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

    private static final int MIN_INPUT_LEN = 3;

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

    @Override
    public void validateLogin(String username, String password, LoginActivity context) throws ValidationException {
        String userApply = context.getResources().getString(R.string.user_apply);
        String emptyInputs = " " + context.getResources().getString(R.string.empty_fields_prompt);
        String shortInputs = " " + context.getResources().getString(R.string.short_inputs_prompt);
        String and = " " + context.getResources().getString(R.string.and_string);

        boolean valid = true;
        ValidationException e = new ValidationException();

        if (username.length() == 0 || password.length() == 0) {
            e.appendErrorMessage(userApply);
            e.appendErrorMessage(emptyInputs);
            valid = false;
        }
        if ((username.length() < MIN_INPUT_LEN && username.length() > 0)
                || (password.length() < MIN_INPUT_LEN && password.length() > 0)) {
            if (!valid)
                e.appendErrorMessage(and);
            else
                e.appendErrorMessage(userApply);
            e.appendErrorMessage(shortInputs);
            valid = false;
        }
        if (!valid)
            throw e;
    }
}
