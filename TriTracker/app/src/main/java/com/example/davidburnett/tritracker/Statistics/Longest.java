package com.example.davidburnett.tritracker.Statistics;


import com.example.davidburnett.tritracker.Athlete;
import com.example.davidburnett.tritracker.Discipline;
import com.example.davidburnett.tritracker.Sorter.AthleteDistanceComparator;
import com.example.davidburnett.tritracker.Sorter.Order;
import com.example.davidburnett.tritracker.Sorter.Sorter;
import com.example.davidburnett.tritracker.Workout;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by davidburnett on 23/09/2017.
 */

public class Longest implements Statistic {

    Sorter sorter;
    Discipline discipline;
    Integer time;
    int year;
    int month;

    public Longest(Discipline discipline) {
        this.discipline = discipline;
        time = Integer.MAX_VALUE;
    }

    public Longest(Discipline discipline, int time) {
        this.discipline = discipline;
        this.time = time*60; //converts from minutes to seconds
    }

    public Longest(Discipline discipline, int time, int year) {
        this.discipline = discipline;
        this.time = time*60; //converts from minutes to seconds
        this.year = year;
    }

    public Longest(Discipline discipline, int time, int year, int month) {
        this.discipline = discipline;
        this.time = time*60; //converts from minutes to seconds
        this.year = year;
        this.month =month;
    }

    // Removes workouts which are shorter than the specified distance
    public void removeWorkoutsThatAreTooLong(ArrayList<Athlete> athletesToAnalyse){
        // creates an empty array for populating of workouts which are too short in distance
        ArrayList<Workout> workoutToRemove = new ArrayList<>();

        for (Athlete athlete: athletesToAnalyse) {
            // gets the athlete's workouts for specified discipline
            ArrayList<Workout> athleteDisciplineLog = athlete.getDisciplineLog(this.discipline);

            // checks if the discipline log is null
            if (athleteDisciplineLog != null){
                for (Workout workout: athleteDisciplineLog) {
                    // checks if workouts distance meets requirement
                    if (workout.getTime() > this.time) {
                        // add workout to removal array if true
                        workoutToRemove.add(workout);
                        //not overridden if year = 0. ignores if year matches year being filtered
                    } else if (year != 0 && workout.getYear()!= year){
                        workoutToRemove.add(workout);
                        //not overridden if month = 0. ignores if month matches year being filtered
                    } else if (year !=0 && month !=0 && workout.getMonth() != month){
                        workoutToRemove.add(workout);
                    }
                }
                // removes all workouts which did not make the requirement
                athlete.getActivityLog().get(this.discipline).removeAll(workoutToRemove);
                // clears the removal array for next iteration of loop
                workoutToRemove.clear();
            }
        }
    }

    // Sorts the athletes putting the longest workout at index 0
    public void sortAthletesIndividualWorkoutsLongestFirst(ArrayList<Athlete> athletesToAnalyse){
        for (Athlete athlete : athletesToAnalyse) {
            sorter = new Sorter(athlete.getDisciplineLog(discipline));
            sorter.workoutByDistance(Order.HiToLo);
        }
    }

    public void rankAthletesHiToLo(ArrayList<Athlete> athletesToAnalyse){
            Collections.sort(athletesToAnalyse, new AthleteDistanceComparator(this.discipline));
    }

    public void resultsPrint(ArrayList<Athlete> results){
          // Position of the athlete in results
        int position = 1;
        String format = "| %-8s | %-16s | %-14s| %n";
        System.out.println();
        System.out.println("LONGEST " + this.discipline + " RESULTS");
          // If statements adjusts Details depending if time/year/month are applied in constructor
        if(time != Integer.MAX_VALUE) System.out.println("DETAILS:");
        if(time != Integer.MAX_VALUE) System.out.print("SUB: " + time/60 + " mins");
        if(year > 0)System.out.print(" // YEAR: " + year);
        if(month > 0)System.out.print(" // MONTH: " + month);
        System.out.println();
        System.out.println("===========+==================+================");
        System.out.printf(format, "POSITION", "NAME", "DISTANCE (km)");
        System.out.println("===========+==================+================");

          //loops through results array and outputs the required info. Outputs 0 if object is null
        for (Athlete athlete: results){

            int athleteDistance = 0;
            ArrayList<Workout> athleteNullCheck = athlete.getDisciplineLog(this.discipline);

            if (athleteNullCheck != null) {
                if (athleteNullCheck.size() > 0){
                    athleteDistance = athleteNullCheck.get(0).getDistance();
                }
            }

              // prints the athletes stats to terminal
            System.out.printf(format, position, athlete.getName(), athleteDistance);
            System.out.println("-----------+------------------+----------------");

            position ++;


        }
    }

      // runner function as part of the Statistic interface
    public ArrayList<Athlete> statForAthletes(ArrayList<Athlete> athletesToAnalyse){
        removeWorkoutsThatAreTooLong(athletesToAnalyse);
        sortAthletesIndividualWorkoutsLongestFirst(athletesToAnalyse);
        rankAthletesHiToLo(athletesToAnalyse);
        resultsPrint(athletesToAnalyse);
        return athletesToAnalyse;
    }

}
