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
 * Created by davidburnett on 26/09/2017.
 */
public class QuickestTest {

    private Quickest quickest10kmRun;
    ArrayList<Athlete> athletesToAnalyse;
    ArrayList<Athlete> results10kmRun;



    @Before
    public void before(){
            Database database = new Database();
            athletesToAnalyse = database.getAthletesToAnalyse();
    }


    @Test
    public void testQuickestSwim(){
        quickest10kmRun = new Quickest(Discipline.SWIM, 15000);
        results10kmRun = quickest10kmRun.statForAthletes(athletesToAnalyse);
        quickest10kmRun.resultsPrint(results10kmRun);

        assertEquals("Neil", results10kmRun.get(0).getName());
    }

}