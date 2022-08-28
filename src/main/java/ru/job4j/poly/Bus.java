package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("We drive");
    }

    @Override
    public void countPassengers(short count) {
        System.out.println("Количество пассажиров - " + count);
    }

    @Override
    public float refuel(int fuel) {
        float price = 1.11f;
        return fuel * price;
    }
}
