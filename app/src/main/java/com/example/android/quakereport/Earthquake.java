package com.example.android.quakereport;

/**
 * Created by ayush on 17/3/18.
 */

class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private long mTimeInMiliSec;
    private String mUri;

    public Earthquake(double magnitude, String location, long timeInMiliSec, String uri){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMiliSec = timeInMiliSec;
        mUri = uri;
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

    public String getUri() { return mUri;}
}
