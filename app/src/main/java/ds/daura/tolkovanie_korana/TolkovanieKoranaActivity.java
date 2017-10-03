package ds.daura.tolkovanie_korana;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import ds.daura.R;
import ds.daura.ViewPagerAdapter;


public class TolkovanieKoranaActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    FragmentManager fm;
    LinearLayout nav_linear;
    FrameLayout container;
    ViewPagerAdapter adapter;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lection2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("Толкование /тафсир/ Священного Корана"));
        tabLayout.addTab(tabLayout.newTab().setText("Сура «аль-Фатиха»"));
        tabLayout.addTab(tabLayout.newTab().setText("Сура «аль-Бакара»"));

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);


        final ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
//        final PageAdapter adapter = new PageAdapter(); (getSupportFragmentManager(), tabLayout.getTabCount());
        final Tolkovanie_tafsir_koranaPager adapter = new Tolkovanie_tafsir_koranaPager(getSupportFragmentManager(), tabLayout.getTabCount(), 1);
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }

        });
        viewPager.setCurrentItem(0);


    }
}
