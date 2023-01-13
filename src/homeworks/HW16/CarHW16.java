package homeworks.HW16;

public class CarHW16 extends Vehicle{
   /* private float fuel;
    private float fuelUsage;
    private int passengers;*/
    boolean airConditioner;

    /*public CarHW16 (float fuel, float fuelUsage, int passengers, boolean airConditioner){
        super(fuel,fuelUsage,passengers,airConditioner);   //super must be used first
        this.airConditioner = airConditioner;
    }*/


    /*public CarHW16(float fuel, float fuelUsage, int passengers, boolean airConditioner){
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
        if(airConditioner){
            this.airConditioner = true;
        } else{
            this.airConditioner = false;
        }
        }*/

    public float maxDistance2() {
        if (airConditioner) {
            float i = (fuelUsage * 5) / 100;
            //System.out.println(i + "i");
            float a = fuelUsage + (i * passengers);
            //System.out.println(a + "a");
            float y = a+((a * 10) / 100) ;
           // System.out.println(y +"y");
            return (((fuel * 100) / y));

        } else {
            float i = (fuelUsage * 5) / 100;
           // System.out.println(i);
            float a = fuelUsage + (i * passengers);
           // System.out.println(a);
            return (((fuel * 100) / a));
        }
    }

}


