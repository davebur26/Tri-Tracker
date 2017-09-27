package com.example.davidburnett.tritracker;

import org.junit.Before;
import org.junit.Test;

import java.sql.Time;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.xml.datatype.Duration;

import static org.junit.Assert.*;

/**
 * Created by davidburnett on 22/09/2017.
 */
public class WorkoutTest {

    private Workout workout1;
    private Workout workout2;

    @Before
    public void before(){

        workout1 = new Workout(Discipline.RUN, "22/01/2017",10000, 2980);
        workout2 = new Workout(Discipline.RUN, "29/09/2017",10000, 3000);


    }

    @Test
    public void testActivityInfo(){
        assertEquals(Discipline.RUN, workout1.getDiscipline());
//        assertEquals(1, workout1.getDate().get(Calendar.MONTH)+1);
        assertEquals(10000, workout1.getDistance(), 1e-6);
        assertEquals(4.9, workout1.getAveragePace(), 1e-4);
//        assertEquals(13, workout1.getTime().get(Calendar.HOUR_OF_DAY));
    }



}