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
    Workout workout7;
    Workout workout8;
    Workout workout9;
    Workout workout10;
    Workout workout11;
    Workout workout12;
    Workout workout13;
    Workout workout14;
    Workout workout15;
    Workout workout16;
    Workout workout17;
    Workout workout18;
    Workout workout19;
    Workout workout20;
    Workout workout21;
    Workout workout22;
    Workout workout23;
    Workout workout24;


    ArrayList<Athlete> athletesToAnalyse;



    public ArrayList<Athlete> getAthletesToAnalyse(){

        workout1 = new Workout(Discipline.RUN, "22/09/17",4995, 809);
        workout2 = new Workout(Discipline.RUN, "22/09/17",5004, 989);
        workout3 = new Workout(Discipline.RUN, "22/09/17",5009, 900);
        workout4 = new Workout(Discipline.RUN, "22/09/17",5040, 1000);
        workout5 = new Workout(Discipline.RUN, "22/09/17",5087, 1230);
        workout6 = new Workout(Discipline.RUN, "22/09/17",5112, 1250);
        workout7 = new Workout(Discipline.RUN, "22/09/17",99090, 2700);
        workout8 = new Workout(Discipline.RUN, "22/09/17",99089, 2720);
        workout9 = new Workout(Discipline.RUN, "22/09/17",10010, 2980);
        workout10 = new Workout(Discipline.RUN, "22/09/17",10087, 2600);
        workout11 = new Workout(Discipline.RUN, "22/09/17",11000, 2500);
        workout12 = new Workout(Discipline.RUN, "22/09/17",12087, 2550);
        workout13 = new Workout(Discipline.RUN, "22/09/17",25000, 5200);
        workout14 = new Workout(Discipline.RUN, "22/09/17",26000, 5300);
        workout15 = new Workout(Discipline.RUN, "22/09/17",24300, 4980);
        workout16 = new Workout(Discipline.RUN, "22/09/17",23300, 5000);
        workout17 = new Workout(Discipline.RUN, "22/09/17",29800, 6000);
        workout18 = new Workout(Discipline.RUN, "22/09/17",45000, 12600);
        workout19 = new Workout(Discipline.RUN, "22/09/17",43000, 12000);
        workout20 = new Workout(Discipline.RUN, "22/09/17",44000, 13000);
        workout21 = new Workout(Discipline.RUN, "22/09/17",43500, 12800);
        workout22 = new Workout(Discipline.RUN, "22/09/17",45000, 12750);
        workout23 = new Workout(Discipline.RUN, "22/09/17",48000, 13400);
        workout24 = new Workout(Discipline.RUN, "23/09/17",20000, 94567);

        workout3 = new Workout(Discipline.BIKE, "25/10/17",90000, 123456);
        athlete1 = new Athlete("Dave");

        workout4 = new Workout(Discipline.RUN, "04/03/16",15000, 600);
        workout5 = new Workout(Discipline.RUN, "10/06/16",25000, 1234);
        workout6 = new Workout(Discipline.SWIM, "16/02/16",100000, 234234);
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
}
