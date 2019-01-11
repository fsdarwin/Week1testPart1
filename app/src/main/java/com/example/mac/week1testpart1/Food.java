package com.example.mac.week1testpart1;

public class Food {

    Food(){}
    public String food(){
        int type = (int) (Math.random()*4);
        String foodType = "";
        switch (type){
            case 0:
                foodType = "meat";
                break;
            case 1:
                foodType =  "fish";
                break;
            case 2:
                foodType =  "bugs";
                break;
            case 3:
                foodType =  "grain";
                break;
        }
        return foodType;
    }

}
