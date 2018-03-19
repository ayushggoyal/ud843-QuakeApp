package com.example.android.quakereport;

/**
 * Created by ayush on 17/3/18.
 */

class Earthquake {
    private String mMagnitude;
    private String mLocation;
    private long mTimeInMiliSec;

    public Earthquake(String magnitude, String location, long timeInMiliSec){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMiliSec = timeInMiliSec;
    }

    public String getMagnitude(){
        return mMagnitude;
    }

    public String getLocation(){
        return mLocation;
    }

    public long getTimeInMiliSec(){
        return mTimeInMiliSec;
    }
}
