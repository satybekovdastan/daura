package ds.daura.programma_dlya_nachinayushih;

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


public class LectionActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    FragmentManager fm;
    LinearLayout nav_linear;
    FrameLayout container;
    ViewPagerAdapter adapter;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lection);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("Лекция 1"));
        tabLayout.addTab(tabLayout.newTab().setText("Лекция 2"));
        tabLayout.addTab(tabLayout.newTab().setText("Лекция 3"));
        tabLayout.addTab(tabLayout.newTab().setText("Лекция 4"));
        tabLayout.addTab(tabLayout.newTab().setText("Лекция 5"));
        tabLayout.addTab(tabLayout.newTab().setText("Лекция 6"));
        tabLayout.addTab(tabLayout.newTab().setText("Лекция 7"));
        tabLayout.addTab(tabLayout.newTab().setText("Лекция 8"));

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);


        final ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        final MainPageAdapter adapter = new MainPageAdapter(getSupportFragmentManager(), tabLayout.getTabCount(), 1);
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
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
//        fm = getSupportFragmentManager();
//        setSupportActionBar(toolbar);
//        setSupportActionBar(toolbar);
////        ActionBar actionBar = getSupportActionBar();
////        actionBar.setDisplayHomeAsUpEnabled(true);
//
//        viewPager = (ViewPager) findViewById(R.id.pager);
//        setupViewPager(viewPager);
//
//
//        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
//        tabLayout.setupWithViewPager(viewPager);
//
//        getSupportActionBar().setTitle("");
//
//
//
//
//    }
//
//    private void setupViewPager(ViewPager viewPager) {
//        adapter = new ViewPagerAdapter(fm);
//        adapter.addFragment(new MainFragment(1), "Лекция 1");
//        adapter.addFragment(new MainFragment(2), "Лекция 2");
//        adapter.addFragment(new MainFragment(3), "Лекция 3");
//        adapter.addFragment(new MainFragment(4), "Лекция 4");
//        adapter.addFragment(new MainFragment(5), "Лекция 5");
//        adapter.addFragment(new MainFragment(6), "Лекция 6");
//        adapter.addFragment(new MainFragment(7), "Лекция 7");
//        adapter.addFragment(new MainFragment(8), "Лекция 8");
//        viewPager.setAdapter(adapter);
//    }
//
//
////    @Override
////    public boolean onCreateOptionsMenu(Menu menu) {
////        getMenuInflater().inflate(R.menu.menu_rubrika, menu);
////        return true;
////    }
//
////    @Override
////    public void onBackPressed() {
////        overridePendingTransition(R.anim.close2, R.anim.close);
////        super.onBackPressed();
////    }
////
////    @Override
////    public boolean onOptionsItemSelected(MenuItem item) {
////        int id = item.getItemId();
////
////        if (id == android.R.id.home) {
////            finish();
////            overridePendingTransition(R.anim.close2, R.anim.close);
////        }
////
////        if (id == R.id.action_categories) {
////            Intent intent = new Intent(this, CategoryMediaRubrikaActivity.class);
////            intent.putExtra("type", type);
////            startActivityForResult(intent, 1);
////            overridePendingTransition(R.anim.from_right, R.anim.from_left);
////        }
////
////
////        return super.onOptionsItemSelected(item);
////    }
//
//
//
//}
