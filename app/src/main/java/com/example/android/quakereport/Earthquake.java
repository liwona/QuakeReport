package com.example.android.quakereport;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Iwona on 04.05.2018.
 */

public class Earthquake {

    /** Magnitude volume of earthquake */
    private String mMagnitute;

    /** Location of earthquake */
    private String mLocation;

    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    /**
     * Create a new Earthquake object.
     *
     * @param earthquakeMagnitude is magnitude (size) of earthquake
     * @param earthquakeLocation is the city location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *  earthquake happened
     */
    public Earthquake(String earthquakeMagnitude, String earthquakeLocation, long timeInMilliseconds){
        mMagnitute = earthquakeMagnitude;
        mLocation = earthquakeLocation;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    /**
     * @return magnitude of the earthquake
     */
    public String getMagnitute() {
        return mMagnitute;
    }

    /**
     * @return location of the earthquake
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * @return the time of the earthquake
     */
    public long getTimeInMilliseconds () {
        return mTimeInMilliseconds;
    }
}
