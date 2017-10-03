package ds.daura.programma_dlya_nachinayushih.tretii_kurs_po_iz_eb;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import ds.daura.programma_dlya_nachinayushih.vtoroi_kurs_po_iz_eb.CourseFragment;


public class TreriiPageAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public TreriiPageAdapter(FragmentManager fm, int NumOfTabs, int type) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                TretiiCourseFragmentGlav tab1 = new TretiiCourseFragmentGlav();
                return tab1;
            case 1:
                TretiiCourseFragment tab2 = new TretiiCourseFragment();
                TretiiCourseFragment.page(2);
                return tab2;
            case 2:
                TretiiCourseFragment tab3 = new TretiiCourseFragment();
                TretiiCourseFragment.page(3);
                return tab3;
            case 3:
                TretiiCourseFragment tab4 = new TretiiCourseFragment();
                TretiiCourseFragment.page(4);
                return tab4;
            case 4:
                TretiiCourseFragment tab5 = new TretiiCourseFragment();
                TretiiCourseFragment.page(5);
                return tab5;
            case 5:
                TretiiCourseFragment tab6 = new TretiiCourseFragment();
                TretiiCourseFragment.page(6);
                return tab6;
            case 6:
                TretiiCourseFragment tab7 = new TretiiCourseFragment();
                TretiiCourseFragment.page(7);
                return tab7;
            case 7:
                TretiiCourseFragment tab8 = new TretiiCourseFragment();
                TretiiCourseFragment.page(8);
                return tab8;
            case 8:
                TretiiCourseFragment tab9 = new TretiiCourseFragment();
                TretiiCourseFragment.page(9);
                return tab9;
            case 9:
                TretiiCourseFragment tab10 = new TretiiCourseFragment();
                TretiiCourseFragment.page(10);
                return tab10;
            case 10:
                TretiiCourseFragment tab11 = new TretiiCourseFragment();
                TretiiCourseFragment.page(11);
                return tab11;
            case 11:
                TretiiCourseFragment tab12 = new TretiiCourseFragment();
                TretiiCourseFragment.page(12);
                return tab12;
            case 12:
                TretiiCourseFragment tab13 = new TretiiCourseFragment();
                TretiiCourseFragment.page(13);
                return tab13;
            case 13:
                TretiiCourseFragment tab14 = new TretiiCourseFragment();
                TretiiCourseFragment.page(14);
                return tab14;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}