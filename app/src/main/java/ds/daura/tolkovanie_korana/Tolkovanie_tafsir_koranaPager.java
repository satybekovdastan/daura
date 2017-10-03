package ds.daura.tolkovanie_korana;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


public class Tolkovanie_tafsir_koranaPager extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public Tolkovanie_tafsir_koranaPager(FragmentManager fm, int NumOfTabs, int type) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                TolkovanieFragmentGlav tab1 = new TolkovanieFragmentGlav();
                return tab1;
            case 1:
                TolkovanieFragment tab2 = new TolkovanieFragment();
                TolkovanieFragment.page(2);
                return tab2;
            case 2:
                TolkovanieFragment tab3 = new TolkovanieFragment();
                TolkovanieFragment.page(3);
                return tab3;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}