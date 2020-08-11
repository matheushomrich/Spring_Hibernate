package demo;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;
    private String emailAddress;
    private String teamName;

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: inside setter method - emailAddress");
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        System.out.println("CricketCoach: inside setter method - teamName");
        this.teamName = teamName;
    }

    public CricketCoach() {
        System.out.println("CricketCoach: inside no arg constructor");
    }

    // metodo setter que sera chamado pelo Spring para inejetar a depencia
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter method - FortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyFortune(int rand) {
        return fortuneService.getFortune(rand);
    }
    public String getCoachName() {
        return "Brodi";
    }
    public String getDailyWorkout() {
        return "Pratice fast bowling";
    }
}
