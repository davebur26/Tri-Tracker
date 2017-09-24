package com.example.davidburnett.tritracker;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

/**
 * Created by davidburnett on 22/09/2017.
 */

public class Athlete {

        private String name;
        private ArrayList<Workout> disciplineLog;
        private HashMap<Discipline, ArrayList<Workout>> activityLog;

        public Athlete (String name){
            this.name = name;
            disciplineLog = new ArrayList<>();
            activityLog = new HashMap<>();
        }


        public String getName() {
            return name;
        }

        public ArrayList<Workout> getDisciplineLog(Discipline discipline) {
            return activityLog.get(discipline);
        }

        public HashMap<Discipline, ArrayList<Workout>> getActivityLog() {
            return activityLog;
        }

        public void addActivityToLog(Workout workout){

            Discipline discipline = workout.getDiscipline();
            ArrayList<Workout> logToAdd = new ArrayList<>();

            if (activityLog.get(discipline) != null){
                logToAdd = activityLog.get(discipline);
            }

            logToAdd.add(workout);
            activityLog.put(discipline, logToAdd);
        }


}
