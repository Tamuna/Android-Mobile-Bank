package ge.bog.mbank.model.assetsandliabilities;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AllActives {
    @SerializedName("Points")
    private List<Point> points;
    @SerializedName("Assets")
    private List<Active> assets;
    @SerializedName("Liabilities")
    private List<Active> liabilities;
    @SerializedName("AvailableAmounts")
    private List<Active> availableAmounts;

    public List<Point> getPoints() {
        return points;
    }

    public List<Active> getAssets() {
        return assets;
    }

    public List<Active> getLiabilities() {
        return liabilities;
    }

    public List<Active> getAvailableAmounts() {
        return availableAmounts;
    }
}
