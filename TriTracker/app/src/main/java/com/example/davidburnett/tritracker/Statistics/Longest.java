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
    Discipline discipline;

    public Longest(Discipline discipline) {
            this.discipline = discipline;
    }

    public void sortAthletesIndividualWorkoutsLongestFirst(ArrayList<Athlete> athletesToAnalyse){
        for (Athlete athlete : athletesToAnalyse) {
            sorter = new Sorter(athlete.getDisciplineLog(discipline));
            sorter.workoutByDistance(Order.HiToLo);
        }
    }

    public void rankAthletesHiToLo(ArrayList<Athlete> athletesToAnalyse){
            Collections.sort(athletesToAnalyse, new AthleteDistanceComparator(this.discipline));
    }

    public void resultsPrint(ArrayList<Athlete> results){
        int position = 1;
        String format = "| %-8s | %-16s | %-14s| %n";
        System.out.println();
        System.out.println("LONGEST " + this.discipline + " RESULTS");
        System.out.println("===========+==================+================");
        System.out.printf(format, "POSITION", "NAME", "DISTANCE (km)");
        System.out.println("===========+==================+================");


        for (Athlete athlete: results){

            int athleteDistance = 0;
            ArrayList<Workout> athleteNullCheck = athlete.getDisciplineLog(this.discipline);

            if (athleteNullCheck != null) {
                if (athleteNullCheck.size() > 0){
                    athleteDistance = athleteNullCheck.get(0).getDistance();
                }
            }

            // prints the athletes stats to terminal
            System.out.printf(format, position, athlete.getName(), athleteDistance);
            System.out.println("-----------+------------------+----------------");


            position ++;


        }
    }

    public ArrayList<Athlete> statForAthletes(ArrayList<Athlete> athletesToAnalyse){
        sortAthletesIndividualWorkoutsLongestFirst(athletesToAnalyse);
        rankAthletesHiToLo(athletesToAnalyse);
        resultsPrint(athletesToAnalyse);
        return athletesToAnalyse;
    }

}
