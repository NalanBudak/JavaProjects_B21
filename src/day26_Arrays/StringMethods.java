package day26_Arrays;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String str = "abcde";

        char[] array = str.toCharArray();

        System.out.println(  Arrays.toString(array)  );

        System.out.println("==================================");

        // anagram task:

        String s1 = "acb";  // a, c, b
      //String s2=  "bac"; //  b, a, c    eger karakterler ayni ise s1 ve s2 daki gibi buna anagram denir
        String s2 = "edf"; //

        char[] ch1 =  s1.toCharArray(); //[a, c, b]  // stringden array e cevirmek icin toCharArray kullaniyoruz.
        char[] ch2 = s2.toCharArray(); //[e d,f]

        Arrays.sort(ch1);  // siralama yapar
        Arrays.sort(ch2);

        System.out.println(  Arrays.toString(ch1) );
        System.out.println( Arrays.toString(ch2) );

        System.out.println("=====================================");

        boolean isAnagram = Arrays.equals(ch1, ch2);

        System.out.println(isAnagram);


    //split(str):  returns String Array, splits the string by given value

        String sentence = "Today is great day";
        String[] words =  sentence.split(" ");

        System.out.println(  Arrays.toString(words)  );


    }


}
