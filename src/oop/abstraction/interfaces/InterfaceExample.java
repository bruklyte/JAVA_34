package oop.abstraction.interfaces;

interface Bug{
    public void bugSound();
    public void bugSize();
}

interface Location{
    public void location();
}

class Ant implements  Bug,Location{                                 // two parents,it has to folow the rools from Bug class ir Location class
    public void bugSound(){
        System.out.println("Tss");
    }
    public void bugSize(){
        System.out.println("Small");
    }

    public void location(){
        System.out.println("Forest");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Ant ant = new Ant();
        ant.bugSound();
        ant.bugSize();
        ant.location();
    }


}
