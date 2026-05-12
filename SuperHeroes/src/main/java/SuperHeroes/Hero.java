package SuperHeroes;
import java.util.Objects;

public class Hero {

    private final int id;
    private final String name;
    private double power;
    private HeroType heroType;

    public Hero(int id, String name, HeroType heroType){
        this.id = id;
        this.name = name;
        this.power = 0.0;
        this.heroType = heroType;
    }

    public HeroType getHeroType() {
        return heroType;
    }

    public void setHeroType(HeroType heroType) {
        this.heroType = heroType;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void addPower(double power) {
        if (power < 0) {
            System.out.println("Nível de poder invalido");
            return;
        }
        this.power = power;
    }

    public double calculatePower() {
        return heroType.getPowerCalculator().calculatePower(this);}

    @Override
    public String toString() {
        return "Hero{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", power=" + power +
                ", heroType=" + heroType +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, power, heroType);
    }
}
