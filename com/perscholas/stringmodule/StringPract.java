package com.perscholas.stringmodule;

import java.util.Arrays;
import java.util.Locale;

public class StringPract {

    public static void main(String[] args){
        String str1="This is first string";
        System.out.println("This is String Example: " + str1);
        //length of string
        System.out.println("Length of string: "+ str1.length());
        //checking string is empty or not
        System.out.println("Checking string is empty or not: "+ str1.isEmpty());
        System.out.println("Checking string is empty or not: "+ str1.isBlank());
        String str2 = "   Hello    ";
        System.out.println("This is second string: \"" +str2+"\"");
        System.out.println("With Trim method the string is: \""+str2.trim()+"\"");
        System.out.println("Str1 in lowercase : "+ str1.toLowerCase());
        System.out.println("Str2 in UpperCase with trim: "+ str2.trim().toUpperCase());
        System.out.println("Concatenation of str1 and str2(trimmed) using concat function: "+str2.trim().concat(","+str1));
        String[] splitsubstr = str1.split(" ");
        System.out.println("Split the str1 with space regex \" \", without limit argument: "+ Arrays.toString(splitsubstr));
        System.out.println("Finding last character of str1 using charAt: "+ str1.charAt(str1.length()-1));
        String str3 ="This";
        String str4 ="ThiS";
        System.out.println("USage of Compareto()(use lexicographic values to compare (case sensitive) for \"This\" and \"ThiS\":"+str3.compareTo(str4));
        System.out.println("USage of ComparetoIgnorecase()(use lexicographic values to compare (ignore lower-higher case) \"This\" and \"ThiS\":"+str3.compareToIgnoreCase(str4));
        System.out.println("substring from str1 based on index: "+ str1.subSequence(0,4));
        System.out.println("Find index for letter T in str1: "+str1.indexOf('T'));
        System.out.println("Find index for Hello word in str2: "+str2.indexOf("Hello"));
        System.out.println("Find the substring in big string: "+ str1.contains("line"));
        System.out.println("replacing the str2 spaces with $ sign: "+ str2.replace(" ","$"));
        System.out.println("Comparing str3 and str4: "+ str3.equals(str4));
        System.out.println("Comparing str3 and str4 (case ignorance): "+ str3.equalsIgnoreCase(str4));

        String A = "madam";
        int n= A.length();
        boolean B=true;
        for(int i=0;i<A.length();i++){
            if(!A.substring(i,i+1).equals(A.substring(n-i-1,n-i)))
            {
                B=false;
                break;
            }
        }
        if(B){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        str1="He is a very very good boy,   isn't he?";
        str2="8";
        String regex = "[!,?._'@\\ ]";

        String[] tokens = str2.trim().split("[!,?.*_'@\\ ]+");

        System.out.println(tokens.length);
        System.out.println(Arrays.toString(tokens));

}
    }