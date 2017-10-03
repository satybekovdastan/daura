package ds.daura.programma_dlya_treb_znaniya.chetyre_pravila;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;



public class PageAdapterPlitka2 extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PageAdapterPlitka2(FragmentManager fm, int NumOfTabs, int type) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                ChetyrePrFragmentGlav tab1 = new ChetyrePrFragmentGlav();
                return tab1;
            case 1:
                ChetyrePrFragment tab2 = new ChetyrePrFragment();
                ChetyrePrFragment.page(2);
                return tab2;
            case 2:
                ChetyrePrFragment tab3 = new ChetyrePrFragment();
                ChetyrePrFragment.page(3);
                return tab3;
            case 3:
                ChetyrePrFragment tab4 = new ChetyrePrFragment();
                ChetyrePrFragment.page(4);
                return tab4;
            case 4:
                ChetyrePrFragment tab5 = new ChetyrePrFragment();
                ChetyrePrFragment.page(5);
                return tab5;
            case 5:
                ChetyrePrFragment tab6 = new ChetyrePrFragment();
                ChetyrePrFragment.page(6);
                return tab6;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}