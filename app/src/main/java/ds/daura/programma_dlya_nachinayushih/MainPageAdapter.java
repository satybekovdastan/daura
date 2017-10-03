package ds.daura.programma_dlya_nachinayushih;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import ds.daura.programma_dlya_nachinayushih.vtoroi_kurs_po_iz_eb.CourseFragment;
import ds.daura.programma_dlya_nachinayushih.vtoroi_kurs_po_iz_eb.CourseFragmentGlav;


public class MainPageAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public MainPageAdapter(FragmentManager fm, int NumOfTabs, int type) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                MainFragmentGlav tab1 = new MainFragmentGlav();
                return tab1;
            case 1:
                MainFragment tab2 = new MainFragment();
                MainFragment.page(2);
                return tab2;
            case 2:
                MainFragment tab3 = new MainFragment();
                MainFragment.page(3);
                return tab3;
            case 3:
                MainFragment tab4 = new MainFragment();
                MainFragment.page(4);
                return tab4;
            case 4:
                MainFragment tab5 = new MainFragment();
                MainFragment.page(5);
                return tab5;
            case 5:
                MainFragment tab6 = new MainFragment();
                MainFragment.page(6);
                return tab6;
            case 6:
                MainFragment tab7 = new MainFragment();
                MainFragment.page(7);
                return tab7;
            case 7:
                MainFragment tab8 = new MainFragment();
                CourseFragment.page(8);
                return tab8;


            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}