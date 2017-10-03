package ds.daura.programma_dlya_nachinayushih.vtoroi_kurs_po_iz_eb;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


public class PageAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PageAdapter(FragmentManager fm, int NumOfTabs, int type) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                CourseFragmentGlav tab1 = new CourseFragmentGlav();
                return tab1;
            case 1:
                CourseFragment tab2 = new CourseFragment();
                CourseFragment.page(2);
                return tab2;
            case 2:
                CourseFragment tab3 = new CourseFragment();
                CourseFragment.page(3);
                return tab3;
            case 3:
                CourseFragment tab4 = new CourseFragment();
                CourseFragment.page(4);
                return tab4;
            case 4:
                CourseFragment tab5 = new CourseFragment();
                CourseFragment.page(5);
                return tab5;
            case 5:
                CourseFragment tab6 = new CourseFragment();
                CourseFragment.page(6);
                return tab6;
            case 6:
                CourseFragment tab7 = new CourseFragment();
                CourseFragment.page(7);
                return tab7;
            case 7:
                CourseFragment tab8 = new CourseFragment();
                CourseFragment.page(8);
                return tab8;
            case 8:
                CourseFragment tab9 = new CourseFragment();
                CourseFragment.page(9);
                return tab9;
            case 9:
                CourseFragment tab10 = new CourseFragment();
                CourseFragment.page(10);
                return tab10;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}