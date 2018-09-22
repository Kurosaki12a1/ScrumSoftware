package com.bku.scrumsoftware.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.bku.scrumsoftware.Fragment.AboutFragment;
import com.bku.scrumsoftware.Fragment.ContentFragment;
import com.bku.scrumsoftware.Fragment.ManifestFragment;

/**
 * Created by Welcome on 9/22/2018.
 */

public class MainFragmentViewPager extends FragmentPagerAdapter {


    public MainFragmentViewPager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ManifestFragment();
        } else if (position == 1) {
            return new ContentFragment();
        } else {
            return new AboutFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        switch (position) {
            case 0:
                //return mContext.getString(R.string.category_usefulinfo);
                return "Manifest";
            case 1:
                //return mContext.getString(R.string.category_places);
                return "Content";
            case 2:
                //return mContext.getString(R.string.category_food);
                return "About";
            default:
                return null;
        }
    }


}
