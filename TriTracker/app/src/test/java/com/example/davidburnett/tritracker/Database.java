package com.example.davidburnett.tritracker;

import org.junit.Before;

import java.util.ArrayList;

/**
 * Created by davidburnett on 26/09/2017.
 */

public class Database {

    Athlete athlete1;
    Athlete athlete2;
    Athlete athlete3;
    Athlete athlete4;
    Athlete athlete5;
    Athlete athlete6;

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
    Workout workout25;
    Workout workout26;
    Workout workout27;
    Workout workout28;
    Workout workout29;
    Workout workout30;
    Workout workout31;
    Workout workout32;
    Workout workout33;
    Workout workout34;
    Workout workout35;
    Workout workout36;
    Workout workout37;
    Workout workout38;
    Workout workout39;
    Workout workout40;
    Workout workout41;
    Workout workout42;
    Workout workout43;
    Workout workout44;
    Workout workout45;
    Workout workout46;
    Workout workout47;
    Workout workout48;
    Workout workout49;
    Workout workout50;
    Workout workout51;
    Workout workout52;
    Workout workout53;
    Workout workout54;
    Workout workout55;
    Workout workout56;
    Workout workout57;
    Workout workout58;
    Workout workout59;
    Workout workout60;
    Workout workout61;
    Workout workout62;
    Workout workout63;
    Workout workout64;
    Workout workout65;
    Workout workout66;
    Workout workout67;
    Workout workout68;
    Workout workout69;
    Workout workout70;
    Workout workout71;
    Workout workout72;


    ArrayList<Athlete> athletesToAnalyse;



    public ArrayList<Athlete> getAthletesToAnalyse(){

          // RUNS

        workout1 = new Workout(Discipline.RUN, "22/09/17",4995, 809);
        workout2 = new Workout(Discipline.RUN, "22/09/17",5004, 989);
        workout3 = new Workout(Discipline.RUN, "22/10/17",5009, 900);
        workout4 = new Workout(Discipline.RUN, "22/10/17",5040, 1000);
        workout5 = new Workout(Discipline.RUN, "22/11/17",5087, 1230);
        workout6 = new Workout(Discipline.RUN, "22/11/17",5112, 1250);

        workout7 = new Workout(Discipline.RUN, "22/11/17",9090, 2700);
        workout8 = new Workout(Discipline.RUN, "22/12/17",9089, 2720);
        workout9 = new Workout(Discipline.RUN, "22/12/17",10010, 2980);
        workout10 = new Workout(Discipline.RUN, "22/09/17",10087, 2600);
        workout11 = new Workout(Discipline.RUN, "22/09/17",11000, 2500);
        workout12 = new Workout(Discipline.RUN, "22/10/17",12087, 2550);

        workout13 = new Workout(Discipline.RUN, "22/10/17",25000, 5200);
        workout14 = new Workout(Discipline.RUN, "22/12/17",26000, 5300);
        workout15 = new Workout(Discipline.RUN, "22/12/17",24300, 4980);
        workout16 = new Workout(Discipline.RUN, "22/12/17",23300, 5000);
        workout17 = new Workout(Discipline.RUN, "22/11/17",29800, 6000);

        workout18 = new Workout(Discipline.RUN, "22/11/17",45000, 12600);
        workout19 = new Workout(Discipline.RUN, "22/10/17",43000, 12000);
        workout20 = new Workout(Discipline.RUN, "22/10/17",44000, 13000);
        workout21 = new Workout(Discipline.RUN, "22/09/17",43500, 12800);
        workout22 = new Workout(Discipline.RUN, "22/09/17",45000, 12750);
        workout23 = new Workout(Discipline.RUN, "22/09/17",48000, 13400);
        workout24 = new Workout(Discipline.RUN, "23/08/17",20000, 94567);

          // BIKES

        workout25 = new Workout(Discipline.BIKE, "22/09/17",19990, 1609);
        workout26 = new Workout(Discipline.BIKE, "22/09/17",20000, 1789);
        workout27 = new Workout(Discipline.BIKE, "22/10/17",20000, 1898);
        workout28 = new Workout(Discipline.BIKE, "22/10/17",20000, 1567);
        workout29 = new Workout(Discipline.BIKE, "22/11/17",32000, 2000);
        workout30 = new Workout(Discipline.BIKE, "22/11/17",24000, 1800);
        workout31 = new Workout(Discipline.BIKE, "22/12/17",25000, 1765);
        workout32 = new Workout(Discipline.BIKE, "22/09/17",20000, 1876);

        workout33 = new Workout(Discipline.BIKE, "22/08/17",50000, 3213);
        workout34 = new Workout(Discipline.BIKE, "22/09/17",50000, 3344);
        workout35 = new Workout(Discipline.BIKE, "22/11/17",50000, 3541);
        workout36 = new Workout(Discipline.BIKE, "22/12/17",50000, 3409);
        workout37 = new Workout(Discipline.BIKE, "22/12/17",50000, 3487);

        workout38 = new Workout(Discipline.BIKE, "22/11/17",100000, 7987);
        workout39 = new Workout(Discipline.BIKE, "22/11/17",100000, 7656);
        workout40 = new Workout(Discipline.BIKE, "22/09/17",100000, 7120);
        workout41 = new Workout(Discipline.BIKE, "22/09/17",100000, 7639);
        workout42 = new Workout(Discipline.BIKE, "22/12/17",100000, 7676);

        workout43 = new Workout(Discipline.BIKE, "22/12/17",180000, 14567);
        workout44 = new Workout(Discipline.BIKE, "22/11/17",180000, 15463);
        workout45 = new Workout(Discipline.BIKE, "22/11/17",180000, 18787);
        workout46 = new Workout(Discipline.BIKE, "22/12/17",180000, 20000);
        workout47 = new Workout(Discipline.BIKE, "22/09/17",180000, 19876);
        workout48 = new Workout(Discipline.BIKE, "23/09/17",180000, 16345);

        // SWIMS

        workout49 = new Workout(Discipline.SWIM, "22/09/17",743, 720);
        workout50 = new Workout(Discipline.SWIM, "22/10/17",748, 788);
        workout51 = new Workout(Discipline.SWIM, "22/12/17",750, 678);
        workout52 = new Workout(Discipline.SWIM, "22/09/17",750, 798);
        workout53 = new Workout(Discipline.SWIM, "22/10/17",750, 765);
        workout54 = new Workout(Discipline.SWIM, "22/11/17",750, 890);

        workout55 = new Workout(Discipline.SWIM, "22/12/17",1500, 2000);
        workout56 = new Workout(Discipline.SWIM, "22/08/17",1500, 2100);
        workout57 = new Workout(Discipline.SWIM, "22/09/17",1500, 2340);
        workout58 = new Workout(Discipline.SWIM, "22/09/17",1500, 2131);
        workout59 = new Workout(Discipline.SWIM, "22/09/17",1500, 2345);
        workout60 = new Workout(Discipline.SWIM, "22/10/17",1500, 3409);
        workout61 = new Workout(Discipline.SWIM, "22/10/17",1500, 3487);

        workout62 = new Workout(Discipline.SWIM, "22/12/17",1900, 4000);
        workout63 = new Workout(Discipline.SWIM, "22/12/17",1900, 4123);
        workout64 = new Workout(Discipline.SWIM, "22/09/17",1900, 4312);
        workout65 = new Workout(Discipline.SWIM, "22/09/17",1900, 4512);
        workout66 = new Workout(Discipline.SWIM, "22/10/17",1900, 4123);

        workout67 = new Workout(Discipline.SWIM, "22/11/17",3809, 8098);
        workout68 = new Workout(Discipline.SWIM, "22/12/17",3963, 9999);
        workout69 = new Workout(Discipline.SWIM, "22/11/17",3784, 9675);
        workout70 = new Workout(Discipline.SWIM, "22/12/17",3914, 9871);
        workout71 = new Workout(Discipline.SWIM, "22/11/17",3854, 10987);
        workout72 = new Workout(Discipline.SWIM, "23/12/17",3812, 18789);


        athlete1 = new Athlete("Dave");
        athlete2 = new Athlete("Sally");
        athlete3 = new Athlete("Neil");
        athlete4 = new Athlete("Claire");
        athlete5 = new Athlete("Barry");
        athlete6 = new Athlete("Sarah");

        athlete1.addActivityToLog(workout1);
        athlete2.addActivityToLog(workout2);
        athlete3.addActivityToLog(workout3);
        athlete4.addActivityToLog(workout4);
        athlete5.addActivityToLog(workout5);
        athlete6.addActivityToLog(workout6);
        athlete1.addActivityToLog(workout7);
        athlete2.addActivityToLog(workout8);
        athlete3.addActivityToLog(workout9);
        athlete4.addActivityToLog(workout10);
        athlete5.addActivityToLog(workout11);
        athlete6.addActivityToLog(workout12);
        athlete1.addActivityToLog(workout13);
        athlete2.addActivityToLog(workout14);
        athlete3.addActivityToLog(workout15);
        athlete4.addActivityToLog(workout16);
        athlete5.addActivityToLog(workout17);
        athlete6.addActivityToLog(workout18);
        athlete1.addActivityToLog(workout19);
        athlete2.addActivityToLog(workout20);
        athlete3.addActivityToLog(workout21);
        athlete4.addActivityToLog(workout22);
        athlete5.addActivityToLog(workout23);
        athlete6.addActivityToLog(workout24);
        athlete1.addActivityToLog(workout25);
        athlete2.addActivityToLog(workout26);
        athlete3.addActivityToLog(workout27);
        athlete4.addActivityToLog(workout28);
        athlete5.addActivityToLog(workout29);
        athlete6.addActivityToLog(workout30);
        athlete1.addActivityToLog(workout31);
        athlete2.addActivityToLog(workout32);
        athlete3.addActivityToLog(workout33);
        athlete4.addActivityToLog(workout34);
        athlete5.addActivityToLog(workout35);
        athlete6.addActivityToLog(workout36);
        athlete1.addActivityToLog(workout37);
        athlete2.addActivityToLog(workout38);
        athlete3.addActivityToLog(workout39);
        athlete4.addActivityToLog(workout40);
        athlete5.addActivityToLog(workout41);
        athlete6.addActivityToLog(workout42);
        athlete1.addActivityToLog(workout43);
        athlete2.addActivityToLog(workout44);
        athlete3.addActivityToLog(workout45);
        athlete4.addActivityToLog(workout46);
        athlete5.addActivityToLog(workout47);
        athlete6.addActivityToLog(workout48);
        athlete1.addActivityToLog(workout49);
        athlete2.addActivityToLog(workout50);
        athlete3.addActivityToLog(workout51);
        athlete4.addActivityToLog(workout52);
        athlete5.addActivityToLog(workout53);
        athlete6.addActivityToLog(workout54);
        athlete1.addActivityToLog(workout55);
        athlete2.addActivityToLog(workout56);
        athlete3.addActivityToLog(workout57);
        athlete4.addActivityToLog(workout58);
        athlete5.addActivityToLog(workout59);
        athlete6.addActivityToLog(workout60);
        athlete1.addActivityToLog(workout61);
        athlete2.addActivityToLog(workout62);
        athlete3.addActivityToLog(workout63);
        athlete4.addActivityToLog(workout64);
        athlete5.addActivityToLog(workout65);
        athlete6.addActivityToLog(workout66);
        athlete1.addActivityToLog(workout67);
        athlete2.addActivityToLog(workout68);
        athlete3.addActivityToLog(workout69);
        athlete4.addActivityToLog(workout70);
        athlete5.addActivityToLog(workout71);
        athlete6.addActivityToLog(workout72);

        athletesToAnalyse = new ArrayList<>();

        athletesToAnalyse.add(athlete1);
        athletesToAnalyse.add(athlete2);
        athletesToAnalyse.add(athlete3);
        athletesToAnalyse.add(athlete4);
        athletesToAnalyse.add(athlete5);
        athletesToAnalyse.add(athlete6);

        return athletesToAnalyse;

    }

//    getters for all athletes

}
