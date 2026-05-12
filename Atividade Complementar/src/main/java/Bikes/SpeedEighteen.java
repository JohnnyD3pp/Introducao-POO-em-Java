package Bikes;

public class SpeedEighteen implements SpeedCalculator{

    @Override
    public double calculateSpeed(Bike bike) {
        double speed = bike.getSpeed();

        if (speed > 1 | speed <= 18) {
            return speed * 1.5;
        } else {
            return speed * 1;
        }
    }
}
