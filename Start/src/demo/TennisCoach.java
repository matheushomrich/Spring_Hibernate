package demo;

public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    public TennisCoach (FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "20 forehands and 20 backhands";
    }
    public String getCoachName(){
        return "Mike";
    }
    public String getDailyFortune(int rand) {
        return fortuneService.getFortune(rand);
    }

    public void doMyStartupStuff() {
        System.out.println("TennisCoach: inside method to doMyStartupStuff");
    }
    public void doMyCleanupStuff() {
        System.out.println("TennisCoach: inside method to doMyCleanupStuff");
    }
}
