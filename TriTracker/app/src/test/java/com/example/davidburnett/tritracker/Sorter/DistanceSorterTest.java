package com.example.davidburnett.tritracker.Sorter;

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
    Sorter sorter;
    ArrayList<Workout> workouts;
    ArrayList<Workout> sortedWorkoutByDistance;


    @Before
    public void before() {
        workout1 = new Workout("morning run", Discipline.RUN, "22/09/17", 40000, 1234);
        workout2 = new Workout("afternoon run", Discipline.RUN, "22/09/17", 20000, 2345);
        workout3 = new Workout("afternoon bike", Discipline.RUN, "22/09/17", 50000, 8765);
        Athlete athlete = new Athlete("Dave");
        athlete.addActivityToLog(workout1);
        athlete.addActivityToLog(workout2);
        athlete.addActivityToLog(workout3);
        workouts = athlete.getDisciplineLog(Discipline.RUN);

        sorter = new Sorter(workouts);
        sortedWorkoutByDistance = sorter.workoutByDistance(Order.HiToLo);
        System.out.println(sortedWorkoutByDistance);
        System.out.println(athlete.getDisciplineLog(Discipline.RUN));



//        System.out.println(workouts);
    }



    @Test
        public void testArrayHasWorkouts(){
        assertEquals(3, workouts.size());

        }
    }
