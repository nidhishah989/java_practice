package com.perscholasloops;

import java.util.Scanner;

public class LoopsActivity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose your filing status (1-4) from following: ");
        System.out.println("1. Single");
        System.out.println("2. Married Filing Jointly");
        System.out.println("3. Married Filing Separately");
        System.out.println("4. Head of Household");
        int choise =-1;
        do{
            System.out.print("Enter your choice from 1 to 4 as per your status: ");
            choise=scan.nextInt();
        }while(choise<1 |choise>4);

        int income = 0;
        do {
            System.out.print("Enter your income value (positive number without comma): ");
            income = scan.nextInt();
        }while(income<0);

        double tax =0;
        //now calculate tax and show
        if((choise==1 & income>=0 & income<=8350) | (choise==2 & income>=0 & income<=16700)
           | (choise==3 & income>=0 & income<=8350) | (choise==4 & income>=0 & income<=11950)){
            tax = 0.10*(income);
            System.out.println("You have to pay 10 % tax on your income which is " + String.format("%2f",tax));
        }
        else if((choise==1 & income>=8351 & income<=33950) | (choise==2 & income>=16701 & income<=67900)
                | (choise==3 & income>=8351 & income<=33950) | (choise==4 & income>=11951 & income<=45500)){
            tax = 0.15*(income);
            System.out.println("You have to pay 15 % tax on your income which is " + String.format("%2f",tax));
        }
        else if((choise==1 & income>=33951 & income<=82250) | (choise==2 & income>=67901 & income<=137050)
                | (choise==3 & income>=33951 & income<=68525) | (choise==4 & income>=45501 & income<=117450)){
            tax = 0.25*(income);
            System.out.println("You have to pay 25 % tax on your income which is " + String.format("%2f",tax));
        }
        else if((choise==1 & income>=82251 & income<=171550) | (choise==2 & income>=137051 & income<=208850)
                | (choise==3 & income>=68526 & income<=104425) | (choise==4 & income>=117451 & income<=190200)){
            tax = 0.28*(income);
            System.out.println("You have to pay 28 % tax on your income which is " + String.format("%2f",tax));
        }
        else if((choise==1 & income>=171551 & income<=372950) | (choise==2 & income>=208851 & income<=372950)
                | (choise==3 & income>=104426 & income<=186475) | (choise==4 & income>=190201 & income<=372950)){
            tax = 0.33*(income);
            System.out.println("You have to pay 33 % tax on your income which is " + String.format("%2f",tax));
        }
        else if((choise==1 & income>=372951) | (choise==2 & income>=372951)
                | (choise==3 & income>=186476) | (choise==4 & income>=372951)){
            tax = 0.35*(income);
            System.out.println("You have to pay 35 % tax on your income which is " + String.format("%2f",tax));
        }
    }
}
