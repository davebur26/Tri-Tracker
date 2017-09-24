package com.example.davidburnett.tritracker.Sorter;

import android.app.Activity;

import com.example.davidburnett.tritracker.Workout;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by davidburnett on 24/09/2017.
 */

public class DistanceSorter {

    ArrayList<Workout> activities = new ArrayList<>();

    public DistanceSorter(ArrayList<Workout> activities){
        this.activities = activities;
    }

    public ArrayList<Workout> getSortedWorkoutByDistance(Order order){
        Collections.sort(activities, Workout.distanceComparator);
        if (order == Order.LoToHi){
            Collections.reverse(activities);
        }
        return activities;
    }
}
