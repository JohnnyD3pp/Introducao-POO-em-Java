package SuperHeroes;

public class Mutation_Strength implements PowerCalculator {

    @Override
    public double calculatePower(Hero hero) {
        double power = hero.getPower();

        if (power > 800.0) {
            return power * 0.8;
        } else {
            return power * 0.9;
        }
    }
}
