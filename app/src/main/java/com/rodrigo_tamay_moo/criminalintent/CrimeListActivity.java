package com.rodrigo_tamay_moo.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by rodrigo_tamay_moo on 29/11/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
