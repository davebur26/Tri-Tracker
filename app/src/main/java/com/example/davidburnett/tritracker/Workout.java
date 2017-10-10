package com.example.davidburnett.tritracker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Locale;

/**
 * Created by davidburnett on 22/09/2017.
 */

public class Workout {

    private Discipline discipline;
    private String dateString;
    private Calendar date;
    private long time;
    private int distance;


    public Workout(Discipline discipline, String dateString, int distance, long time) {
        this.dateString = dateString;
        this.distance = distance;
        this.discipline = discipline;
        this.time = time;
        date = convertToCalenderDateFromString();
    }


    public Discipline getDiscipline() {
        return discipline;
    }

    public int getMonth() {
        return date.get(Calendar.MONTH) + 1;
    }

    public int getYear() {
        return date.get(Calendar.YEAR);
    }

    public int getDistance() {
        return distance;
    }

    public long getTime() {
        return time;
    }

    public double getAveragePace(){
        double paceTime = this.time/60;
        double paceDist = this.distance/1000;
        double pace = Math.round(paceTime/paceDist * 100.0) / 100.0;
        return pace;
    }

    public Calendar convertToCalenderDateFromString() {
        try {
            date = Calendar.getInstance();

            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

            date.setTime(format.parse(dateString));

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date;
    }

      // compares two distance values and assigns a -1 0 1 depending on their order
    public static Comparator<Workout> distanceComparator = new Comparator<Workout>() {
        @Override
        public int compare(Workout workoutA, Workout workoutB) {
            return (workoutB.getDistance() < workoutA.getDistance() ? -1 :
                    (workoutB.getDistance() == workoutA.getDistance() ? 0 : 1));
        }
    };

      // compares two pace values and assigns a -1 0 1 depending on their order
    public static Comparator<Workout> paceComparator = new Comparator<Workout>() {
        @Override
        public int compare(Workout workoutA, Workout workoutB) {
            return (workoutB.getAveragePace() < workoutA.getAveragePace() ? -1 :
                    (workoutB.getAveragePace() == workoutA.getAveragePace() ? 0 : 1));
        }
    };

}
