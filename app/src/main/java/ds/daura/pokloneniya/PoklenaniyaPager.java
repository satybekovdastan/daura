package ds.daura.pokloneniya;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import ds.daura.tolkovanie_korana.TolkovanieFragment;


public class PoklenaniyaPager extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PoklenaniyaPager(FragmentManager fm, int NumOfTabs, int type) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                PokloneniyaFragmentGlav tab1 = new PokloneniyaFragmentGlav();
                return tab1;
            case 1:
                PokloneniyaFragment tab2 = new PokloneniyaFragment();
                PokloneniyaFragment.page(2);
                return tab2;
            case 2:
                PokloneniyaFragment tab3 = new PokloneniyaFragment();
                PokloneniyaFragment.page(3);
                return tab3;
            case 3:
                PokloneniyaFragment tab4 = new PokloneniyaFragment();
                PokloneniyaFragment.page(4);
                return tab4;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}