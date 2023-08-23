package Inheritancepractice;

public class StoneMonster extends Monster{
    //constructor
    StoneMonster(String name){
        super.setName(name);
    }
    @Override
    String attack(){
        return("Attack with stones!");
    }
}
