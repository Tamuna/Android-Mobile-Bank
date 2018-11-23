package ge.bog.mbank.model.login;

import com.google.gson.annotations.SerializedName;

public class SessionDetails {
    @SerializedName("IsChannelActive")
    private Boolean isChannelActive;
    @SerializedName("SessionTimeout")
    private Integer sessionTimeout;

    public Boolean getChannelActive() {
        return isChannelActive;
    }

    public Integer getSessionTimeout() {
        return sessionTimeout;
    }
}
