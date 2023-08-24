package libraryinterfaceexample;

public class LibraryInterfaceDemo {
    public static void main(String[] args){
        //for kids user
        KidUser kid1 = new KidUser();
        //set age 10 and booktype as "Kids" : as everything is good
        System.out.println("---- kid age:10 and booktype:Kids ------");
        kid1.setAge(10);
        kid1.setBookType("Kids");
        //call both interface functions
        kid1.registerAccount();
        kid1.requestBook();
        //set age 18 and booktype as "Fiction" : as everything is wrong
        System.out.println("---- kid age:18 and booktype:Fiction ------");
        kid1.setAge(18);
        kid1.setBookType("Fiction");
        //call both interface functions
        kid1.registerAccount();
        kid1.requestBook();
        //for adult user
        AdultUser adult1 = new AdultUser();
        //set age 23 and booktype as "Kids" : as age is good, but book is wrong
        System.out.println("---- Adult age:23 and booktype:Kids ------");
        adult1.setAge(23);
        adult1.setBookType("Kids");
        //call both interface functions
        adult1.registerAccount();
        adult1.requestBook();
        //set age 5 and booktype as "Fiction" : as age is wrong,but book is right
        System.out.println("---- Adult age:5 and booktype:Fiction ------");
        adult1.setAge(5);
        adult1.setBookType("Fiction");
        //call both interface functions
        adult1.registerAccount();
        adult1.requestBook();
    }
}
