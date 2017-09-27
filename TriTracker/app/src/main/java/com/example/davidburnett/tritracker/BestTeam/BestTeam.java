package com.example.davidburnett.tritracker.BestTeam;

import com.example.davidburnett.tritracker.Athlete;
import com.example.davidburnett.tritracker.Discipline;
import com.example.davidburnett.tritracker.Statistics.Quickest;
import java.util.ArrayList;

/**
 * Created by davidburnett on 26/09/2017.
 */

public class BestTeam{

    Quickest quickestSwim;
    Quickest quickestBike;
    Quickest quickestRun;

    RaceType raceType;

    Athlete fastestSwimmer;
    Athlete fastestBiker;
    Athlete fastestRunner;

    Athlete bestTeam[];

    public BestTeam (RaceType raceType){
        this.raceType = raceType;
    }


    public Athlete[] bestCombination(ArrayList<Athlete> athletesToAnalyse){

        if (this.raceType == RaceType.SPRINT) {
            quickestSwim = new Quickest(Discipline.SWIM, 750);
            quickestBike = new Quickest(Discipline.BIKE, 20000);
            quickestRun = new Quickest(Discipline.RUN, 5000);
        }

        if (this.raceType == RaceType.STANDARD) {
            quickestSwim = new Quickest(Discipline.SWIM, 1500);
            quickestBike = new Quickest(Discipline.BIKE, 40000);
            quickestRun = new Quickest(Discipline.RUN, 10000);
        }

        if (this.raceType == RaceType.MIDDLE) {
            quickestSwim = new Quickest(Discipline.SWIM, 1900);
            quickestBike = new Quickest(Discipline.BIKE, 90000);
            quickestRun = new Quickest(Discipline.RUN, 21100);
        }

        if (this.raceType == RaceType.FULL){
            quickestSwim = new Quickest(Discipline.SWIM, 3800);
            quickestBike = new Quickest(Discipline.BIKE, 180000);
            quickestRun = new Quickest(Discipline.RUN, 42200);
        }

        fastestSwimmer = quickestSwim.statForAthletes(athletesToAnalyse).get(0);
        fastestBiker = quickestBike.statForAthletes(athletesToAnalyse).get(0);
        fastestRunner = quickestRun.statForAthletes(athletesToAnalyse).get(0);

        bestTeam = new Athlete[3];
        bestTeam[0] = fastestSwimmer;
        bestTeam[1] = fastestBiker;
        bestTeam[2] = fastestRunner;

        resultsPrint();
        return bestTeam;
    }


    public void resultsPrint(){
        String format = "| %-10s | %-16s |%n";
        System.out.println();
        System.out.println(" BEST " + this.raceType + " DISTANCE TEAM");
        System.out.println("+============+==================+");

        System.out.printf(format, "DISCIPLINE","NAME");
        System.out.println("+============+==================+");
        System.out.printf(format, "Swimmer", bestTeam[0].getName());
        System.out.printf(format, "Biker", bestTeam[1].getName());
        System.out.printf(format, "Runner", bestTeam[2].getName());
        System.out.println("+============+==================+");

    }

    public Athlete getAthlete(Discipline discipline) {
        return bestTeam[discipline.getIndex()];
    }
}
