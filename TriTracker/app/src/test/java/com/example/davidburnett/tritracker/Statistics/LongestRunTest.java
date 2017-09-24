package com.example.davidburnett.tritracker.Statistics;

import com.example.davidburnett.tritracker.Analyser;
import com.example.davidburnett.tritracker.Athlete;
import com.example.davidburnett.tritracker.Discipline;
import com.example.davidburnett.tritracker.Workout;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by davidburnett on 23/09/2017.
 */
public class LongestRunTest {

    private Athlete athlete1;
    private Athlete athlete2;

    private Workout workout1;
    private Workout workout2;
    private Workout workout3;
    private Workout workout4;
    private Workout workout5;
    private Workout workout6;

    private Analyser analyser;

    private LongestRun longestRun;

    @Before
    public void before(){

        workout1 = new Workout("morning run", Discipline.RUN, "22/09/17",10000, "00:45:12");
        workout2 = new Workout("afternoon run", Discipline.RUN, "23/09/17",20000, "01:30:52");
        workout3 = new Workout("afternoon bike", Discipline.BIKE, "25/10/17",50000, "03:04:23");
        athlete1 = new Athlete("Dave");

        workout4 = new Workout("lunch run", Discipline.RUN, "04/03/16",15000, "01:00:12");
        workout5 = new Workout("night swim", Discipline.SWIM, "10/06/16",25000, "01:45:29");
        workout6 = new Workout("afternoon bike", Discipline.BIKE, "16/02/16",100000, "07:00:00");
        athlete2 = new Athlete("Neil");

        athlete1.addActivityToLog(workout1);
        athlete1.addActivityToLog(workout2);
        athlete1.addActivityToLog(workout3);

        athlete2.addActivityToLog(workout4);
        athlete2.addActivityToLog(workout5);
        athlete2.addActivityToLog(workout6);


        longestRun = new LongestRun();

        analyser = new Analyser();



    }


    @Test
    public void testLongestRun(){

        ArrayList<Athlete> athletesToAnalyse = new ArrayList<>();
        athletesToAnalyse.add(athlete1);
        athletesToAnalyse.add(athlete2);

//        ArrayList<Athlete> analysedAthletes = longestRun.statForAthletes(athletesToAnalyse);

//        assertEquals(athlete1, analysedAthletes.get(0));
    }

}