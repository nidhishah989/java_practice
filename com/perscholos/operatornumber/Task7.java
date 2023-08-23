package com.perscholos.operatornumber;

public class Task7 {
    public static void main(String[] args){
        int x = 5;
        int y=8;
        int sum;
        sum = y + ++x;
        System.out.println("The sum with ++x: "+ sum);
        x=5;
        sum = y + x++;
        System.out.println("The sum with x++: "+ sum);
        char choose='a';
        switch(choose){
            case 'a': System.out.println(choose);
                        break;
            case 'b': System.out.println(choose);
                        break;
        }
    }
}
