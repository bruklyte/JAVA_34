package homeworks.HW16;

public class Vehicle {
    protected float fuel;
    protected float fuelUsage;
    protected int passengers;

    public Vehicle(float fuel, float fuelUsage, int passengers){   //constructor
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

    public Vehicle() {
    }

    public float maxDistance(){         //galima perduoti kintamuosius galima ir ne (float fuel, float fuelUsage, int passengers)
        float i = (fuelUsage * 5)/100;
        //System.out.println(i);
        float a = fuelUsage + (i * passengers);
        //System.out.println(a);
        return (((fuel * 100) / a ));
    }

}
