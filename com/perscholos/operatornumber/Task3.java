package com.perscholos.operatornumber;
//bitwise and operator
public class Task3 {
    public static void main(String[] args){
        int x=7;
        int y=17;
        int z = x & y;
        //decimal 1 and bitwise 1
        System.out.println("x&y = " + z + " Bitwise answer: "+Integer.toBinaryString(z));

    }
}
