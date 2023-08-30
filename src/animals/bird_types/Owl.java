package animals.bird_types;

import animals.behaviours.CanFly;

public class Owl implements CanFly {
    @Override
    public void fly(double altitude, double speed) {
        System.out.println(String.format("I am flying at altitue %f and at speed %f", altitude, speed));
    }
}
