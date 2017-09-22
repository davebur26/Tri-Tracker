package com.example.davidburnett.tritracker;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by davidburnett on 22/09/2017.
 */
public class ActivityTest {

    private Activity activity1;

    @Before
    public void before(){
        activity1 = new Activity("morning run", Discipline.RUN, "22/09/17",10000, "00:45:12");
    }

    @Test
    public void testActivityInfo(){
        assertEquals("morning run", activity1.getName());
        assertEquals(Discipline.RUN, activity1.getDiscipline());
        assertEquals("22/09/17", activity1.getDate());
        assertEquals(10000, activity1.getDistance(), 1e-6);
        assertEquals("00:45:12", activity1.getTime());
    }

}