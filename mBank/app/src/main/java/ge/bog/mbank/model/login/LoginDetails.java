package ge.bog.mbank.model.login;

import com.google.gson.annotations.SerializedName;

public class LoginDetails {
    @SerializedName("SessionId")
    private String sessionId;
    @SerializedName("SessionDetails")
    private SessionDetails sessionDetails;
    @SerializedName("UserDetails")
    private UserDetails userDetails;

    public String getSessionId() {
        return sessionId;
    }

    public SessionDetails getSessionDetails() {
        return sessionDetails;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }
}
