package com.example.davidburnett.tritracker;

import android.app.Activity;

import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.*;

/**
 * Created by davidburnett on 23/09/2017.
 */
public class AnalyserTest {

    private Athlete athlete1;
    private Athlete athlete2;

    private Workout workout1;
    private Workout workout2;
    private Workout workout3;
    private Workout workout4;
    private Workout workout5;
    private Workout workout6;

    private Analyser analyser;

    @Before
    public void before() {
        workout1 = new Workout(Discipline.RUN, "22/09/17", 10000, 123);
        workout2 = new Workout(Discipline.RUN, "23/09/17", 20000, 456);
        workout3 = new Workout(Discipline.BIKE, "25/10/17", 50000, 987);
        athlete1 = new Athlete("Dave");

        workout4 = new Workout(Discipline.RUN, "04/03/16", 15000, 345);
        workout5 = new Workout(Discipline.SWIM, "10/06/16", 25000, 100);
        workout6 = new Workout(Discipline.BIKE, "16/02/16", 100000, 500);
        athlete2 = new Athlete("Neil");

        athlete1.addActivityToLog(workout1);
        athlete1.addActivityToLog(workout2);
        athlete1.addActivityToLog(workout3);

        athlete2.addActivityToLog(workout1);
        athlete2.addActivityToLog(workout2);
        athlete2.addActivityToLog(workout3);

        analyser = new Analyser();

        analyser.addAthleteToAnalyser(athlete1);
        analyser.addAthleteToAnalyser(athlete2);
    }


    @Test
    public void testAnalyser(){
        assertEquals(2,analyser.getAnalysedAthletes().size());
    }



}