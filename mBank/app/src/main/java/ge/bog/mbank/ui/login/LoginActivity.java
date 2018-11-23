package ge.bog.mbank.ui.login;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import ge.bog.mbank.R;

public class LoginActivity extends AppCompatActivity implements LoginContract.LoginView {
    private TextInputEditText tiUsername;
    private TextInputEditText tiPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tiUsername = findViewById(R.id.ti_username);
        tiPassword = findViewById(R.id.ti_password);
        btnLogin = findViewById(R.id.btn_login);
    }

    @Override
    public void validateInputs() {

    }

    @Override
    public void redirectToMain() {

    }

    @Override
    public void unsuccessfulLogin() {

    }
}
