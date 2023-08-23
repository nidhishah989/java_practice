package Inheritancepractice;
//superclass -Nidhi Shah
public class Monster {
    private String name;
    //Constructor
    Monster(){
    }
    Monster(String name){
        this.name =name;
    }
    //getter
    public String getName() {
        return name;
    }
    //setter
    public void setName(String name) {
        this.name = name;
    }
    //attack function
    String attack(){
        return("!^_&^$@+%$* I don't know how to attack!");
    }
}
