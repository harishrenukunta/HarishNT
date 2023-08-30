package animals.behaviours;

public interface Hop {

    static int getAvgHopHeight() {
        return 2;
    }

    default int getMaxHopHeight() {
        return 4;
    }
}
