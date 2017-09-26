package com.example.davidburnett.tritracker.Sorter;

import com.example.davidburnett.tritracker.Athlete;
import com.example.davidburnett.tritracker.Discipline;
import com.example.davidburnett.tritracker.Workout;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by davidburnett on 25/09/2017.
 */

public class AthleteTimeComparator implements Comparator<Athlete>{

    Discipline discipline;

    public AthleteTimeComparator(Discipline discipline){
        this.discipline = discipline;
    }

    public int compare(Athlete athleteA, Athlete athleteB) {
        ArrayList<Workout> athleteALog = athleteA.getDisciplineLog(this.discipline);
        ArrayList<Workout> athleteBLog = athleteB.getDisciplineLog(this.discipline);

        //        Assumes athlete has no time and assigns infinite value
        long athleteATime = Long.MAX_VALUE;
        long athleteBTime = Long.MAX_VALUE;

        //        Finds time for comparison A if athlete has a time in specified discipline
        if (athleteALog != null){
            if (athleteALog.size() > 0){
                athleteATime = athleteALog.get(0).getTime();
            }
        }

        //        Finds time for comparison B if athlete has a time in specified discipline
        if (athleteBLog != null){
            if (athleteBLog.size() > 0){
                athleteBTime = athleteBLog.get(0).getTime();
            }
        }

        //        compares which two athleteLogs and returns a long to determine who is higher/lower
        return Long.valueOf(athleteATime).compareTo(Long.valueOf(athleteBTime));

    }
}

