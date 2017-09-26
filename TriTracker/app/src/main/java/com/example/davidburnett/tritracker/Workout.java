package com.example.davidburnett.tritracker;


import android.support.annotation.NonNull;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;

import javax.xml.datatype.Duration;

/**
 * Created by davidburnett on 22/09/2017.
 */

public class Workout {

    private String name;
    private Discipline discipline;
    private String dateString;
    private Calendar date;
    private long time;
    private int distance;

    private String timeString;


    public Workout(String name, Discipline discipline, String dateString, int distance, long time) {
        this.name = name;
        this.dateString = dateString;
        this.distance = distance;
        this.discipline = discipline;
        this.time = time;
        date = null;
//        time = null;
//        convertDateTimeFromString();
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

    public long getTime() {
        return time;
    }

    public void convertDateTimeFromString() {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
//        date = Calendar.getInstance();

//        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss", Locale.ENGLISH);
//        time = Calendar.getInstance();
//
//        try {
//
//            Date timeA = new SimpleDateFormat("hh:mm:ss", Locale.ENGLISH).parse(timeString);
//            date.setTime(timeA);
//
//
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
    }

    public static Comparator<Workout> distanceComparator = new Comparator<Workout>() {
        @Override
        public int compare(Workout workoutA, Workout workoutB) {
            return (workoutB.getDistance() < workoutA.getDistance() ? -1 :
                    (workoutB.getDistance() == workoutA.getDistance() ? 0 : 1));
        }
    };

    public static Comparator<Workout> timeComparator = new Comparator<Workout>() {
        @Override
        public int compare(Workout workoutA, Workout workoutB) {
            return (workoutB.getTime() < workoutA.getTime() ? -1 :
                    (workoutB.getTime() == workoutA.getTime() ? 0 : 1));
        }
    };

//    @Override
//    public String toString() {
//        return "Distance:" + this.distance;
//    }



}
