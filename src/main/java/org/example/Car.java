package org.example;

public class Car extends Vehicle{

    private int number_of_doors;

    public Car(String manufacturer, String model, int year_of_manufacture, int number_of_doors) {
        super(manufacturer, model, year_of_manufacture);
        this.number_of_doors = number_of_doors;
    }

    public int getNumber_of_doors() {
        return number_of_doors;
    }

    public void setNumber_of_doors(int number_of_doors) {
        this.number_of_doors = number_of_doors;
    }

    @Override
    public void vehicle_information()
    {
        super.vehicle_information();
        System.out.println("Number of Doors: " + number_of_doors);
    }
}
