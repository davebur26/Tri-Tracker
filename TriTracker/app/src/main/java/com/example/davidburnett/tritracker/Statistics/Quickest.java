package com.example.davidburnett.tritracker.Statistics;

import com.example.davidburnett.tritracker.Athlete;
import com.example.davidburnett.tritracker.Discipline;
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
    Discipline discipline;
    int distance;

    public Quickest(Discipline discipline, int distance){
        this.discipline = discipline;
        this.distance = distance;
    }

    public ArrayList<Athlete> sortAthletesIndividualWorkoutsQuickestFirst(ArrayList<Athlete> athletesToAnalyse){
        for (Athlete athlete : athletesToAnalyse) {
            sorter = new Sorter(athlete.getDisciplineLog(discipline));
            sorter.workoutByTime(Order.LoToHi);
        }
        return athletesToAnalyse;
    }


    public void removeWorkoutsThatAreTooShort(ArrayList<Athlete> athletesToAnalyse){
        ArrayList<Workout> workoutToRemove = new ArrayList<>();
        for (Athlete athlete: athletesToAnalyse) {
            ArrayList<Workout> athleteDisciplineLog = athlete.getDisciplineLog(this.discipline);

            if (athleteDisciplineLog != null){
                for (Workout workout: athleteDisciplineLog) {
                    if (workout.getDistance() < this.distance) {
                    workoutToRemove.add(workout);
                }
            }
            athlete.getActivityLog().get(this.discipline).removeAll(workoutToRemove);
            workoutToRemove.clear();
            }
        }
    }

    public void rankAthletesLoToHi(ArrayList<Athlete> athletesToAnalyse){
        Collections.sort(athletesToAnalyse, new AthleteTimeComparator(this.discipline));
    }

    public ArrayList<Athlete> statForAthletes(ArrayList<Athlete> athletesToAnalyse){
        removeWorkoutsThatAreTooShort(athletesToAnalyse);
        sortAthletesIndividualWorkoutsQuickestFirst(athletesToAnalyse);
        rankAthletesLoToHi(athletesToAnalyse);
//        resultsPrint(athletesToAnalyse);
        return athletesToAnalyse;
    }

    public void resultsPrint(ArrayList<Athlete> results){
        int position = 1;
        System.out.println("QUICKEST " + this.discipline + " RESULTS");
        for (Athlete athlete: results){

            Long athleteTime = new Long(0);
            ArrayList<Workout> athleteNullCheck = athlete.getDisciplineLog(this.discipline);

            if (athleteNullCheck != null){
                if (athleteNullCheck.size() > 0) {
                    athleteTime = athlete.getDisciplineLog(this.discipline).get(0).getTime();
                }
            }

            String athleteTimeProper = timeFormatConvertor(athleteTime);

            System.out.println("Position: " + position + ", Name: " + athlete.getName() + " , Time: " + athleteTimeProper + "ms");
            position ++;
        }
    }

    public String timeFormatConvertor(long seconds){
        long second = (seconds) % 60;
        long minute = (seconds / 60) % 60;
        long hour = (seconds / (60 * 60)) % 24;

        return String.format("%02d:%02d:%02d", hour, minute, second);

    }

}


