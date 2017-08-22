package com.example.android.quakereport;

import static com.example.android.quakereport.R.id.date;

/**
 * Created by user on 20/08/2017.
 */

public class Earthquake {

    /** Magnitude of the earthquake */
    private double mMagnitude;

    /** Location of the earthquake */
    private String mLocation;

    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    /** Website URL of the earthquake */
    private String mUrl;

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the location where the earthquake happened
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *                           earthquake happened
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    /**
     * Returns the magnitude of the earthquake.
     */
    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() { return mLocation; }

    public long getTimeInMilliseconds() { return mTimeInMilliseconds; }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }


}
