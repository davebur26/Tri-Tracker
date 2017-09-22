package com.example.davidburnett.tritracker;

import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Created by davidburnett on 22/09/2017.
 */
public class AthleteTest {

    Activity activity1;
    Activity activity2;
    Athlete athlete;

    @Before
    public void before(){
        activity1 = new Activity("morning run", Discipline.RUN, "22/09/17",10000, "00:45:12");
        activity1 = new Activity("afternoon run", Discipline.RUN, "22/09/17",10000, "00:45:12");
        athlete = new Athlete("Dave");
    }

}