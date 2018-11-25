package ge.bog.mbank.model.assetsandliabilities;

import com.google.gson.annotations.SerializedName;

public class Point{
    @SerializedName("Id")
    private Long id;
    @SerializedName("ProductName")
    private String productName;
    @SerializedName("OrderNo")
    private Long orderNo;
    @SerializedName("Amount")
    private Double amount;
    @SerializedName("ProdType")
    private String prodType;

    public Long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public Long getOrderNo() {
        return orderNo;
    }

    public Double getAmount() {
        return amount;
    }

    public String getProdType() {
        return prodType;
    }
}
