package com.example.davidburnett.tritracker.Statistics;

import com.example.davidburnett.tritracker.Athlete;
import com.example.davidburnett.tritracker.Discipline;
import com.example.davidburnett.tritracker.Sorter.AthleteDistanceComparator;
import com.example.davidburnett.tritracker.Sorter.AthleteTimeComparator;
import com.example.davidburnett.tritracker.Sorter.Order;
import com.example.davidburnett.tritracker.Sorter.Sorter;
import com.example.davidburnett.tritracker.Workout;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by davidburnett on 25/09/2017.
 */

public class Quickest implements Statistic{

    Sorter sorter;
    ArrayList<Athlete> sorted;
    Discipline discipline;

    public Quickest(Discipline discipline){
        this.discipline = discipline;
    }

    public ArrayList<Athlete> sortAthletesIndividualWorkoutsQuickestFirst(ArrayList<Athlete> athletesToAnalyse){
        for (Athlete athlete : athletesToAnalyse) {
            sorter = new Sorter(athlete.getDisciplineLog(discipline));
            sorter.workoutByTime(Order.LoToHi);
        }

        return athletesToAnalyse;
    }

    public void rankAthletesLoToHi(){
        Collections.sort(sorted, new AthleteTimeComparator(this.discipline));

    }

    public ArrayList<Athlete> statForAthletes(ArrayList<Athlete> athletesToAnalyse){
        sorted = sortAthletesIndividualWorkoutsQuickestFirst(athletesToAnalyse);
        rankAthletesLoToHi();
        resultsPrint(athletesToAnalyse);
        return athletesToAnalyse;
    }

    public void resultsPrint(ArrayList<Athlete> results){
        int position = 1;
        System.out.println("QUICKEST " + this.discipline + " RESULTS");
        for (Athlete athlete: results){

            Long athleteTime = null;
            ArrayList<Workout> athleteNullCheck = athlete.getDisciplineLog(this.discipline);

            if (athleteNullCheck != null){
                athleteTime = athlete.getDisciplineLog(this.discipline).get(0).getTime();
            }

            System.out.println("Position: " + position + ", Name: " + athlete.getName() + " , Time: " + athleteTime + "ms");
            position ++;
        }
    }

//    public String timeFormatConvertor(long milliSec){
//        long second = (milliSec / 1000) % 60;
//        long minute = (milliSec / (1000 * 60)) % 60;
//        long hour = (milliSec / (1000 * 60 * 60)) % 24;
//
//        return String.format("%02d:%02d:%02d:%d", hour, minute, second, milliSec);
//
//    }

}


