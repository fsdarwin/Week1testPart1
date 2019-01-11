package com.example.mac.week1testpart1;

public class Monkey extends Animal {

    static int energy = 10;

    Monkey(){
        super.howManyMonkeys++;
        System.out.println("A Monkey is born");
    }
    public static String monkeySound() {
        setMonkeyEnergy(-4);
        return "Arrrk";
    }
    public static String mmonkeySoundPlay() {
        setMonkeyEnergy(-4);
        return "Oooo oooo oooo";
    }
    public static int monkeyEats(){
        setMonkeyEnergy(2);
        return 2;
    }
    public static int monkeySleeps(){
        setMonkeyEnergy(10);
        return 10;
    }
    public static void setMonkeyEnergy(int change){
        energy+= change;
    }

}
