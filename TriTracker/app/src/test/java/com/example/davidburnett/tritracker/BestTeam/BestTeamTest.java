package com.example.davidburnett.tritracker.BestTeam;

import com.example.davidburnett.tritracker.Athlete;
import com.example.davidburnett.tritracker.Database;
import com.example.davidburnett.tritracker.Discipline;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by davidburnett on 26/09/2017.
 */
public class BestTeamTest {

    ArrayList<Athlete> athletesToAnalyse;

    @Before
    public void before(){
        Database database = new Database();
        athletesToAnalyse = database.getAthletesToAnalyse();
    }

    @Test
    public void testBestMiddleTeam(){
        BestTeam bestTeam = new BestTeam(RaceType.MIDDLE);
        bestTeam.bestCombination(athletesToAnalyse);
        assertEquals("Sally", bestTeam.getAthlete(Discipline.SWIM).getName());
    }

    @Test
    public void testBestSprintTeam(){
        BestTeam bestTeam = new BestTeam(RaceType.SPRINT);
        bestTeam.bestCombination(athletesToAnalyse);
        assertEquals("Sally", bestTeam.getAthlete(Discipline.SWIM).getName());

    }

    @Test
    public void testBestFullTeam(){
        BestTeam bestTeam = new BestTeam(RaceType.FULL);
        assertEquals(3, bestTeam.bestCombination(athletesToAnalyse).length);
    }

    @Test
    public void testBestStandardTeam(){
        BestTeam bestTeam = new BestTeam(RaceType.STANDARD);
        bestTeam.bestCombination(athletesToAnalyse);
    }


}