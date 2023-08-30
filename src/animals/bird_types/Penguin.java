package animals.bird_types;

import animals.Bird;
import animals.behaviours.Hop;
import animals.behaviours.Swim;

import java.time.LocalDateTime;
import java.util.Random;

public class Penguin extends Bird implements Hop, Swim {

    public Penguin(){
        super("unknown");
    }

    public Penguin(String name){
        super(name);
    }

    public int calculateRandomAge(int customAge) {
        this.age = customAge;
        return this.age;
    }

    public int getAvgHopHeight() {
        return Hop.getAvgHopHeight();
    }

    @Override
    public LocalDateTime getDurationOfSwim(LocalDateTime start, LocalDateTime end) {
        return null;
    }
}
