package ge.bog.mbank.ui.login;

public interface LoginContract {
    interface LoginView{
        void validateInputs();
        void redirectToMain();
        void unsuccessfulLogin();
    }

    interface LoginPresenter{
        void tryLogin(String username, String password);
    }

    interface LoginInteractor{
        interface OnFinishListener {
            void onFinished();
            void onFailure(Throwable t);
        }
        boolean isAuthorised();
    }
}
