package ru.sterlikov.myapplication;

public class Statistics {

    private int weight;
    private int stepsCount;

    public Statistics(int weight, int stepsCount) {
        this.weight = weight;
        this.stepsCount = stepsCount;
    }

    public int getWeight() {
        return weight;
    }

    public int getStepsCount() {
        return stepsCount;
    }

}
