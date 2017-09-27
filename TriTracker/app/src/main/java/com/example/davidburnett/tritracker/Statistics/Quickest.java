package com.example.davidburnett.tritracker.Statistics;

import com.example.davidburnett.tritracker.Athlete;
import com.example.davidburnett.tritracker.Discipline;
import com.example.davidburnett.tritracker.Sorter.AthletePaceComparator;
import com.example.davidburnett.tritracker.Sorter.Order;
import com.example.davidburnett.tritracker.Sorter.Sorter;
import com.example.davidburnett.tritracker.Workout;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by davidburnett on 25/09/2017.
 */

public class Quickest implements Statistic{

    Sorter sorter;
    Discipline discipline;
    int distance;

    public Quickest(Discipline discipline, int distance){
        this.discipline = discipline;
        this.distance = distance;
    }

    // Removes workouts which are shorter than the specified distance
    public void removeWorkoutsThatAreTooShort(ArrayList<Athlete> athletesToAnalyse){
        // creates an empty array for populating of workouts which are too short in distance
        ArrayList<Workout> workoutToRemove = new ArrayList<>();

        for (Athlete athlete: athletesToAnalyse) {
            // gets the athlete's workouts for specified discipline
            ArrayList<Workout> athleteDisciplineLog = athlete.getDisciplineLog(this.discipline);

            // checks if the discipline log is null
            if (athleteDisciplineLog != null){
                for (Workout workout: athleteDisciplineLog) {
                    // checks if workouts distance meets requirement
                    if (workout.getDistance() < this.distance) {
                        // add workout to removal array if true
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

      // Sorts individuals athletes workouts for specified discipline from quickest to slowest
    public ArrayList<Athlete> sortAthletesIndividualWorkoutsQuickestFirst(ArrayList<Athlete> athletesToAnalyse){
        for (Athlete athlete : athletesToAnalyse) {
            sorter = new Sorter(athlete.getDisciplineLog(discipline));
            sorter.workoutByTime(Order.LoToHi);
        }
        return athletesToAnalyse;
    }

      // Re-orders the athletes to analyse array from lo to hi.
    public void rankAthletesLoToHi(ArrayList<Athlete> athletesToAnalyse){
        Collections.sort(athletesToAnalyse, new AthletePaceComparator(this.discipline));
    }


      // Formats the results and prints to terminal
    public void resultsPrint(ArrayList<Athlete> results) {
        int position = 1;

        // Creates a title for the output.

        String format = "| %-8s | %-16s | %-15s| %-15s| %-14s| %n";
        System.out.println();
        System.out.println("QUICKEST " + (this.distance/1000) + "KM " + this.discipline + " RESULTS");
        System.out.println("===========+==================+================+================+================");
        System.out.printf(format, "POSITION", "NAME", "PACE (mins/km)", "TIME(hh/mm/ss)", "DISTANCE (km)");
        System.out.println("===========+==================+================+================+================");


        // Loops through each athlete in results
        for (Athlete athlete : results) {

            // Initially sets the athletes time to 0
            String athletePace = "0";
            String athleteDist = "0";
            String athleteTime = "0";
            // Creates an array for null checking
            ArrayList<Workout> athleteNullCheck = athlete.getDisciplineLog(this.discipline);

            // if array is not null, retrieves athletes times
            if (athleteNullCheck != null) {
                if (athleteNullCheck.size() > 0) {

                    Double athletePaceDouble = athlete.getDisciplineLog(this.discipline).get(0).getAveragePace();
                    athletePace = timeFormatConverterMS(athletePaceDouble);

                    Integer athleteDistInt = athlete.getDisciplineLog(this.discipline).get(0).getDistance();
                    athleteDist = athleteDistInt.toString();

                    Long athleteTimeLong = athlete.getDisciplineLog(this.discipline).get(0).getTime();
                    athleteTime = timeFormatConverterHMS(athleteTimeLong);
                }
            }

            // prints the athletes stats to terminal
            System.out.printf(format, position, athlete.getName(), athletePace, athleteTime, athleteDist);
            System.out.println("-----------+------------------+----------------+----------------+----------------");

            position++;
        }
    }




      // Converts long seconds into hh:mm:ss format
    public String timeFormatConverterHMS(long seconds){
        long second = (seconds) % 60;
        long minute = (seconds / 60) % 60;
        long hour = (seconds / (60 * 60)) % 24;

        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // Converts double mins into mm:ss format
    public String timeFormatConverterMS(double mins){
        Integer minute = (int) mins;
        Integer second = (int) ((mins - (double) minute) * 60);
        return String.format("%2s:%2s", minute.toString(), second.toString());
    }

      // Runner for all functions
    public ArrayList<Athlete> statForAthletes(ArrayList<Athlete> athletesToAnalyse){
        removeWorkoutsThatAreTooShort(athletesToAnalyse);
        sortAthletesIndividualWorkoutsQuickestFirst(athletesToAnalyse);
        rankAthletesLoToHi(athletesToAnalyse);
        return athletesToAnalyse;
    }

}





