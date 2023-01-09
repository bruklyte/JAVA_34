package tasks.carpet;

public class Calculator {

    private Floor floor;            // see:  field as custom class objects
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet){   //needs from Floor class and form Carpet class
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost (){
        return floor.getArea() * carpet.getCost();
    }

}
