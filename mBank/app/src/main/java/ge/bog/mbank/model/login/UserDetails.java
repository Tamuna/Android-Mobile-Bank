package ge.bog.mbank.model.login;

import com.google.gson.annotations.SerializedName;

public class UserDetails {
    @SerializedName("UserId")
    private int userId;
    @SerializedName("Username")
    private String username;
    @SerializedName("Name")
    private String name;
    @SerializedName("LastName")
    private String lastName;
    @SerializedName("PhoneForSms")
    private String phoneForSms;
    @SerializedName("Active")
    private Boolean active;

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneForSms() {
        return phoneForSms;
    }

    public Boolean getActive() {
        return active;
    }
}
