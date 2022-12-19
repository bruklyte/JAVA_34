package oop;

public class Gift {

    //Fields - pirmiausia apsirasom, tai kintamieji, features, kurios apraso objekta

    private float price;
    private char size;
    private String material;
    private boolean forChildren;

    //Setter methods

    public void setPrice (float price) {
        this.price = price;
    }
    public void setSize (char size) {
        this.size = size;
    }
    public void setMaterial (String material) {
        this.material = material;
    }
    public void setForChildren (boolean forChildren) {
        this.forChildren = forChildren;
    }

    //Getter methods
    public float getPrice(){
        return price;
    }
    public char getSize(){
        return size;
    }
    public String getMaterial(){
        return material;
    }
    public boolean getForChildren(){
        return forChildren;
    }

    public void gifting (String name, String message){

        System.out.println("Gift for: " + name);
        System.out.println("Message: " + message);
        System.out.println("\t Price: " + price + "\u20AC");
        System.out.println("\t Size: " + size);
        System.out.println("\t Material: " + material);
        if (forChildren){
            System.out.println("You have been good kid this year");
        }else{
            System.out.println("Please give this to your parents");
        }
    }



}
