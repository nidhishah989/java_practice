package Inheritancepractice;

public class WaterMonster extends Monster{
    //constructor
    WaterMonster(String name){
        super.setName(name);
    }
    @Override
    String attack(){
        return("Attack with water!");
    }
}

