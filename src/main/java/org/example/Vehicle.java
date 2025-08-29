package org.example;

public class Vehicle {

    private String manufacturer;
    private String model;
    private int year_of_manufacture;

    public Vehicle(String manufacturer, String model, int year_of_manufacture) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year_of_manufacture = year_of_manufacture;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear_of_manufacture() {
        return year_of_manufacture;
    }

    public void setYear_of_manufacture(int year_of_manufacture) {
        this.year_of_manufacture = year_of_manufacture;
    }

    public void vehicle_information(){
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Year of Manufacture: " + year_of_manufacture);
    }
}
