package day45_Exceptions;

import java.util.Scanner;

public class ThrowKeyword {

    //  throw===> manually throw an exception

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        if(age< 0 || age > 150){
            throw new RuntimeException("Invalid Age Number entered " +age);
        }

        if(age>= 21){
            System.out.println("Eligible ");
        }else{
            System.out.println("Not Eligible");
        }


        scan.close();
    }

}
