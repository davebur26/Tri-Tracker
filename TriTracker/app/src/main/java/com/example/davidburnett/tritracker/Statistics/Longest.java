package com.example.davidburnett.tritracker.Statistics;


import com.example.davidburnett.tritracker.Athlete;
import com.example.davidburnett.tritracker.Discipline;
import com.example.davidburnett.tritracker.Sorter.AthleteDistanceComparator;
import com.example.davidburnett.tritracker.Sorter.Order;
import com.example.davidburnett.tritracker.Sorter.Sorter;
import com.example.davidburnett.tritracker.Workout;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by davidburnett on 23/09/2017.
 */

public class Longest implements Statistic {

    Sorter sorter;
    ArrayList<Athlete> sorted;
    Discipline discipline;

    public Longest(Discipline discipline) {
            this.discipline = discipline;
    }

    public ArrayList<Athlete> sortAthletesIndividualWorkoutsLongestFirst(ArrayList<Athlete> athletesToAnalyse){
        for (Athlete athlete : athletesToAnalyse) {
            sorter = new Sorter(athlete.getDisciplineLog(discipline));
            sorter.workoutByDistance(Order.HiToLo);
        }

        return athletesToAnalyse;
    }

    public void rankAthletesHiToLo(){
            Collections.sort(sorted, new AthleteDistanceComparator(this.discipline));

    }

    public ArrayList<Athlete> statForAthletes(ArrayList<Athlete> athletesToAnalyse){
        sorted = sortAthletesIndividualWorkoutsLongestFirst(athletesToAnalyse);
        rankAthletesHiToLo();
        resultsPrint(athletesToAnalyse);
        return athletesToAnalyse;
    }

    public void resultsPrint(ArrayList<Athlete> results){
        int position = 1;
        System.out.println("LONGEST " + this.discipline + " RESULTS");
        for (Athlete athlete: results){

            int athleteDistance = 0;
            ArrayList<Workout> athleteNullCheck = athlete.getDisciplineLog(this.discipline);

            if (athleteNullCheck != null){
                 athleteDistance = athlete.getDisciplineLog(this.discipline).get(0).getDistance();
            }

            System.out.println("Position: " + position + ", Name: " + athlete.getName() + " , Distance: " + athleteDistance + "m");
            position ++;
        }
    }

}
