package org.example;

import java.util.Objects;

public class Car extends Vehicle{

    private int number_of_doors;
    private int numberOfTires;

    public Car(String manufacturer, String model, int year_of_manufacture, int number_of_doors, int numberOfTires) {
        super(manufacturer, model, year_of_manufacture);
        this.number_of_doors = number_of_doors;
        this.numberOfTires = numberOfTires;
    }

    public Car (){
        super();
        number_of_doors = 0;
        numberOfTires = 0;
    }

    public int getNumber_of_doors() {
        return number_of_doors;
    }

    public void setNumber_of_doors(int number_of_doors) {
        this.number_of_doors = number_of_doors;
    }

    public int getNumberOfTires() {
        return numberOfTires;
    }

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    @Override
    public void vehicle_information()
    {
        super.vehicle_information();
        System.out.println("Number of Doors: " + number_of_doors);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return number_of_doors == car.number_of_doors && numberOfTires == car.numberOfTires;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number_of_doors, numberOfTires);
    }

    @Override
    public String toString() {
        return "Car{" +
                "number_of_doors=" + number_of_doors +
                ", numberOfTires=" + numberOfTires +
                '}';
    }
}
