package com.example.davidburnett.tritracker.Statistics;

import android.app.Activity;

import com.example.davidburnett.tritracker.Athlete;
import com.example.davidburnett.tritracker.Discipline;
import com.example.davidburnett.tritracker.Sorter.AthleteDistanceComparator;
import com.example.davidburnett.tritracker.Sorter.Order;
import com.example.davidburnett.tritracker.Sorter.Sorter;
import com.example.davidburnett.tritracker.Workout;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by davidburnett on 23/09/2017.
 */

public class LongestRun{       //implements Statistic {

    ArrayList<Athlete> athletesToAnalyse;
    Sorter sorter;
    ArrayList<Athlete> sorted;

    public LongestRun(ArrayList<Athlete> athletesToAnalyse){
        this.athletesToAnalyse = new ArrayList<>(athletesToAnalyse);
        sorted = sortAthletesIndividualWorkoutsLongestFirst(this.athletesToAnalyse);
        rankAthletesHiToLo();
    }

    public ArrayList<Athlete> sortAthletesIndividualWorkoutsLongestFirst(ArrayList<Athlete> athletesToAnalyse){
        for (Athlete athlete : athletesToAnalyse) {
            sorter = new Sorter(athlete.getDisciplineLog(Discipline.RUN));
            sorter.workoutByDistance(Order.HiToLo);
            System.out.println(athlete.getDisciplineLog(Discipline.RUN));

    }
        return athletesToAnalyse;

    }

    public void rankAthletesHiToLo(){

        Collections.sort(sorted, new AthleteDistanceComparator(Discipline.RUN));
        for (Athlete athlete: athletesToAnalyse){
            System.out.println(athlete.getDisciplineLog(Discipline.RUN));
        }

    }

    public ArrayList<Athlete> results(){
        return this.athletesToAnalyse;
    }



}
