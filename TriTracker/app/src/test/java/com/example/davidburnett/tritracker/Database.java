package com.example.davidburnett.tritracker;

import org.junit.Before;

import java.util.ArrayList;

/**
 * Created by davidburnett on 26/09/2017.
 */

public class Database {

    Athlete athlete1;
    Athlete athlete2;

    Workout workout1;
    Workout workout2;
    Workout workout3;
    Workout workout4;
    Workout workout5;
    Workout workout6;


    ArrayList<Athlete> athletesToAnalyse;



    public ArrayList<Athlete> getAthletesToAnalyse(){

        workout1 = new Workout("morning run", Discipline.RUN, "22/09/17",10000, 999);
        workout2 = new Workout("afternoon run", Discipline.RUN, "23/09/17",20000, 94567);
        workout3 = new Workout("afternoon bike", Discipline.BIKE, "25/10/17",90000, 123456);
        athlete1 = new Athlete("Dave");

        workout4 = new Workout("lunch run", Discipline.RUN, "04/03/16",15000, 600);
        workout5 = new Workout("night swim", Discipline.RUN, "10/06/16",25000, 1234);
        workout6 = new Workout("afternoon bike", Discipline.SWIM, "16/02/16",100000, 234234);
        athlete2 = new Athlete("Neil");

        athlete1.addActivityToLog(workout1);
        athlete1.addActivityToLog(workout2);
        athlete1.addActivityToLog(workout3);

        athlete2.addActivityToLog(workout4);
        athlete2.addActivityToLog(workout5);
        athlete2.addActivityToLog(workout6);

        athletesToAnalyse = new ArrayList<>();
        athletesToAnalyse.add(athlete1);
        athletesToAnalyse.add(athlete2);

        return athletesToAnalyse;

    }

//    public ArrayList<Athlete> getAthletesToAnalyse() {
//        return athletesToAnalyse;
//    }
}
