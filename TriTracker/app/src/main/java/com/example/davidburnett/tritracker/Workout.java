package com.example.davidburnett.tritracker;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
    private Calendar date;
    private Calendar time;
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

    public Calendar getDate() {
        return date;
    }

    public int getDistance() {
        return distance;
    }

    public Calendar getTime() {
        return time;
    }

    public void convertDateTimeFromString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        date = Calendar.getInstance();

        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss", Locale.ENGLISH);
        time = Calendar.getInstance();
        
        try {
            date.setTime(dateFormat.parse(dateString));
            time.setTime(timeFormat.parse(timeString));

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }


}
