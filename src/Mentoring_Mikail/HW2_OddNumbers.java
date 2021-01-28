package Mentoring_Mikail;

import java.util.ArrayList;

public class HW2_OddNumbers {

    // TODO:  Create a method which will return an INTEGER ArrayList.The method will accept an int array parameter.
    // TODO:  Return every odd number which are in the Array.


    public static ArrayList<Integer> oddNumbers(int[] arr) {  // We cerated a new method dor the ArrayList

        ArrayList<Integer> odd = new ArrayList<>();           // Created a  new ArrayList Object

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                odd.add(i);

            }
        }

        return odd;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 55, 6, 7, 87, 9, 10, 112, 12, 13, 14};
        System.out.println(oddNumbers(arr));
    }
}












/* public static ArrayList<Integer>oddNumbers(int[]arr){

        return null;*/