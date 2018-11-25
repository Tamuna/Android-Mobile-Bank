package ge.bog.mbank.model.clientinfo;

import com.google.gson.annotations.SerializedName;

/**
 * created by tamuna
 */
public class Client {
    @SerializedName("CategoryType")
    private String categoryType;
    @SerializedName("FirstName")
    private String firstName;
    @SerializedName("LastName")
    private String lastName;
    @SerializedName("FirstNameInt")
    private String firstNameInt;
    @SerializedName("LastNameInt")
    private String lastNameInt;
    @SerializedName("Sex")
    private String sex;
    @SerializedName("BirthDate")
    private Long birthdate;
    @SerializedName("TranStatus")
    private String tranStatus;
    @SerializedName("Resident")
    private String resident;
    @SerializedName("Pin")
    private String pin;
    @SerializedName("ClientCategory")
    private String clientCategory;

    public String getCategoryType() {
        return categoryType;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstNameInt() {
        return firstNameInt;
    }

    public String getLastNameInt() {
        return lastNameInt;
    }

    public String getSex() {
        return sex;
    }

    public Long getBirthdate() {
        return birthdate;
    }

    public String getTranStatus() {
        return tranStatus;
    }

    public String getResident() {
        return resident;
    }

    public String getPin() {
        return pin;
    }

    public String getClientCategory() {
        return clientCategory;
    }
}
