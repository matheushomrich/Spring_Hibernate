package demo;

public class BaseballCoach implements Coach{

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "30 baseball throws and 50m sprints";
    }
    public String getCoachName(){
        return "Donald";
    }
    public String getDailyFortune(int rand) {
        return fortuneService.getFortune(rand);
    }
}