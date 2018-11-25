package ge.bog.mbank.ui.main.assetsandliabilities;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import ge.bog.mbank.R;
import ge.bog.mbank.model.assetsandliabilities.Point;

public class PointViewHolder extends RecyclerView.ViewHolder {
    private TextView tvActiveName;
    private TextView tvActiveAmount;

    public PointViewHolder(@NonNull View itemView) {
        super(itemView);
        tvActiveAmount = itemView.findViewById(R.id.active_tv_amaount);
        tvActiveName = itemView.findViewById(R.id.active_tv_name);
    }

    public void setData(Point point) {
        tvActiveName.setText(point.getProductName());
        tvActiveAmount.setText(String.format("%s", point.getAmount()));
    }
}
