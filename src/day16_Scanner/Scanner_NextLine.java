package day16_Scanner;

import java.util.*;

public class Scanner_NextLine {

    // next() sadece bir kelime print edilecekse kullanilir
    // nextLine() birden fazla kelime print olacaksa kullanilir


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your address");
        String address = input.nextLine();

        System.out.println("Address: " + address);

    }

}
