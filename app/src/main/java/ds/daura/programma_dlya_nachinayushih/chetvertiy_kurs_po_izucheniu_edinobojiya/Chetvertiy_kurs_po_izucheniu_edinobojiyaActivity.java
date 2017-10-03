package ds.daura.programma_dlya_nachinayushih.chetvertiy_kurs_po_izucheniu_edinobojiya;

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
import ds.daura.programma_dlya_nachinayushih.vtoroi_kurs_po_iz_eb.PageAdapter;

public class Chetvertiy_kurs_po_izucheniu_edinobojiyaActivity extends AppCompatActivity {
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
        tabLayout.addTab(tabLayout.newTab().setText("Вступление и предисловие"));
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
        tabLayout.addTab(tabLayout.newTab().setText("Глава 15"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 16"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 17"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 18"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 19"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 20"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 21"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 22"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 23"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 24"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 25"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 26"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 27"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 28"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 29"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 30"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 31"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 32"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 33"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 34"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 35"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 36"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 37"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 38"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 39"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 40"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 41"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 42"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 43"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 44"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 45"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 46"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 47"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 48"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 49"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 50"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 51"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 52"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 53"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 54"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 55"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 56"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 57"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 58"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 59"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 60"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 61"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 62"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 63"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 64"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 65"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 66"));
        tabLayout.addTab(tabLayout.newTab().setText("Глава 67"));

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);


        final ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        final ChetvertiyPageAdapter adapter = new ChetvertiyPageAdapter(getSupportFragmentManager(), tabLayout.getTabCount(), 1);
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
