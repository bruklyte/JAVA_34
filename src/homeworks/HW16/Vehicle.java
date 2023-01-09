package homeworks.HW16;

public class Vehicle {           //constructor
    private float fuel;
    private float fuelUsage;
    private int passengers;


    public Vehicle(float fuel, float fuelUsage, int passengers){
        if(fuel >=0){
            this.fuel = fuel;
        } else {
            this.fuel = 0;
        }

        if(fuelUsage>=0){
            this.fuelUsage = fuelUsage;
        } else {
            this.fuelUsage = 0;
        }
        if(passengers>=0){
            this.passengers = passengers;
        } else {
            this.passengers = 0;
        }

    }

    public float maxDistance(){
        return (fuel * 100) / fuelUsage;
    }
}
