package ge.bog.mbank.model.clientinfo;

import com.google.gson.annotations.SerializedName;

/**
 * created by tamuna
 */
public class ClientContact {
    @SerializedName("Contact")
    private String contact;
    @SerializedName("Route")
    private String route;
    @SerializedName("DefaultContact")
    private String defaultContact;
    @SerializedName("ContactName")
    private String contactName;
    @SerializedName("Mail")
    private String mail;
    @SerializedName("Mobile")
    private String mobile;
    @SerializedName("Device")
    private String device;

    public String getContact() {
        return contact;
    }

    public String getRoute() {
        return route;
    }

    public String getDefaultContact() {
        return defaultContact;
    }

    public String getContactName() {
        return contactName;
    }

    public String getMail() {
        return mail;
    }

    public String getMobile() {
        return mobile;
    }

    public String getDevice() {
        return device;
    }
}
