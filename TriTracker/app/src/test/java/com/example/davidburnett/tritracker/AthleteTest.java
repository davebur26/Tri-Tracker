package com.example.davidburnett.tritracker;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by davidburnett on 22/09/2017.
 */
public class AthleteTest {

    private Workout workout1;
    private Workout workout2;
    private Workout workout3;
    private Athlete athlete;

    @Before
    public void before(){
        workout1 = new Workout("morning run", Discipline.RUN, "22/09/17",10000, "00:45:12");
        workout2 = new Workout("afternoon run", Discipline.RUN, "22/09/17",20000, "01:30:52");
        workout3 = new Workout("afternoon bike", Discipline.BIKE, "22/09/17",50000, "03:04:23");
        athlete = new Athlete("Dave");
    }

    @Test
    public void testAthleteHasName(){
        assertEquals("Dave", athlete.getName());
    }

    @Test
    public void testAddActivityToDisciplineLog(){
        athlete.addActivityToLog(workout1);
        assertEquals(workout1,athlete.getDisciplineLog(Discipline.RUN).get(0));
        athlete.addActivityToLog(workout2);
        assertEquals(workout2,athlete.getDisciplineLog(Discipline.RUN).get(1));
        athlete.addActivityToLog(workout3);
        assertEquals(workout3,athlete.getDisciplineLog(Discipline.BIKE).get(0));
        assertEquals(true, athlete.getActivityLog().containsKey(Discipline.BIKE));
        assertEquals(false, athlete.getActivityLog().containsKey(Discipline.SWIM));
    }

}