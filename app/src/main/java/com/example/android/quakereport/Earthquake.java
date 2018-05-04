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

    /** Date of earthquake */
    private String mDate;

    /**
     * Create a new Earthquake object.
     *
     * @param earthquakeMagnitude is magnitude (size) of earthquake
     * @param earthquakeLocation is the city location of the earthquake
     * @param earthquakeDate is date of the earthquake happened
     */
    public Earthquake(String earthquakeMagnitude, String earthquakeLocation, String earthquakeDate){
        mMagnitute = earthquakeMagnitude;
        mLocation = earthquakeLocation;
        mDate= earthquakeDate;
    }

    /**
     * @return magnitude of the earthquake
     */
    public String getmMagnitute() {
        return mMagnitute;
    }

    /**
     * @return location of the earthquake
     */
    public String getmLocation() {
        return mLocation;
    }

    /**
     * @return date of the earthquake
     */
    public String getmDate() {
        return mDate;
    }
}
