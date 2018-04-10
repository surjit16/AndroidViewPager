package com.example.surji.viewpagerwithpageindicator;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by surjit on 17-10-2017.
 */

public class FragmentPagAdapter extends FragmentPagerAdapter {
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0: return new PagerOne();

            case 1: return new PagerTwo();

            case 2: return new PagerThree();
            default: return null;
        }
    }

    public FragmentPagAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 3;
    }
}
