package com.example.davidburnett.tritracker.Statistics;


import com.example.davidburnett.tritracker.Athlete;
import com.example.davidburnett.tritracker.Discipline;
import com.example.davidburnett.tritracker.Sorter.AthleteDistanceComparator;
import com.example.davidburnett.tritracker.Sorter.Order;
import com.example.davidburnett.tritracker.Sorter.Sorter;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by davidburnett on 23/09/2017.
 */

public class LongestRun implements Statistic {

    Sorter sorter;
    ArrayList<Athlete> sorted;

    public ArrayList<Athlete> sortAthletesIndividualWorkoutsLongestFirst(ArrayList<Athlete> athletesToAnalyse){
        for (Athlete athlete : athletesToAnalyse) {
            sorter = new Sorter(athlete.getDisciplineLog(Discipline.RUN));
            sorter.workoutByDistance(Order.HiToLo);
        }

        return athletesToAnalyse;
    }

    public void rankAthletesHiToLo(){
        Collections.sort(sorted, new AthleteDistanceComparator(Discipline.RUN));
    }

    public ArrayList<Athlete> statForAthletes(ArrayList<Athlete> athletesToAnalyse){
        sorted = sortAthletesIndividualWorkoutsLongestFirst(athletesToAnalyse);
        rankAthletesHiToLo();
        resultsPrint(athletesToAnalyse);
        return athletesToAnalyse;
    }

    public void resultsPrint(ArrayList<Athlete> results){
        int position = 1;
        for (Athlete athlete: results){
            System.out.println("Position: " + position + ", Name: " + athlete.getName() + " , Distance: " + athlete.getDisciplineLog(Discipline.RUN).get(0).getDistance() + "m");
            position ++;
        }
    }



}
