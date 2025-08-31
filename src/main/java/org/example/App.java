package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Vehicle vehicle = new Vehicle("Mercedes" , "CLA200" , 2020);
        Car car = new Car("Audi" , "Q3" , 2020,4,4);
        Motorcycle m = new Motorcycle("Harley-Davidson", "Sportster", 2018, "Cruiser","Rot");
        vehicle.vehicle_information();
        car.vehicle_information();
        m.vehicle_information();
    }
}
