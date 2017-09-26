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
         ArrayList<Workout> athleteALog = athleteA.getDisciplineLog(this.discipline);
         ArrayList<Workout> athleteBLog = athleteB.getDisciplineLog(this.discipline);

         //        Assumes athlete has no distance and assigns 0 value
         int athleteADist = 0;
         int athleteBDist = 0;

         //        Finds distance for comparison A if athlete has a distance in specified discipline
         if (athleteALog != null){
             if (athleteALog.size() > 0) {
                 athleteADist = athleteALog.get(0).getDistance();
             }
         }

         //        Finds distance for comparison B if athlete has a distance in specified discipline
         if (athleteBLog != null){
             if (athleteBLog.size() > 0) {
                 athleteBDist = athleteBLog.get(0).getDistance();
             }
         }

         //        compares which two athleteLogs and returns a long to determine who is higher/lower
         return athleteBDist - athleteADist;
     }
}
