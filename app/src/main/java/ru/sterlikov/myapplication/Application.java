package ru.sterlikov.myapplication;

import java.util.LinkedList;

public class Application {

    private static User user;
    private static LinkedList<Pressure> pressureValues;
    private static LinkedList<Statistics> statisticsValues;

    public static void signIn(String name, int age) {
        user = new User(name, age);
    }

    public static void addPressure(Pressure pressure) {
        pressureValues.add(pressure);
    }

    public static void addStatistics(Statistics statistics) {
        statisticsValues.add(statistics);
    }

    public static User getUser() {
        return user;
    }

}
