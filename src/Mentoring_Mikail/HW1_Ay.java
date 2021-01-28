package Mentoring_Mikail;

import java.util.ArrayList;
import java.util.Arrays;

public class HW1_Ay {

    public static void main(String[] args) {
        System.out.println(seperaterLetters("Michael"));
    }

    public static ArrayList<String > seperaterLetters(String str){  //
        ArrayList<String > letterList = new ArrayList<String>(Arrays.asList(str.split("")));
        return letterList;

    }

}
/*Create a method that will return an ArrayList < String > . (you can decide the method name )
This method will have 1 parameter (String word ){
      let's say word is: "Michael"; ( you can decide the keyword by yourself.
Return an arrayList string with every letter of the name like { "M" , "i", "c" , "h" , "a" , "e" , "l"}
}*/