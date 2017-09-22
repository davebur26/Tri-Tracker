package com.example.davidburnett.tritracker;

import java.util.ArrayList;

/**
 * Created by davidburnett on 22/09/2017.
 */

public class Athlete {

        private String name;
        private ArrayList<Workout> disciplineLog;
//        private HashMap<String, ArrayList<android.app.Workout>> activityLog;

        public Athlete (String name){
            this.name = name;
            disciplineLog = new ArrayList<>();
//            activityLog = new HashMap<>();
        }

        public String getName() {
            return name;
        }

        public ArrayList<Workout> getDisciplineLog() {
            return disciplineLog;
        }
//
//        public HashMap<String, ArrayList<android.app.Workout>> getActivityLog() {
//            return activityLog;
//        }

        public void addActivityToDisciplineLog(Workout workout){
            disciplineLog.add(workout);
        }


}
