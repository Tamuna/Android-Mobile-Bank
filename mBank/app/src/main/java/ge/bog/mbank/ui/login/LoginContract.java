package ge.bog.mbank.ui.login;

import ge.bog.mbank.exceptions.ValidationException;

public interface LoginContract {
    interface LoginView {
        void redirectToMain();

        void unsuccessfulLogin();
    }

    interface LoginPresenter {
        void tryLogin(String username, String password);

        void validateInputs(String username, String password, LoginActivity context) throws ValidationException;
    }

    interface LoginInteractor {
        interface OnFinishListener {
            void onFinished(String sessionId);

            void onFailure(Throwable t);
        }

        void authenticate(OnFinishListener onFinishListener, String username, String password);
        void validateLogin(String username, String password, LoginActivity context) throws ValidationException;
    }
}
