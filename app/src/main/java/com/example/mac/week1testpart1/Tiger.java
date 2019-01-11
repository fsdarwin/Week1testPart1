package com.example.mac.week1testpart1;

public class Tiger extends Animal {

    static int energy;

    Tiger(){
        super.howManyTigers++;
        System.out.println("A Tiger is born");
        energy = 10;
    }
    public static String tigerSound() {
        setTigerEnergy(-3);
        return "Roar";
    }
    public static void tigerEats (){
        setTigerEnergy(5);
    }
    public static void tigerSleeps(){
        setTigerEnergy(5);
    }
    public static void setTigerEnergy(int change){
        energy+= change;
    }
}
