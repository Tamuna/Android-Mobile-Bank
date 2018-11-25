package ge.bog.mbank.ui.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.Calendar;

import ge.bog.mbank.R;

public class MainActivity extends AppCompatActivity {

    private ViewPagerAdapter adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tl_mbank_tab);
        viewPager = findViewById(R.id.vp_mbank_services_pager);
        adapter = new ViewPagerAdapter(getSupportFragmentManager(), MainActivity.this);
        viewPager.setAdapter(adapter);
        setPeriodicBackground();
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setPeriodicBackground() {
        Calendar c = Calendar.getInstance();
        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);
        if (timeOfDay > 6 && timeOfDay < 18)
            viewPager.setBackgroundResource(R.drawable.ic_day_bg);
        else
            viewPager.setBackgroundResource(R.drawable.ic_evening_bg);
    }
}
