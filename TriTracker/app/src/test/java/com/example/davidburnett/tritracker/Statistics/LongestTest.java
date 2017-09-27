package com.example.davidburnett.tritracker.Statistics;

import com.example.davidburnett.tritracker.Athlete;
import com.example.davidburnett.tritracker.Database;
import com.example.davidburnett.tritracker.Discipline;

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
    public void testLongestSwim() {
        longestRun = new Longest(Discipline.SWIM,300, 17,9);
        resultsRun = longestRun.statForAthletes(athletesToAnalyse);
        assertEquals("Barry", resultsRun.get(0).getName());
    }

    @Test
    public void testLongestBike(){
        longestBike = new Longest(Discipline.BIKE);
        resultsBike = longestBike.statForAthletes(athletesToAnalyse);
        assertEquals("Sally", resultsBike.get(0).getName());
    }

    @Test
    public void testLongestRun(){
        longestBike = new Longest(Discipline.RUN, 20, 17);
        resultsBike = longestBike.statForAthletes(athletesToAnalyse);
        assertEquals("Claire", resultsBike.get(0).getName());
    }



}