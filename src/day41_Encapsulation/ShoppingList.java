package day41_Encapsulation;

import  java.util.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {

    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();
        items.addAll(Arrays.asList(              //adAll()  ==> used for, store more than one object.  it accepts collection type.(ArrayList gibi)

                new Item("sanitizer", 15, 30),
                new Item("mask", 10, 225),
                new Item ("Watermelon",  2,2.24),
                new Item("toilet paper", 20, 50),
                new Item("sanitizer", 15, 30),
                new Item("mask", 10, 225)
        ) );

        System.out.println(items);

        double total = 0; // declare variable ===> double total=0

        for(Item eachItem  : items ){
            total += eachItem.calcCost();

        }



        System.out.println("total = " + total);





    }

}

/*
create a class called ShoppingList
			create 5 objects of Item and store them into ArrayList of Items
			calculate the total cost of all Items in the list
 */


