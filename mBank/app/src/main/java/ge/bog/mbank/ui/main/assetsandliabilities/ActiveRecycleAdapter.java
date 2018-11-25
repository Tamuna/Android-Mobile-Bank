package ge.bog.mbank.ui.main.assetsandliabilities;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ge.bog.mbank.R;
import ge.bog.mbank.model.assetsandliabilities.Active;
import ge.bog.mbank.model.assetsandliabilities.Point;

/**
 * Created by tamuna
 */
public class ActiveRecycleAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int TYPE_POINT = 0;
    private static final int TYPE_ACTIVE = 1;
    private static final int TYPE_HEADER = 2;

    private List<Object> data = new ArrayList<>();


    @Override
    public int getItemViewType(int position) {
        if (data.get(position) instanceof Active) {
            return TYPE_ACTIVE;
        }
        if (data.get(position) instanceof Point) {
            return TYPE_POINT;
        } else {
            return TYPE_HEADER;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        if (viewType == TYPE_POINT) {
            View pointView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cell_active_row, viewGroup, false);
            return new PointViewHolder(pointView);
        }
        if (viewType == TYPE_ACTIVE) {
            View activeView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cell_active_row, viewGroup, false);
            return new ActivesViewHolder(activeView);
        }
        View headerView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cell_active_header, viewGroup, false);
        return new ActiveHeaderViewHolder(headerView);
    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        int type = viewHolder.getItemViewType();
        if (type == TYPE_ACTIVE) {
            ((ActivesViewHolder) viewHolder).setData((Active) data.get(i));
        } else if (type == TYPE_POINT) {
            ((PointViewHolder) viewHolder).setData((Point) data.get(i));
        } else {
            ((ActiveHeaderViewHolder) viewHolder).setData((String) data.get(i));
        }
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void setData(List<Object> data) {
        this.data.clear();
        this.data.addAll(data);
        notifyDataSetChanged();
    }
}
