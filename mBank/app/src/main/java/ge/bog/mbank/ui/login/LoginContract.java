package ge.bog.mbank.ui.login;

import ge.bog.mbank.exceptions.ValidationException;

public interface LoginContract {
    interface LoginView {
        void validateInputs(String username, String password) throws ValidationException;

        void redirectToMain();

        void unsuccessfulLogin();
    }

    interface LoginPresenter {
        void tryLogin(String username, String password);
    }

    interface LoginInteractor {
        interface OnFinishListener {
            void onFinished(String sessionId);

            void onFailure(Throwable t);
        }

        void authenticate(OnFinishListener onFinishListener, String username, String password);
    }
}
