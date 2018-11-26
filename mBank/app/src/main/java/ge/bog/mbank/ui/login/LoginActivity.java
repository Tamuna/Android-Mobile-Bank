package ge.bog.mbank.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import ge.bog.mbank.R;
import ge.bog.mbank.exceptions.ValidationException;
import ge.bog.mbank.ui.main.MainActivity;

public class LoginActivity extends AppCompatActivity implements LoginContract.LoginView {


    private TextInputEditText tiUsername;
    private TextInputEditText tiPassword;
    private Button btnLogin;

    private LoginContract.LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tiUsername = findViewById(R.id.login_ti_username);
        tiPassword = findViewById(R.id.login_ti_password);
        btnLogin = findViewById(R.id.login_btn);

        presenter = new LoginPresenterImpl(this, new LoginInteractorImpl());
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    presenter.validateInputs(tiUsername.getText().toString(), tiPassword.getText().toString(), LoginActivity.this);
                    presenter.tryLogin(tiUsername.getText().toString(), tiPassword.getText().toString());
                } catch (ValidationException e) {
                    Toast invalidLogin = Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG);
                    invalidLogin.show();
                }
            }
        });
    }


    @Override
    public void redirectToMain() {
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void unsuccessfulLogin() {
        Toast unsuccessfulLoginPrompt = Toast.makeText(getApplicationContext(), getResources().getString(R.string.not_registered_error), Toast.LENGTH_LONG);
        unsuccessfulLoginPrompt.show();
    }
}
