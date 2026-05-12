package SuperHeroes;

public enum HeroType {

    HUMAN(new Normal_Strength()),
    ANTI_HERO(new Questionable_Strength()),
    MUTANT(new Mutation_Strength()),
    SUPERHUMAN(new Supernatural_Strength());

    private final PowerCalculator powerCalculator;

    HeroType(PowerCalculator powerCalculator) { this.powerCalculator = powerCalculator; }

    public PowerCalculator getPowerStrategy() {return powerCalculator;}

    public PowerCalculator getPowerCalculator() {
        return powerCalculator;
    }
}
