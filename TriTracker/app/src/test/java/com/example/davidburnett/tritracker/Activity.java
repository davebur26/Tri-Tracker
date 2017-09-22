package com.example.davidburnett.tritracker;

import java.sql.Time;
import java.util.Date;

/**
 * Created by davidburnett on 22/09/2017.
 */

public class Activity {

    String name;
    Date date;
    int distance;
    Time time;

    public Activity(String name, Date date, int distance, Time time){
        this.name = name;
        this.date = date;
        this.distance = distance;
        this.time = time;
    }

}
