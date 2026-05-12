package Bikes;

import java.awt.*;

public enum BikeType {

    BABY_BIKE(new SpeedOne()),
    ADVENTURE_BIKE(new SpeedEighteen());

    private final SpeedCalculator speedCalculator;

    BikeType(SpeedCalculator speedCalculator) {
        this.speedCalculator = speedCalculator;
    }

    public SpeedCalculator getSpeedStrategy() {
        return speedCalculator;
    }

    public SpeedCalculator getSpeedCalculator() {
        return speedCalculator;
    }
}
