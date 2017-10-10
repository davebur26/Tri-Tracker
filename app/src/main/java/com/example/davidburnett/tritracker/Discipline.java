package com.example.davidburnett.tritracker;

/**
 * Created by davidburnett on 22/09/2017.
 */

public enum Discipline {
    SWIM(0),
    BIKE(1),
    RUN(2);

private int index;

        Discipline(int index){
        this.index = index;
        }

public int getIndex() {
        return index;
        }

}
