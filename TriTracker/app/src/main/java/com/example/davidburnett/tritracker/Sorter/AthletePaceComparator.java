package com.example.davidburnett.tritracker.Sorter;

import com.example.davidburnett.tritracker.Athlete;
import com.example.davidburnett.tritracker.Discipline;
import com.example.davidburnett.tritracker.Workout;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by davidburnett on 25/09/2017.
 */

public class AthletePaceComparator implements Comparator<Athlete>{

    Discipline discipline;

    public AthletePaceComparator(Discipline discipline){
        this.discipline = discipline;
    }

    public int compare(Athlete athleteA, Athlete athleteB) {
        ArrayList<Workout> athleteALog = athleteA.getDisciplineLog(this.discipline);
        ArrayList<Workout> athleteBLog = athleteB.getDisciplineLog(this.discipline);

        //        Assumes athlete has no time and assigns infinite value
        double athleteAPace = Double.MAX_VALUE;
        double athleteBPace = Double.MAX_VALUE;

        //        Finds time for comparison A if athlete has a time in specified discipline
        if (athleteALog != null){
            if (athleteALog.size() > 0){
                athleteAPace = athleteALog.get(0).getAveragePace();
            }
        }

        //        Finds time for comparison B if athlete has a time in specified discipline
        if (athleteBLog != null){
            if (athleteBLog.size() > 0){
                athleteBPace = athleteBLog.get(0).getAveragePace();
            }
        }

        //        compares which two athleteLogs and returns a long to determine who is higher/lower
        return Double.valueOf(athleteAPace).compareTo(Double.valueOf(athleteBPace));

    }
}

