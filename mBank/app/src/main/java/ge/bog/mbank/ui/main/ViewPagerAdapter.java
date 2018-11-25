package ge.bog.mbank.ui.main;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import ge.bog.mbank.R;
import ge.bog.mbank.ui.main.assetsandliabilities.ActivesFragment;
import ge.bog.mbank.ui.main.cards.CardsFragment;
import ge.bog.mbank.ui.main.profile.ProfileFragment;
import ge.bog.mbank.ui.main.transactions.TransactionFragment;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    private Context context;

    public ViewPagerAdapter(FragmentManager fm, MainActivity context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int index) {
        if (index == 0)
            return ProfileFragment.newInstance(index);
        if (index == 1)
            return ActivesFragment.newInstance(index);
        if (index == 2)
            return TransactionFragment.newInstance(index);
        return CardsFragment.newInstance(index);
    }

    @Override
    public int getCount() {
        return context.getResources().getStringArray(R.array.tab_names).length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return context.getResources().getStringArray(R.array.tab_names)[position];
    }
}
