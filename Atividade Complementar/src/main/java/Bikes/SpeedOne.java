package Bikes;

public class SpeedOne implements SpeedCalculator{

    @Override
    public double calculateSpeed(Bike bike) {
        double speed = bike.getSpeed();

        if (speed > 0 | speed == 1) {
            return speed * 1.2;
        } else {
            return speed * 1;
        }
    }
}
