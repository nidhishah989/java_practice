package com.perscholos.operatornumber;

public class Task5and6 {
    public static void main(String[] args){
        int i =1;
        System.out.println("Before Increment i is : "+i);
        i += 1;
        System.out.println("After incrementing by 1 i is: "+i);

        //diffrent ways
        // by += operator
        i += 1;
        System.out.println("After incrementing by 1 i is: "+i);
        //by ++
        i++;
        System.out.println("After incrementing by 1 i is: "+i);
        //third normal sum
        i = i+1;
        System.out.println("After incrementing by 1 i is: "+i);
    }
}
