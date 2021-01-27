package Mentoring_Mikail;

import java.util.Arrays;

public class HW3 {

    // cretae a method which will return an integer(return type) This method will have an int array parameter.
   //  Return the number from that array which is the second highest number.


    public static void main(String[] args) {
        int [] arr={25,33,98,44,1,3,};
        System.out.println(secondHighest(arr));
    }


    public static int secondHighest(int []arr){
        Arrays.sort(arr);
        return arr[arr.length-2];
        


    }

}
