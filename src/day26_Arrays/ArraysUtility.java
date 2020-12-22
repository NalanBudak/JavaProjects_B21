package day26_Arrays;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

    //  Arrays.toString( array ):     converts the array to String
        //									MUST use in order to print the entire array

        int[] numbers = {1,2,3,4,5,6};

        System.out.println( numbers[0] ); // print 1
        System.out.println( numbers[1] ); //print 2
        System.out.println( numbers[2] ); //print 3
        System.out.println( numbers );    //hashcode  because compalier does not read  without index number. we have to convert array to string. bunu yapmanin yolu toString methodudur.

        System.out.println(  Arrays.toString(numbers)   );  //   converts the array to String

        System.out.println("=================================================");

        String str1 = "Cybertek";
        System.out.println( str1 );

        String[] classMates = {"Adil", "Muhammad", "Yasin", "Necdet", "Daniel"};
        System.out.println(  classMates  );  // hashcode
        System.out.println(  Arrays.toString(classMates)  );

        System.out.println("===============================================");

    //   Arrays.sort(array): sorts the array in ascending order

        int[] arr1 = {200000, 1000000, 4000000, 6000, 300000, 12345551, 90000};

        Arrays.sort(arr1);  // does not return any value, cannot be assigned to a variable nor pass it in print statement
                            //sort sadece siralama yapar. deger dondurmez.Bu yuzden array i print etmek icin stringe cevirmek gerek. bu yuzden toString kullanmak gerek.

        System.out.println( Arrays.toString(arr1) );
        System.out.println("Max: " +arr1[arr1.length-1]); // burada sort ettigimiz icin kucukden buyuge siralandi. max number i bulmak icin length-1 kullanmak gerek
        System.out.println("Min: "+arr1[0]);            // burada da arr1[0] dedigimizde en kucuk numarayi verecek

        System.out.println("================================================");

        double[] arr2 = {1.5,0.5, 2.5, 0, 3.5, 1.8, 10.5, 20.5, -0.75, -0.5 };

        Arrays.sort(arr2);   // deger dondurmez sadece siralamayi yapar

        System.out.println(   Arrays.toString( arr2 )  ); // arrayi sringe cevirip print eder

        System.out.println("Second minimum number: "+arr2[1]);
        System.out.println("Second maximum number: "+arr2[arr2.length-1-1]);


        System.out.println("===================================================");


        String[] names = {"Haroon", "Nurahmet", "Livio", "Dean", "Ayah", "afrooz", "me"};// afrooz' u ve  me 'yi kucuk harf yaptik.once buyuk harfle baslayanlar ilk siralanir
        Arrays.sort(names);

        System.out.println( Arrays.toString(names)  );


    // equals(arr1, arr2): returns boolean

        int[] a1 = {1, 2, 3};
        int[] a2 = {1, 3, 2};

        Arrays.sort(a1);  //[1, 2, 3]
        Arrays.sort(a2);  //[1, 2, 3]

        boolean r1 = Arrays.equals(a1, a2);
        System.out.println(r1);


//

    }

}
