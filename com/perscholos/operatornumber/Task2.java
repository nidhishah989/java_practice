package com.perscholos.operatornumber;
//right shifting
public class Task2 {
    public static void main(String[] args) {
        int x = 150;
        System.out.println(Integer.toBinaryString(x));
        //shifting by 1 to right
        // so it will be 75 in decimal 1001011 as binary
        x = x >> 1;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        //a. 225
        int y = 225;
        System.out.println(Integer.toBinaryString(y));
        //shifting by 1 to right
        // so it will be 112 in decimal 1110000 as binary
        y = y >> 1;
        System.out.println(y);
        System.out.println(Integer.toBinaryString(y));
        //b.1555
        int b=1555;
        System.out.println(Integer.toBinaryString(b));
        //shifting by 1 to right
        // so it will be 777 in decimal 1100001001 as binary
        b = b>>1;
        System.out.println(b);
        System.out.println(Integer.toBinaryString(b));
        //c.32456
        int c=32456;
        System.out.println(Integer.toBinaryString(c));
        //shifting by 1 to right
        // so it will be 16228 in decimal 11111101100100 as binary
        c = c>>1;
        System.out.println(c);
        System.out.println(Integer.toBinaryString(c));
    }
}
