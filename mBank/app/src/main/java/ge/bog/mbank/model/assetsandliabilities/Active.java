package ge.bog.mbank.model.assetsandliabilities;

import com.google.gson.annotations.SerializedName;

public class Active {
    @SerializedName("ProductType")
    private String productType;
    @SerializedName("AmountBase")
    private Double amountBase;
    @SerializedName("ProductName")
    private String productName;

    public String getProductType() {
        return productType;
    }

    public Double getAmountBase() {
        return amountBase;
    }

    public String getProductName() {
        return productName;
    }
}
