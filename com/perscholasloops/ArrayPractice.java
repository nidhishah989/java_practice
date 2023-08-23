package com.perscholasloops;

import java.util.Scanner;

public class ArrayPractice {
    static int gcd(int num1,int num2){
        if (num2==0){
            return num1;
        }
        else{
            return gcd(num2,num1%num2);
        }
    }
    public static void main(String[] args){
        // printing multiplication table for 1 to 12
        for(int i=1;i<=12;i++){
            for(int j=1;j<=12;j++){
                System.out.print(String.format("%4s",i*j));
            }
            System.out.println(" ");
        }

//        Scanner scan = new Scanner(System.in);
//        //gcd with euclidean algorithm
//        System.out.println("Provide two numbers for gcd calculation: ");
//        System.out.print("Number 1 :");
//        int numb1=scan.nextInt();
//        System.out.print("Number 2 :");
//        int numb2 = scan.nextInt();
//        System.out.println("GCD of "+numb1+" and "+numb2+" is: "+ gcd(numb1,numb2));

        // Predict the year for double tution
        double tution=10000;
        double fintution = 2* tution;
        int year =0;
        do{
            tution = 1.07 * tution;
            year++;
        }while(tution <= fintution);
        System.out.println("In "+ year + " years the tution will be doubled.");
    }
}
