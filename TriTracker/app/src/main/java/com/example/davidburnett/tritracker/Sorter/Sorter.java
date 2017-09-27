package com.example.davidburnett.tritracker.Sorter;

import com.example.davidburnett.tritracker.Workout;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by davidburnett on 24/09/2017.
 */

public class Sorter {

    ArrayList<Workout> workouts = new ArrayList<>();

    public Sorter(ArrayList<Workout> workouts) {
        this.workouts = workouts;
    }

//    Sorts individual athlete's workouts by distance
    public ArrayList<Workout> workoutByDistance(Order order) {
        if (workouts != null) {
            Collections.sort(workouts, Workout.distanceComparator);
        }
        if (order == Order.LoToHi) {
            Collections.reverse(workouts);
        }
        return workouts;
    }

//    Sorts individual athlete's workouts by time
    public ArrayList<Workout> workoutByTime(Order order) {
        if (workouts != null) {
            Collections.sort(workouts, Workout.paceComparator);
        }
        if ((workouts != null) && (order == Order.LoToHi)) {
            Collections.reverse(workouts);
        }
        return workouts;
    }
}


