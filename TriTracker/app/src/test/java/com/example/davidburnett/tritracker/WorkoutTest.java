package com.example.davidburnett.tritracker;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by davidburnett on 22/09/2017.
 */
public class WorkoutTest {

    private Workout workout1;

    @Before
    public void before(){
        workout1 = new Workout("morning run", Discipline.RUN, "22/09/2017",10000, "13:45:12");
    }

    @Test
    public void testActivityInfo(){
        assertEquals("morning run", workout1.getName());
        assertEquals(Discipline.RUN, workout1.getDiscipline());
        assertEquals("22/09/2017", workout1.getDate());
        assertEquals(10000, workout1.getDistance(), 1e-6);
        assertEquals("13:45:12", workout1.getTime());
    }

}