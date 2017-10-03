package ds.daura.programma_dlya_treb_znaniya.shest_osnov;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import ds.daura.programma_dlya_treb_znaniya.chetyre_pravila.ChetyrePrFragment;


public class ShestOsnovPageAdpater extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public ShestOsnovPageAdpater(FragmentManager fm, int NumOfTabs, int type) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                ShestOsnovFragmentGlav tab1 = new ShestOsnovFragmentGlav();
                return tab1;
            case 1:
                ShestOsnovFragment tab2 = new ShestOsnovFragment();
                ShestOsnovFragment.page(2);
                return tab2;
            case 2:
                ShestOsnovFragment tab3 = new ShestOsnovFragment();
                ShestOsnovFragment.page(3);
                return tab3;
            case 3:
                ShestOsnovFragment tab4 = new ShestOsnovFragment();
                ShestOsnovFragment.page(4);
                return tab4;
            case 4:
                ShestOsnovFragment tab5 = new ShestOsnovFragment();
                ShestOsnovFragment.page(5);
                return tab5;
            case 5:
                ShestOsnovFragment tab6 = new ShestOsnovFragment();
                ShestOsnovFragment.page(6);
                return tab6;
            case 6:
                ShestOsnovFragment tab7 = new ShestOsnovFragment();
                ShestOsnovFragment.page(7);
                return tab7;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}