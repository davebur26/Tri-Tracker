package com.example.davidburnett.tritracker;



/**
 * Created by davidburnett on 22/09/2017.
 */

public class Activity{

    private String name;
    private Discipline discipline;
    private String dateString;
    //    LocalDate date;
    private int distance;
//    LocalTime time;
    private String timeString;


    public Activity(String name, Discipline discipline, String dateString, int distance, String timeString){
        this.name = name;
        this.dateString = dateString;
        this.distance = distance;
        this.timeString = timeString;
        this.discipline = discipline;
//        time = new Time(timeString);
//        date = LocalDate.parse(dateString);

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
}
