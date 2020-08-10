package demo;

public class MyApp {
    public static void main(String[] args) {
        /*
        FortuneService fortuneService = new FortuneService() {
            @Override
            public String getFortune() {
                return null;
            }
        };

         */
        // create the object
        //Coach coach = new TrackCoach(fortuneService);
        Coach coach = new TrackCoach();
        // use the object
        System.out.println(coach.getDailyWorkout());

    }
}
