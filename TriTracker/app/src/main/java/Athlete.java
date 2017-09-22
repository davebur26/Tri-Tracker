import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by davidburnett on 22/09/2017.
 */

public class Athlete {

    private String name;
    private ArrayList<Activity> disciplineLog;
    private HashMap<Discipline, disciplineLog>activityLog;

    public Athlete (String name){
        this.name = name;
        disciplineLog = new ArrayList<>();
        activityLog = new HashMap<>();
    }
}
