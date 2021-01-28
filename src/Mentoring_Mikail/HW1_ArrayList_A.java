package Mentoring_Mikail;

import java.util.ArrayList;
import java.util.Scanner;
public class HW1_ArrayList_A {

    /*Create a method that will return an ArrayList < String > . (you can decide the method name )
 This method will have 1 parameter (String word ){
       let's say word is: "Michael"; ( you can decide the keyword by yourself.
 Return an arrayList string with every letter of the name like { "M" , "i", "c" , "h" , "a" , "e" , "l"}
        */

    public static void main(String[] args) {

         letters();
    }

    public static void letters(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word");

        String word = scan.next();
        ArrayList<Character>list =new ArrayList<>();

        for(char each: word.toCharArray()){
            System.out.print("\"" + each +"\", ");




        }

}




    }

