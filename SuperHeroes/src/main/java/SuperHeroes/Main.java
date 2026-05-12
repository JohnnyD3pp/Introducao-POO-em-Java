package SuperHeroes;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero(1, "Batman", HeroType.HUMAN);
        Hero hero2 = new Hero(2, "Mutano", HeroType.MUTANT);
        Hero hero3 = new Hero(3, "Deadpool", HeroType.ANTI_HERO);
        Hero hero4 = new Hero(4, "Superman", HeroType.SUPERHUMAN);


        // exhibit the initial state
        System.out.println("Initial state of heroes:");
        System.out.println(hero1);
        System.out.println(hero2);
        System.out.println(hero3);
        System.out.println((hero4));

        // Adding score
        hero1.addPower(250);
        hero2.addPower(900);
        hero3.addPower(500);
        hero4.addPower(1500);

        // exhibit state after alteration
        System.out.println("\nAfter power update:");
        System.out.println(hero1);
        System.out.println(hero2);
        System.out.println(hero3);
        System.out.println(hero4);

        // Calculating bonus
        double normalPower = hero1.calculatePower();
        double mutantPower = hero2.calculatePower();
        double antiheroPower = hero3.calculatePower();
        double superhumanPower = hero4.calculatePower();

        System.out.println("\nHeroes Strengths:");
        System.out.println("Normal Hero Power: " + normalPower);
        System.out.println("Mutant Power: " + mutantPower);
        System.out.println("Anti-Hero Power: " + antiheroPower);
        System.out.println("SuperHuman Power: " + superhumanPower);

    }
}