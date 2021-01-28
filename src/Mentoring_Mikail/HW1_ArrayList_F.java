package Mentoring_Mikail;

import java.util.ArrayList;
import java.util.Arrays;

public class HW1_ArrayList_F {

    public static void main(String[] args) {

        /*Create a method that will return an ArrayList < String > . (you can decide the method name )
This method will have 1 parameter (String word ){

		let’s say word is: “Michael”; ( you can decide the keyword by yourself.
Return an arrayList string with every letter of the name like { “M” , “i”, “c” , “h” , “a” , “e” , “l”}
}*/
        System.out.println(stringtoArrayList("michael"));

    }
    public static ArrayList<String>stringtoArrayList(String str){

        char[] charArr = str.toCharArray();
        ArrayList<String>List = new ArrayList<>();

        for (int i = 0, j=0; i <=charArr.length-1 ;i++) {
            List.add(charArr[i] + "");

        }
        return List;


       /*  String [] strArr = str.split("");
        ArrayList<String>List =new ArrayList<>();
        List.addAll(Arrays.asList(strArr));
        return  List;  */
    }
}
