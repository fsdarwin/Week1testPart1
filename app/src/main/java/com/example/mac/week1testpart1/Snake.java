package com.example.mac.week1testpart1;

public class Snake extends Tiger {

    static int energy = 10;

    Snake(){
        super.howManySnakes++;
        System.out.println("A Snake is born");
    }
    public static String snakeSound() {
        setSnakeEnergy(-3);
        return "Sssss";
    }
    public static void snakeEats(){
        setSnakeEnergy(5);
    }
    public static void snakeSleeps(){
        setSnakeEnergy(10);
    }
    public static void setSnakeEnergy(int change){
        energy+= change;
    }
}
