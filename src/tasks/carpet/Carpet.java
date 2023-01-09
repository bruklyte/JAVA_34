package tasks.carpet;

public class Carpet {
    private double cost;

    public Carpet (double cost){    //class
        if(cost >= 0){
            this.cost = cost;
        } else {
            this.cost = 0;
        }
    }
    public double getCost(){
        return cost;
    }
}


