package com.example.mac.week1testpart1;

public class Animal {

    Animal(){}

    int howManyMonkeys = 0;
    int howManyTigers = 0;
    int howManySnakes = 0;

    public String makeSound(String animal) {
        return "";
    }
    public int soundEnergy() {
        return -3;
    }
    public int sleepEnergy(){
        return 10;
    }
    public int eatEnergy(){
        return 5;
    }

    public void animalActions() {
        int action = (int) (Math.random() * 11);
        switch (action) {
            case 0:
                new Tiger();
                break;
            case 1:
                new Monkey();
                break;
            case 3:
                new Snake();
                break;
            case 4:
                String eats = new Food().food();
                System.out.println(eats + "is available.");
                switch (eats) {
                    case "meat":
                        System.out.println("Everybody eats " + eats);
                        Tiger.tigerEats();
                        Snake.snakeEats();
                        Monkey.monkeyEats();
                        break;
                    case "fish":
                        System.out.println("Everybody eats " + eats);
                        Tiger.tigerEats();
                        Snake.snakeEats();
                        Monkey.monkeyEats();
                        break;
                    case "bugs":
                        System.out.println("Everybody eats " + eats);
                        Tiger.tigerEats();
                        Snake.snakeEats();
                        Monkey.monkeyEats();
                        break;
                    case "grain":
                        System.out.println("Monkeys and Snakes eat " + eats);
                        System.out.println("Tigers don't eat grain");
                        Snake.snakeEats();
                        Monkey.monkeyEats();
                        break;
                }
            case 5:
                System.out.println("Night time. Everybody sleeps.");
                Tiger.tigerSleeps();
                Snake.snakeSleeps();
                Monkey.monkeySleeps();
                break;
            case 6:
                System.out.println("Tigers make sounds");
                for (int i = 1; i <= howManyTigers; i++){
                    System.out.println(Tiger.tigerSound());
                }
                break;
            case 7:
                System.out.println("Snakes make sounds");
                for (int i = 1; i <= howManySnakes; i++) {
                    System.out.println(Snake.snakeSound());
                }
                break;
            case 8:
                System.out.println("Monkeys make sounds");
                for (int i = 1; i <= howManyMonkeys; i++) {
                    System.out.println(Monkey.monkeySound());
                }
                break;
            case 9:
                System.out.println("Sound off!");
                for (int i = 1; i <= howManyTigers; i++){
                    System.out.println(Tiger.tigerSound());
                }
                for (int i = 1; i <= howManySnakes; i++) {
                    System.out.println(Snake.snakeSound());
                }
                for (int i = 1; i <= howManyMonkeys; i++) {
                    System.out.println(Monkey.monkeySound());
                }
                break;
            case 10:
                System.out.println("Monkeys play");
                for (int i = 1; i <= howManyMonkeys; i++) {
                    System.out.println(Monkey.mmonkeySoundPlay());
                    break;
                }
        }
    }
}
