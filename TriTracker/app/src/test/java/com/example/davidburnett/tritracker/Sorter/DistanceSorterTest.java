package com.example.davidburnett.tritracker.Sorter;

import android.app.Activity;

import com.example.davidburnett.tritracker.Athlete;
import com.example.davidburnett.tritracker.Discipline;
import com.example.davidburnett.tritracker.Workout;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by davidburnett on 24/09/2017.
 */
public class DistanceSorterTest {

    ArrayList<Workout>activities;
    Workout workout1;
    Workout workout2;
    Workout workout3;
    DistanceSorter distanceSorter;


    @Before
    public void before() {
        workout1 = new Workout("morning run", Discipline.RUN, "22/09/17", 40000, "00:45:12");
        workout2 = new Workout("afternoon run", Discipline.RUN, "22/09/17", 20000, "01:30:52");
        workout3 = new Workout("afternoon bike", Discipline.BIKE, "22/09/17", 50000, "03:04:23");
        activities = new ArrayList<>();
        activities.add(workout1);
        activities.add(workout2);
        activities.add(workout3);
        distanceSorter = new DistanceSorter(activities);
    }



    @Test
        public void testArrayHasWorkouts(){
        assertEquals(3, activities.size());
        ArrayList<Workout>sortedWorkoutByDistance = distanceSorter.getSortedWorkoutByDistance(Order.HiToLo);
        for (Workout workout: sortedWorkoutByDistance){
            System.out.println(workout.getDistance());
        }
    }
}