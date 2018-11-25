package ge.bog.mbank.ui.main.assetsandliabilities;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import ge.bog.mbank.R;

public class ActiveHeaderViewHolder extends RecyclerView.ViewHolder{
    private TextView tvActiveHeader;

    public ActiveHeaderViewHolder(@NonNull View itemView) {
        super(itemView);
        tvActiveHeader = itemView.findViewById(R.id.active_tv_header);
    }

    public void setData(String header) {
        tvActiveHeader.setText(header);
    }
}
