package com.example.davidburnett.tritracker.Sorter;

import com.example.davidburnett.tritracker.Athlete;
import com.example.davidburnett.tritracker.Discipline;
import com.example.davidburnett.tritracker.Workout;

import java.util.ArrayList;
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
         ArrayList<Workout> athleteAlog = athleteA.getDisciplineLog(this.discipline);
         ArrayList<Workout> athleteBlog = athleteB.getDisciplineLog(this.discipline);

         int athleteADist = 0;
         int athleteBDist = 0;

         if (athleteAlog != null) {
             athleteADist = athleteAlog.get(0).getDistance();
         }

         if (athleteBlog != null) {
             athleteBDist = athleteBlog.get(0).getDistance();
         }

         return athleteBDist - athleteADist;
     }
}
