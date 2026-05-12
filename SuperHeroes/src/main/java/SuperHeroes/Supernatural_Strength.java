package SuperHeroes;

public class Supernatural_Strength implements PowerCalculator{

    @Override
    public double calculatePower(Hero hero) {
        double power = hero.getPower();

        if (power > 1200.0) {
            return power * 1.2;
        } else {
            return power * 0.9;
        }
    }
}
