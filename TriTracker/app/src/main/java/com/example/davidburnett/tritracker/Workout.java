package com.example.davidburnett.tritracker;


import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by davidburnett on 22/09/2017.
 */

public class Workout {

    private String name;
    private Discipline discipline;
    private String dateString;
    private Date date;
    private Date time;
    private int distance;

    private String timeString;


    public Workout(String name, Discipline discipline, String dateString, int distance, String timeString){
        this.name = name;
        this.dateString = dateString;
        this.distance = distance;
        this.timeString = timeString;
        this.discipline = discipline;
        date = null;
        time = null;
        convertDateTimeFromString();
    }

    public String getName() {
        return name;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public String getDate() {
        return dateString;
    }

    public int getDistance() {
        return distance;
    }

    public String getTime() {
        return timeString;
    }

    public void convertDateTimeFromString() {
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss", Locale.ENGLISH);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        try {
            date = dateFormat.parse(dateString);
            time = timeFormat.parse(timeString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
