package ds.daura.programma_dlya_treb_znaniya;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


public class Tri_osnovy_kurs extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public Tri_osnovy_kurs(FragmentManager fm, int NumOfTabs, int type) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                Plitka2FragmentGlav tab1 = new Plitka2FragmentGlav();
                return tab1;
            case 1:
                Plitka2Fragment tab2 = new Plitka2Fragment();
                Plitka2Fragment.page(2);
                return tab2;
            case 2:
                Plitka2Fragment tab3 = new Plitka2Fragment();
                Plitka2Fragment.page(3);
                return tab3;
            case 3:
                Plitka2Fragment tab4 = new Plitka2Fragment();
                Plitka2Fragment.page(4);
                return tab4;
            case 4:
                Plitka2Fragment tab5 = new Plitka2Fragment();
                Plitka2Fragment.page(5);
                return tab5;
            case 5:
                Plitka2Fragment tab6 = new Plitka2Fragment();
                Plitka2Fragment.page(6);
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