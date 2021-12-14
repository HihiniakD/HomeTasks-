package model;

import java.util.Random;

public class RandomNumber {
    private int min = 0;
    private int max = 100;
    final private int number = new Random().nextInt(max);

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getNumber() {
        return number;
    }
}
