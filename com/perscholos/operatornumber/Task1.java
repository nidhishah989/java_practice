package com.perscholos.operatornumber;
// left shifting
public class Task1 {
    public static void main(String[] args){
        int x = 2;
        System.out.println(Integer.toBinaryString(x));
        //shifting by 1 to left
        // so it will be 4 in decimal 100 as binary
        x = x<<1;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        //a. 9
        int y=9;
        System.out.println(Integer.toBinaryString(y));
        //shifting by 1 to left
        // so it will be  in decimal 10010 as binary
        y = y<<1;
        System.out.println(y);
        System.out.println(Integer.toBinaryString(y));
        //b.17
        int b=17;
        System.out.println(Integer.toBinaryString(b));
        //shifting by 1 to left
        // so it will be 18 in decimal 10010 as binary
        b = b<<1;
        System.out.println(b);
        System.out.println(Integer.toBinaryString(b));
        //c.88
        int c=88;
        System.out.println(Integer.toBinaryString(c));
        //shifting by 1 to left
        // so it will be 34 in decimal 1011000 as binary
        c = c<<1;
        System.out.println(c);
        System.out.println(Integer.toBinaryString(c));
    }
}
