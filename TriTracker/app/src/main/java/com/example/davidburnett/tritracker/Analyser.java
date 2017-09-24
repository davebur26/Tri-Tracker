package com.example.davidburnett.tritracker;

import com.example.davidburnett.tritracker.Statistics.Statistic;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by davidburnett on 23/09/2017.
 */

public class Analyser{

    private ArrayList<Athlete> analysedAthletes;
    Statistic statistic;


    public Analyser(){
        analysedAthletes = new ArrayList<>();
    }

    public ArrayList<Athlete> getAnalysedAthletes() {
        return analysedAthletes;
    }

    public void addAthleteToAnalyser(Athlete athlete){
        analysedAthletes.add(athlete);
    }

    public static Comparator<ArrayList<Workout>> groupDistanceComparator = new Comparator<ArrayList<Workout>>() {
        @Override
        public int compare(ArrayList<Workout> workoutA, ArrayList<Workout> workoutB) {
            return (workoutB.get(0).getDistance() < workoutA.get(0).getDistance() ? -1 :
                    (workoutB.get(0).getDistance() == workoutA.get(0).getDistance() ? 0 : 1));
        }
    };

//    @Override
//    public String toString() {
//        return "Athlete name:" + this.name;
//    }



}
