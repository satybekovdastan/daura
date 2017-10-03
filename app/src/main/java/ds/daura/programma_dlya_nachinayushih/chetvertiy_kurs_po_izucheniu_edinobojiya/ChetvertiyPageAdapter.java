package ds.daura.programma_dlya_nachinayushih.chetvertiy_kurs_po_izucheniu_edinobojiya;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import ds.daura.programma_dlya_nachinayushih.vtoroi_kurs_po_iz_eb.CourseFragment;


public class ChetvertiyPageAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public ChetvertiyPageAdapter(FragmentManager fm, int NumOfTabs, int type) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                ChetvertyiCourseFragmentGlav tab1 = new ChetvertyiCourseFragmentGlav();
                return tab1;
            case 1:
                ChetvertyiCourseFragment tab2 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(2);
                return tab2;
            case 2:
                ChetvertyiCourseFragment tab3 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(3);
                return tab3;
            case 3:
                ChetvertyiCourseFragment tab4 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(4);
                return tab4;
            case 4:
                ChetvertyiCourseFragment tab5 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(5);
                return tab5;
            case 5:
                ChetvertyiCourseFragment tab6 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(6);
                return tab6;
            case 6:
                ChetvertyiCourseFragment tab7 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(7);
                return tab7;
            case 7:
                ChetvertyiCourseFragment tab8 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(8);
                return tab8;
            case 8:
                ChetvertyiCourseFragment tab9 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(9);
                return tab9;
            case 9:
                ChetvertyiCourseFragment tab10 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(10);
                return tab10;
            case 10:
                ChetvertyiCourseFragment tab11 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(11);
                return tab11;
            case 11:
                ChetvertyiCourseFragment tab12 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(12);
                return tab12;
            case 12:
                ChetvertyiCourseFragment tab13 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(13);
                return tab13;
            case 13:
                ChetvertyiCourseFragment tab14 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(14);
                return tab14;
            case 14:
                ChetvertyiCourseFragment tab15 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(15);
                return tab15;
            case 15:
                ChetvertyiCourseFragment tab16 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(16);
                return tab16;
            case 16:
                ChetvertyiCourseFragment tab17 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(17);
                return tab17;
            case 17:
                ChetvertyiCourseFragment tab18 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(18);
                return tab18;
            case 18:
                ChetvertyiCourseFragment tab19 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(19);
                return tab19;
            case 19:
                ChetvertyiCourseFragment tab20 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(20);
                return tab20;
            case 20:
                ChetvertyiCourseFragment tab21 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(21);
                return tab21;
            case 21:
                ChetvertyiCourseFragment tab22 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(22);
                return tab22;
            case 22:
                ChetvertyiCourseFragment tab23 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(23);
                return tab23;
            case 23:
                ChetvertyiCourseFragment tab24 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(24);
                return tab24;
            case 24:
                ChetvertyiCourseFragment tab25 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(25);
                return tab25;
            case 25:
                ChetvertyiCourseFragment tab26 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(26);
                return tab26;
            case 26:
                ChetvertyiCourseFragment tab27 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(27);
                return tab27;
            case 27:
                ChetvertyiCourseFragment tab28 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(28);
                return tab28;
            case 28:
                ChetvertyiCourseFragment tab29 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(29);
                return tab29;
            case 29:
                ChetvertyiCourseFragment tab30 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(30);
                return tab30;
            case 30:
                ChetvertyiCourseFragment tab31 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(31);
                return tab31;
            case 31:
                ChetvertyiCourseFragment tab32 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(32);
                return tab32;
            case 32:
                ChetvertyiCourseFragment tab33 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(33);
                return tab33;
            case 33:
                ChetvertyiCourseFragment tab34 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(34);
                return tab34;
            case 34:
                ChetvertyiCourseFragment tab35 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(35);
                return tab35;
            case 35:
                ChetvertyiCourseFragment tab36 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(36);
                return tab36;
            case 36:
                ChetvertyiCourseFragment tab37 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(37);
                return tab37;
            case 37:
                ChetvertyiCourseFragment tab38 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(38);
                return tab38;
            case 38:
                ChetvertyiCourseFragment tab39 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(39);
                return tab39;
            case 39:
                ChetvertyiCourseFragment tab40 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(40);
                return tab40;
            case 40:
                ChetvertyiCourseFragment tab41 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(41);
                return tab41;
            case 41:
                ChetvertyiCourseFragment tab42 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(42);
                return tab42;
            case 42:
                ChetvertyiCourseFragment tab43 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(43);
                return tab43;
            case 43:
                ChetvertyiCourseFragment tab44 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(44);
                return tab44;
            case 44:
                ChetvertyiCourseFragment tab45 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(45);
                return tab45;
            case 45:
                ChetvertyiCourseFragment tab46 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(46);
                return tab46;
            case 46:
                ChetvertyiCourseFragment tab47 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(47);
                return tab47;
            case 47:
                ChetvertyiCourseFragment tab48 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(48);
                return tab48;
            case 48:
                ChetvertyiCourseFragment tab49 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(49);
                return tab49;
            case 49:
                ChetvertyiCourseFragment tab50 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(50);
                return tab50;
            case 50:
                ChetvertyiCourseFragment tab51 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(51);
                return tab51;
            case 51:
                ChetvertyiCourseFragment tab52 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(52);
                return tab52;
            case 52:
                ChetvertyiCourseFragment tab53 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(53);
                return tab53;
            case 53:
                ChetvertyiCourseFragment tab54 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(54);
                return tab54;
            case 54:
                ChetvertyiCourseFragment tab55 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(55);
                return tab55;
            case 55:
                ChetvertyiCourseFragment tab56 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(56);
                return tab56;
            case 56:
                ChetvertyiCourseFragment tab57 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(57);
                return tab57;
            case 57:
                ChetvertyiCourseFragment tab58 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(58);
                return tab58;
            case 58:
                ChetvertyiCourseFragment tab59 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(59);
                return tab59;
            case 59:
                ChetvertyiCourseFragment tab60 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(60);
                return tab60;
            case 60:
                ChetvertyiCourseFragment tab61 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(61);
                return tab61;
            case 61:
                ChetvertyiCourseFragment tab62 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(62);
                return tab62;
            case 62:
                ChetvertyiCourseFragment tab63 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(63);
                return tab63;
            case 63:
                ChetvertyiCourseFragment tab64 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(64);
                return tab64;
            case 64:
                ChetvertyiCourseFragment tab65 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(65);
                return tab65;
            case 65:
                ChetvertyiCourseFragment tab66 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(66);
                return tab66;
            case 66:
                ChetvertyiCourseFragment tab67 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(67);
                return tab67;
            case 67:
                ChetvertyiCourseFragment tab68 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(68);
                return tab68;
            case 68:
                ChetvertyiCourseFragment tab69 = new ChetvertyiCourseFragment();
                ChetvertyiCourseFragment.page(69);
                return tab69;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}