package com.example.android.quakereport;

import java.util.Date;

/**
 * Created by Iwona on 04.05.2018.
 */

public class Earthquake {

    /** Magnitude volume of earthquake */
    private double mEarthquakeMagnitute;

    /** Location of earthquake */
    private String mEarthquakeLocation;

    /** Date of earthquake */
    private Date mEarthquakeDate;


    /**
     * Create a new Earthquake object.
     *
     * @param earthquakeMagnitude is strength of earthquake
     * @param earthquakeLocation is the location of the earthquake
     * @param earthquakeDate is date of the earthquake
     */
    public Earthquake(double earthquakeMagnitude, String earthquakeLocation, Date earthquakeDate){
        mEarthquakeMagnitute = earthquakeMagnitude;
        mEarthquakeLocation = earthquakeLocation;
        mEarthquakeDate = earthquakeDate;
    }


    public double getmEarthquakeMagnitute() {
        return mEarthquakeMagnitute;
    }

    public String getmEarthquakeLocation() {
        return mEarthquakeLocation;
    }

    public Date getmEarthquakeDate() {
        return mEarthquakeDate;
    }
}
