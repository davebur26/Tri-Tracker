package com.example.davidburnett.tritracker.Statistics;

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
public class LongestTest {

    private Athlete athlete1;
    private Athlete athlete2;

    private Workout workout1;
    private Workout workout2;
    private Workout workout3;
    private Workout workout4;
    private Workout workout5;
    private Workout workout6;

    private Longest longestDiscipline;
    private Quickest quickestInDiscipline;

    ArrayList<Athlete> athletesToAnalyse;
    ArrayList<Athlete> results;


    @Before
    public void before(){

        workout1 = new Workout("morning run", Discipline.RUN, "22/09/17",10000, 999999);
        workout2 = new Workout("afternoon run", Discipline.RUN, "23/09/17",20000, 94567);
        workout3 = new Workout("afternoon bike", Discipline.RUN, "25/10/17",50000, 123456);
        athlete1 = new Athlete("Dave");

        workout4 = new Workout("lunch run", Discipline.RUN, "04/03/16",15000, 77887);
        workout5 = new Workout("night swim", Discipline.RUN, "10/06/16",25000, 1234);
        workout6 = new Workout("afternoon bike", Discipline.SWIM, "16/02/16",100000, 234234);
        athlete2 = new Athlete("Neil");

        athlete1.addActivityToLog(workout1);
        athlete1.addActivityToLog(workout2);
        athlete1.addActivityToLog(workout3);

        athlete2.addActivityToLog(workout4);
        athlete2.addActivityToLog(workout5);
        athlete2.addActivityToLog(workout6);

        athletesToAnalyse = new ArrayList<>();
        athletesToAnalyse.add(athlete1);
        athletesToAnalyse.add(athlete2);

        longestDiscipline = new Longest(Discipline.BIKE);
        results = longestDiscipline.statForAthletes(athletesToAnalyse);
        quickestInDiscipline = new Quickest(Discipline.BIKE);
        results = quickestInDiscipline.statForAthletes(athletesToAnalyse);

    }


    @Test
    public void testLongestRun(){
//        assertEquals(athlete2, results.get(0));
    }

}