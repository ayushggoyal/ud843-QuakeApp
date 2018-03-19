package com.example.android.quakereport;

/**
 * Created by ayush on 17/3/18.
 */

class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private long mTimeInMiliSec;

    public Earthquake(double magnitude, String location, long timeInMiliSec){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMiliSec = timeInMiliSec;
    }

    public double getMagnitude(){
        return mMagnitude;
    }

    public String getLocation(){
        return mLocation;
    }

    public long getTimeInMiliSec(){
        return mTimeInMiliSec;
    }
}
