package org.example;

public class Motorcycle extends Vehicle{

    private String type;
    private String color;

    public Motorcycle(String manufacturer, String model, int year_of_manufacture, String type, String color) {
        super(manufacturer, model, year_of_manufacture);
        this.type = type;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void vehicle_information() {
        super.vehicle_information();
        System.out.println("Motorradtyp: " + type);
        System.out.println("Color: " + color);
    }
}
