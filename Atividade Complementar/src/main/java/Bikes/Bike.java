package Bikes;
import java.util.Objects;

public class Bike {

    // O final significa que a aplicação deve obrigatóriamente nascer com esses atributos
    private final int id;
    private final String name;
    private final String color;
    private double speed;
    private BikeType bikeType;

    public Bike(int id, String name, String color, BikeType bikeType) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.bikeType = bikeType;
        this.speed = 0.0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getSpeed() {
        return speed;
    }

    public void addSpeed(double speed) {
        if(speed<0){
            System.out.println("Capacidade de velocidade invalida.");
            return;
        }
        this.speed = speed;
    }

    public BikeType getBikeType() {
        return bikeType;
    }

    public void setBikeType(BikeType bikeType) { this.bikeType = bikeType; }


    public double calculateSpeed() {
        return bikeType.getSpeedCalculator().calculateSpeed(this);}

    @Override
    public String toString() {
        return "Bike{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                ", bikeType=" + bikeType +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, color, speed, bikeType);
    }
}
