package day33_ArrayList;

import java.util.ArrayList;    // dont forget import class

public class ListIntro {

    public static void main(String[] args) {


        /*   add(object) method===> add element to the next available index

             add(index, object)====> adds the element to the given index
                     DO NOT SKIP INDEXES

                              {1,2,3}
                              add(1, 4);
                              {1,4,2,3}*/


        ArrayList<Integer>  scores =  new ArrayList<>();   // size:1

        scores.add(100);  // autoboxing   index 0
        scores.add(200);    // index 1
        scores.add(300);    //index 3

        scores.add(1, 400);  // index 1 in yerine gececek 400

        System.out.println( scores );

        System.out.println("=================================================================");

        ArrayList<String> groceryList = new ArrayList<>();  //[ Egg, Water, Milk, Bread]
        groceryList.add("Egg");  //3
        groceryList.add("Water"); // 4
        groceryList.add("Milk"); // 5
        groceryList.add("Bread"); // 6
        groceryList.add("Yogurt");
        groceryList.add(0, "Toilet Paper");  // 0
        groceryList.add(1,"Sanitizer");     //2  ===> index 2 moved after N95 Mask
        groceryList.add(1, "N95 Masks");   //1
        groceryList.add(2, "gloves");

        System.out.println(groceryList);
        https://flipgrid.com/e217ebf8
        System.out.println("=====================================================================");

                //	get(index): gets the element at given index

        String item1 =  groceryList.get(2);

        System.out.println("item1 = " + item1);

        String item2 = groceryList.get(1);
        System.out.println("item2 = " + item2);

        //   System.out.println( groceryList.get(100)  ); asla print olmaz cunku element sayisi 100 e kadar degil.


       // size()  ======>  returns the total number of the elements (same with length in array)


        int total = groceryList.size();
        System.out.println("total = " + total);

        System.out.println( groceryList.get(  groceryList.size()-1  ) );







        
    }
}
