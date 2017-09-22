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
    private Athlete athlete;

    @Before
    public void before(){
        workout1 = new Workout("morning run", Discipline.RUN, "22/09/17",10000, "00:45:12");
        workout2 = new Workout("afternoon run", Discipline.RUN, "22/09/17",10000, "00:45:12");
        athlete = new Athlete("Dave");
    }

    @Test
    public void testAddActivityToDisciplineLog(){
        assertEquals(0,athlete.getDisciplineLog().size());
        athlete.addActivityToDisciplineLog(workout1);
        assertEquals(1,athlete.getDisciplineLog().size());

    }

}