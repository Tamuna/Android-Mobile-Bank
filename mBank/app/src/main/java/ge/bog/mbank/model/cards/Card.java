package ge.bog.mbank.model.cards;

import com.google.gson.annotations.SerializedName;

public class Card {
    @SerializedName("Id")
    public Long id;
    @SerializedName("CardId")
    public Long cardId;
    @SerializedName("AcctKey")
    public Long acctKey;
    @SerializedName("ClientKey")
    public Long clientKey;
    @SerializedName("CardClass")
    public String cardClass;
    @SerializedName("CardName")
    public String cardName;
    @SerializedName("CardType")
    public String cardType;
    @SerializedName("ProductCode")
    public String productCode;
    @SerializedName("SubProductCode")
    public String subProductCode;
    @SerializedName("SubProductGroup")
    public String subProductGroup;
    @SerializedName("LastFour")
    public String lastFour;
    @SerializedName("CardHolder")
    public String cardHolder;
    @SerializedName("ExpDate")
    public Long expDate;
    @SerializedName("IsCardBlocked")
    public String isCardBlocked;
    @SerializedName("CardPan")
    public String cardPan;
    @SerializedName("CardForTypeDictionaryValue")
    public String cardForTypeDictionaryValue;
    @SerializedName("ProductGroup")
    public String productGroup;
    @SerializedName("ProductId")
    public Long productId;
    @SerializedName("SubProductId")
    public Long subProductId;
    @SerializedName("NameDictionaryValue")
    public String nameDictionaryValue;

    public Long getId() {
        return id;
    }

    public Long getCardId() {
        return cardId;
    }

    public Long getAcctKey() {
        return acctKey;
    }

    public Long getClientKey() {
        return clientKey;
    }

    public String getCardClass() {
        return cardClass;
    }

    public String getCardName() {
        return cardName;
    }

    public String getCardType() {
        return cardType;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getSubProductCode() {
        return subProductCode;
    }

    public String getSubProductGroup() {
        return subProductGroup;
    }

    public String getLastFour() {
        return lastFour;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public Long getExpDate() {
        return expDate;
    }

    public String getIsCardBlocked() {
        return isCardBlocked;
    }

    public String getCardPan() {
        return cardPan;
    }

    public String getCardForTypeDictionaryValue() {
        return cardForTypeDictionaryValue;
    }

    public String getProductGroup() {
        return productGroup;
    }

    public Long getProductId() {
        return productId;
    }

    public Long getSubProductId() {
        return subProductId;
    }

    public String getNameDictionaryValue() {
        return nameDictionaryValue;
    }
}
