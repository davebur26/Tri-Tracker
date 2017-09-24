package com.example.davidburnett.tritracker.Sorter;

import android.app.Activity;

import com.example.davidburnett.tritracker.Athlete;
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

    public ArrayList<Workout> workoutByDistance(Order order) {
        Collections.sort(workouts, Workout.distanceComparator);
        if (order == Order.LoToHi) {
            Collections.reverse(workouts);
        }
        return workouts;
    }
}


