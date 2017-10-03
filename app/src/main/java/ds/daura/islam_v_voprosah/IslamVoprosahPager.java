package ds.daura.islam_v_voprosah;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import ds.daura.pokloneniya.PokloneniyaFragment;


public class IslamVoprosahPager extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public IslamVoprosahPager(FragmentManager fm, int NumOfTabs, int type) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                IslamVopprasahFragmentGlav tab1 = new IslamVopprasahFragmentGlav();
                return tab1;
            case 1:
                IslamVopprasahFragment tab2 = new IslamVopprasahFragment();
                IslamVopprasahFragment.page(2);
                return tab2;
            case 2:
                IslamVopprasahFragment tab3 = new IslamVopprasahFragment();
                IslamVopprasahFragment.page(3);
                return tab3;
            case 3:
                IslamVopprasahFragment tab4 = new IslamVopprasahFragment();
                IslamVopprasahFragment.page(4);
                return tab4;
            case 4:
                IslamVopprasahFragment tab5 = new IslamVopprasahFragment();
                IslamVopprasahFragment.page(5);
                return tab5;
            case 5:
                IslamVopprasahFragment tab6 = new IslamVopprasahFragment();
                IslamVopprasahFragment.page(6);
                return tab6;
            case 6:
                IslamVopprasahFragment tab7 = new IslamVopprasahFragment();
                IslamVopprasahFragment.page(7);
                return tab7;
            case 7:
                IslamVopprasahFragment tab8 = new IslamVopprasahFragment();
                IslamVopprasahFragment.page(8);
                return tab8;
            case 8:
                IslamVopprasahFragment tab9 = new IslamVopprasahFragment();
                IslamVopprasahFragment.page(9);
                return tab9;
            case 9:
                IslamVopprasahFragment tab10 = new IslamVopprasahFragment();
                IslamVopprasahFragment.page(10);
                return tab10;
            case 10:
                IslamVopprasahFragment tab11 = new IslamVopprasahFragment();
                IslamVopprasahFragment.page(11);
                return tab11;
            case 11:
                IslamVopprasahFragment tab12 = new IslamVopprasahFragment();
                IslamVopprasahFragment.page(12);
                return tab12;
            case 12:
                IslamVopprasahFragment tab13 = new IslamVopprasahFragment();
                IslamVopprasahFragment.page(13);
                return tab13;
            case 13:
                IslamVopprasahFragment tab14 = new IslamVopprasahFragment();
                IslamVopprasahFragment.page(14);
                return tab14;
            case 14:
                IslamVopprasahFragment tab15 = new IslamVopprasahFragment();
                IslamVopprasahFragment.page(15);
                return tab15;
            case 15:
                IslamVopprasahFragment tab16 = new IslamVopprasahFragment();
                IslamVopprasahFragment.page(16);
                return tab16;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}