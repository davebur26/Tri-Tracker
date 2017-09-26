package com.example.davidburnett.tritracker.Statistics;

import com.example.davidburnett.tritracker.Athlete;
import com.example.davidburnett.tritracker.Database;
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

    private Longest longestRun;
    private Longest longestBike;

    ArrayList<Athlete> athletesToAnalyse;
    ArrayList<Athlete> resultsRun;
    ArrayList<Athlete> resultsBike;

    @Before
    public void before(){
        Database database = new Database();
        athletesToAnalyse = database.getAthletesToAnalyse();
    }


    @Test
    public void testLongestRun(){
        longestRun = new Longest(Discipline.SWIM);
        resultsRun = longestRun.statForAthletes(athletesToAnalyse);

        assertEquals("Neil", resultsRun.get(0).getName());

    }@Test
    public void testLongestBike(){
        longestBike = new Longest(Discipline.BIKE);
        resultsBike = longestBike.statForAthletes(athletesToAnalyse);
//        longestBike.resultsPrint(resultsBike);


        assertEquals("Dave", resultsBike.get(0).getName());
    }



}