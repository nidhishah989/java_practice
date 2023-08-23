package Array30371Practice;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Tasks {
    static void getuserchoice(){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many favorite things do you have?");
        int num = scan.nextInt();
        String[] choices = new String[num];
        for(int i=0;i<choices.length;i++){
            System.out.print("Enter your thing: ");
            String val = scan.next();
            choices[i]=val;
        }
        System.out.println("Your favorite  things are:\n" + Arrays.toString(choices));
    }
    public static void main(String[] args){
        //Task 1
        int [] num = new int[3];
        num[0]=1;
        num[1]=2;
        num[2]=3;
        for(int number:num){
            System.out.println(number);
        }

        //Task2
        int[] values = {13,5,7,68,2};
        System.out.println("The middle number is: " + values[values.length/2]);

        //Task3
        String[] colors={"red","green","blue","yellow"};
        System.out.println("The length is: "+colors.length);
        String[] copyofcolors = colors.clone();
        System.out.println(Arrays.toString(copyofcolors));

        System.out.println(values[0]);
        System.out.println(values[values.length-1]);
        try {
            System.out.println(values[values.length]);
        }catch (Exception e){System.out.println("Error 1: "+e);}
        try {
            values[values.length]=3;
        }catch (Exception e){System.out.println("Error 2: "+ e);}

        //Task 5
        int[] fivenum = new int[5];
        for(int i=0;i<fivenum.length;i++){
            fivenum[i]=i*2; //Assigning i*2 to every element in array
        }
        for(int j=0;j<fivenum.length;j++){
            if(j!=2){
                System.out.print(fivenum[j] + " ");
            }
        }
        System.out.println(Arrays.toString(fivenum));

        String[] colorslist ={"red","pink","yellow","white","green"};
        //swap the first element with middle element
        String temp = colorslist[0];
        colorslist[0]=colorslist[colorslist.length/2];
        colorslist[colorslist.length/2]=temp;
        System.out.println(Arrays.toString(colorslist));

        //Task 9:
        int[] numbers ={4,2,9,13,1,0};
        System.out.println("UnSorted Array: "+ Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Array in ascending order: "+ Arrays.toString(numbers));
        System.out.println("The smallest number is: "+ numbers[0]);
        System.out.println("The smallest number is: "+ numbers[numbers.length-1]);

        //Task 10
        Object[] arr = new Object[5];
        arr[0] = Integer.valueOf(1);
        arr[1] = String.valueOf("str1");
        arr[2] = String.valueOf("str2");
        arr[3] = String.valueOf("str3");
        arr[4] = Double.valueOf(1.2);
        System.out.println(Arrays.toString(arr));

        getuserchoice();
    }
}
