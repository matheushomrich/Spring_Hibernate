package demo;

public class HappyFortuneService implements FortuneService{

    public String[] fortunas = new String[3];

    @Override
    public String getFortune(int rand) {
        fortunas[0] = "JOGA MUITO";
        fortunas[1] = "BRILHOU";
        fortunas[2] = "FEITO";
        return fortunas[rand];
    }
}
