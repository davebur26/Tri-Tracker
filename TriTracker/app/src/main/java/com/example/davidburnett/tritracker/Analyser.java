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

}
