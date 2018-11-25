package ge.bog.mbank.model.transactions;

import com.google.gson.annotations.SerializedName;

public class Transaction {
    @SerializedName("AcctKey")
    private Long acctKey;
    @SerializedName("EntryId")
    private Long entryId;
    @SerializedName("Nomination")
    private String nomination;
    @SerializedName("EntryGroup")
    private String entryGroup;
    @SerializedName("MerchantId")
    private String merchantId;
    @SerializedName("Date")
    private Long date;
    @SerializedName("Amount")
    private Double amount;
    @SerializedName("Ccy")
    private String ccy;
    @SerializedName("DocNomination")
    private String docNomination;
    @SerializedName("Beneficiary")
    private String beneficiary;
    @SerializedName("DstAcc")
    private String dstAcc;
    @SerializedName("SrcAcc")
    private String srcAcc;
    @SerializedName("MerchantName")
    private String merchantName;
    @SerializedName("MerchantNameInt")
    private String merchantNameInt;
    @SerializedName("AmountBase")
    private Float amountBase;
    @SerializedName("EntryGroupName")
    private String entryGroupName;
    @SerializedName("EntryGroupNameId")
    private Long entryGroupNameId;
    @SerializedName("ServiceId")
    private String serviceId;
    @SerializedName("PostDate")
    private Long postDate;

    public Long getAcctKey() {
        return acctKey;
    }

    public Long getEntryId() {
        return entryId;
    }

    public String getNomination() {
        return nomination;
    }

    public String getEntryGroup() {
        return entryGroup;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public Long getDate() {
        return date;
    }

    public Double getAmount() {
        return amount;
    }

    public String getCcy() {
        return ccy;
    }

    public String getDocNomination() {
        return docNomination;
    }

    public String getBeneficiary() {
        return beneficiary;
    }

    public String getDstAcc() {
        return dstAcc;
    }

    public String getSrcAcc() {
        return srcAcc;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public String getMerchantNameInt() {
        return merchantNameInt;
    }

    public Float getAmountBase() {
        return amountBase;
    }

    public String getEntryGroupName() {
        return entryGroupName;
    }

    public Long getEntryGroupNameId() {
        return entryGroupNameId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public Long getPostDate() {
        return postDate;
    }
}


