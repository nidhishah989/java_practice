package Inheritancepractice;

public class FireMonster extends Monster{
    //constructor
    FireMonster(String name){
        super.setName(name);
    }
    @Override
    String attack(){
        return("Attack with fire!");
    }
}
