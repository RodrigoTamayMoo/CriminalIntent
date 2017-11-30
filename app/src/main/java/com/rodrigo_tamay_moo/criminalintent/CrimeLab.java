package com.rodrigo_tamay_moo.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by rodrigo_tamay_moo on 29/11/2017.
 */

public class CrimeLab {
    private static CrimeLab sCrimeLab;
    private List<Crime> mCrimes;


    public static CrimeLab get(Context context){
        if (sCrimeLab == null){
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context){
        mCrimes = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            Crime crime = new Crime();
            crime.setmTitle("Crimen # " + i);
            crime.setmSolved(i % 2 == 0);
            mCrimes.add(crime);
        }
    }


    public List<Crime> getCrimes(){
        return mCrimes;
    }

    public Crime getCrime(UUID id){
        for (Crime crime : mCrimes){
            if (crime.getmId().equals(id)){
                return crime;
            }
        }
        return null;
    }

}
