package com.example.davidburnett.tritracker.Sorter;

import com.example.davidburnett.tritracker.Analyser;
import com.example.davidburnett.tritracker.Athlete;
import com.example.davidburnett.tritracker.Discipline;
import com.example.davidburnett.tritracker.Workout;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by davidburnett on 24/09/2017.
 */

public class GroupSorter {

    ArrayList<Athlete> athletesToAnalyse;
    ArrayList<ArrayList<Workout>> athletesWorkoutArrays;
    Discipline discipline;

    public GroupSorter(ArrayList<Athlete> athletesToAnalyse, Discipline discipline){
        this.athletesToAnalyse = athletesToAnalyse;
        this.discipline = discipline;
//        athletesWorkoutArrays = constructArrayOfWorkoutArrays(this.discipline);

    }


//    public ArrayList<ArrayList<Athlete>> constructArrayOfWorkoutArrays(Discipline discipline){
//        athletesWorkoutArrays = new ArrayList<>();
//        for (Athlete athlete: athletesToAnalyse){
//            athletesWorkoutArrays.add(athlete.getDisciplineLog(discipline));
//        }
//        return athletesWorkoutArrays;
//    }



//    public ArrayList<Athlete> groupWorkoutByDistance(Order order){
//        Collections.sort(athletesToAnalyse, Analyser.groupDistanceComparator);
//        if (order == Order.LoToHi){
//            Collections.reverse(athletesToAnalyse);
//        }
//        return athletesToAnalyse;
//    }




}
