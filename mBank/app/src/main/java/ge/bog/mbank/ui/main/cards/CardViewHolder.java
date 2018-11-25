package ge.bog.mbank.ui.main.cards;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import ge.bog.mbank.R;
import ge.bog.mbank.model.cards.Card;
import ge.bog.mbank.ui.util.Helper;

/**
 * Created by tamuna;
 */
public class CardViewHolder extends RecyclerView.ViewHolder {
    private TextView tvCategory;
    private TextView tvAccNo;
    private TextView tvValidThu;
    private TextView tvOwnerName;
    private RelativeLayout rlCardLayout;
    private ImageView imgTypeIcon;
    private static final String VISA = "VISA";
    private static final String AMEX = "AMEX";
    private static final String SOLO = "SOLO Card";

    public CardViewHolder(@NonNull View itemView) {
        super(itemView);
        tvAccNo = itemView.findViewById(R.id.cards_tv_account_num);
        tvCategory = itemView.findViewById(R.id.cards_tv_category_type);
        tvValidThu = itemView.findViewById(R.id.cards_tv_valid_thru);
        tvOwnerName = itemView.findViewById(R.id.cards_tv_owner_name);
        imgTypeIcon = itemView.findViewById(R.id.cards_img_card_type);
        rlCardLayout = itemView.findViewById(R.id.cards_relative_card_layout);
    }

    public void setData(Card card) {
        String cardClass = card.getCardClass();
        tvOwnerName.setText(card.getCardHolder());
        tvCategory.setText(card.getCardName());
        tvValidThu.setText(Helper.convertToDate(card.getExpDate(), '/').substring(0, 5));
        tvAccNo.setText(String.format("XXXX XXXX XXXX %s", card.getLastFour()));
        if (cardClass.equals(VISA)) {
            if (card.getCardName() != null && card.getCardName().equals(SOLO))
                rlCardLayout.setBackgroundResource(R.drawable.account_background_solo);
            else
                rlCardLayout.setBackgroundResource(R.drawable.account_background_visa_gold);
            imgTypeIcon.setBackgroundResource(R.drawable.card_icon_visa_border_single);
        }
        if (cardClass.equals(AMEX)) {
            rlCardLayout.setBackgroundResource(R.drawable.account_background_amex_green);
            imgTypeIcon.setBackgroundResource(R.drawable.card_icon_amex_single);
        }
    }
}
