package demo;

public class BaseballCoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "30 baseball throws and 50m sprints";
    }
}