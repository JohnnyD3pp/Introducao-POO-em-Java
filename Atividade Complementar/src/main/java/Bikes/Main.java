package Bikes;
import static Bikes.BikeType.*;

public class Main {
    public static void main(String[] args) {
        Bike bike1 = new Bike(1, "Zezinho", "Azul", BikeType.BABY_BIKE);
        Bike bike2 = new Bike(2, "Mariazinha", "Vermelha", BikeType.BABY_BIKE);
        Bike bike3 = new Bike(3, "Maurício", "Preta", BikeType.ADVENTURE_BIKE);
        Bike bike4 = new Bike(4, "Patrícia", "Amarela", BikeType.ADVENTURE_BIKE);

        // exhibit the initial state
        System.out.println("Initial state of owners and them bikes:");
        System.out.println(bike1);
        System.out.println(bike2);
        System.out.println(bike3);
        System.out.println((bike4));

        // Adding score
        bike1.addSpeed(0.8);
        bike2.addSpeed(1);
        bike3.addSpeed(17);
        bike4.addSpeed(15);

        // exhibit state after alteration
        System.out.println("\nAfter speed update:");
        System.out.println(bike1);
        System.out.println(bike2);
        System.out.println(bike3);
        System.out.println(bike4);

        // Calculating bonus
        double SpeedOne = bike1.calculateSpeed();
        double SpeedOne2 = bike2.calculateSpeed();
        double SpeedEighteen = bike3.calculateSpeed();
        double SpeedEighteen2 = bike4.calculateSpeed();

        System.out.println("\nSpeed:");
        System.out.println("Zezinho's Speed: " + SpeedOne);
        System.out.println("Mariazinha's Speed: " + SpeedOne2);
        System.out.println("Mauricio's Speed: " + SpeedEighteen);
        System.out.println("Patricia's Speed: " + SpeedEighteen2);
    }
}
