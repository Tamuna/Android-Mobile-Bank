package ge.bog.mbank.model.clientinfo;

import com.google.gson.annotations.SerializedName;

/**
 * created by tamuna
 */
public class ClientAddress {
    @SerializedName("AddressType")
    private String addressType;
    @SerializedName("ClientKey")
    private Integer clientKey;
    @SerializedName("CountryCode")
    private String countryCode;
    @SerializedName("RegionCode")
    private String regionCode;
    @SerializedName("Street")
    private String street;
    @SerializedName("Building")
    private String building;
    @SerializedName("Appartment")
    private Integer appartment;
    @SerializedName("District")
    private String district;
    @SerializedName("NonCity")
    private String nonCity;
    @SerializedName("UrbanType")
    private String urbanType;

    public String getAddressType() {
        return addressType;
    }

    public Integer getClientKey() {
        return clientKey;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public String getStreet() {
        return street;
    }

    public String getBuilding() {
        return building;
    }

    public Integer getAppartment() {
        return appartment;
    }

    public String getDistrict() {
        return district;
    }

    public String getNonCity() {
        return nonCity;
    }

    public String getUrbanType() {
        return urbanType;
    }
}
