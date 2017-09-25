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

        long athleteADist = 0;
        long athleteBDist = 0;


        if (athleteALog != null) {
            athleteADist = athleteALog.get(0).getTime();
        }

        if (athleteBLog != null) {
            athleteBDist = athleteBLog.get(0).getTime();
        }

        return Long.valueOf(athleteADist).compareTo(Long.valueOf(athleteBDist));

    }
}

