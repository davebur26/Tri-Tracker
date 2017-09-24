package com.example.davidburnett.tritracker.Sorter;

import com.example.davidburnett.tritracker.Athlete;
import com.example.davidburnett.tritracker.Discipline;

import java.util.Collections;
import java.util.Comparator;

/**
 * Created by davidburnett on 24/09/2017.
 */

public class AthleteDistanceComparator implements Comparator<Athlete> {

    Discipline discipline;

    public AthleteDistanceComparator(Discipline discipline){
        this.discipline = discipline;
    }
     public int compare(Athlete athleteA, Athlete athleteB) {
             return athleteB.getDisciplineLog(this.discipline).get(0).getDistance()
                    - athleteA.getDisciplineLog(this.discipline).get(0).getDistance();
     }
}
