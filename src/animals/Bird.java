package animals;

import java.util.Random;

public class Bird extends Animal {
    public Bird(String name){
        super(name);
    }
    @Override
    protected int calculateRandomAge() {
        this.age = new Random().nextInt(15);
        return this.age;
    }
}
