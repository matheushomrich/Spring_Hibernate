package demo;

public class TrackCoach implements Coach{

    private FortuneService fortuneService;

    public TrackCoach(){};
    public TrackCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "30 minute jog";
    }
    public String getCoachName(){
        return "Robert";
    }

    @Override
    public String getDailyFortune(int rand) {
        return fortuneService.getFortune(rand);
    }
}
