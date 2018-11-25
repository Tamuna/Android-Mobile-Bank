package ge.bog.mbank.model.clientinfo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * created by tamuna
 */
public class ClientInfo {
    @SerializedName("Client")
    private Client client;
    @SerializedName("ClientAddresses")
    private List<ClientAddress> clientAdresses;
    @SerializedName("ClientMails")
    private List<ClientContact> clientMails;
    @SerializedName("ClientPhones")
    private List<ClientContact> clientPhones;

    public Client getClient() {
        return client;
    }

    public List<ClientAddress> getClientAdresses() {
        return clientAdresses;
    }

    public List<ClientContact> getClientMails() {
        return clientMails;
    }

    public List<ClientContact> getClientPhones() {
        return clientPhones;
    }
}
