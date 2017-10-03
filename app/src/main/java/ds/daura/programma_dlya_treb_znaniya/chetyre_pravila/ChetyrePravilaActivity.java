package ds.daura.programma_dlya_treb_znaniya.chetyre_pravila;

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
import ds.daura.programma_dlya_nachinayushih.MainFragment;


public class ChetyrePravilaActivity extends AppCompatActivity {
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
        tabLayout.addTab(tabLayout.newTab().setText("Вступление."));
        tabLayout.addTab(tabLayout.newTab().setText("«аль-Ханифия» — религия Ибрахима"));
        tabLayout.addTab(tabLayout.newTab().setText("Первое правило"));
        tabLayout.addTab(tabLayout.newTab().setText("Второе правило"));
        tabLayout.addTab(tabLayout.newTab().setText("Третье правило"));
        tabLayout.addTab(tabLayout.newTab().setText("Четвертое правило"));

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);


        final ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
//        final PageAdapter adapter = new PageAdapter(); (getSupportFragmentManager(), tabLayout.getTabCount());
        final PageAdapterPlitka2 adapter = new PageAdapterPlitka2(getSupportFragmentManager(), tabLayout.getTabCount(), 1);
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
