package animals.bird_types;

import animals.Bird;
import animals.behaviours.CanFly;

import java.util.Random;

public class Eagle extends Bird implements CanFly {
    public Eagle(String name) {
        super(name);
    }

    @Override
    public int calculateRandomAge(){
        this.age = new Random().nextInt(10);
        return this.age;
    }

    @Override
    public void fly(double altitude, double speed) {

    }
}
