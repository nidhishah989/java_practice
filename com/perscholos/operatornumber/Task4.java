package com.perscholos.operatornumber;
//bitwise or operator
public class Task4 {
    public static void main(String[] args){
        int x=7;
        int y=17;
        int z = x | y;
        //decimal 23 and bitwise 10111
        System.out.println("x|y = " + z + " Bitwise answer: "+Integer.toBinaryString(z));
    }
}
