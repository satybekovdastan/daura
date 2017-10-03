package ds.daura.islam_v_voprosah;

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
import ds.daura.pokloneniya.PoklenaniyaPager;


public class IslamVoprosahActivity extends AppCompatActivity {
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
        tabLayout.addTab(tabLayout.newTab().setText("Предисловие"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 1"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 2"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 3"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 4"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 5"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 6"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 7"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 8"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 9"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 10"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 11"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 12"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 13"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 14"));
        tabLayout.addTab(tabLayout.newTab().setText("Общая глава"));

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);


        final ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
//        final PageAdapter adapter = new PageAdapter(); (getSupportFragmentManager(), tabLayout.getTabCount());
        final IslamVoprosahPager adapter = new IslamVoprosahPager(getSupportFragmentManager(), tabLayout.getTabCount(), 1);
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
