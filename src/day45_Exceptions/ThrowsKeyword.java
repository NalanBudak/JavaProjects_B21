package day45_Exceptions;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException {

       /*
       throws keyword====> used for handling CHECKED EXCEPTION only,(NOT UNCHECKED)
                           placed in method signature, indicates that method throws an exception
                           caller of the method will be responsible for handling the exception*/


        /* 1.YOL

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Step 2");

         */

        //2.YOL
        Thread.sleep(3000);

        //    System.out.println( "Cybertek".charAt(500) );

        System.out.println("Step 2");


        Thread.sleep(3000);
    }
}
