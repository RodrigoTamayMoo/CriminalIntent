package com.rodrigo_tamay_moo.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;

public class CrimeActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();

    }


}
