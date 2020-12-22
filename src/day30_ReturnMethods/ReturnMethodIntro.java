package day30_ReturnMethods;

public class ReturnMethodIntro {
        // Return Method ====>Exits the method can also return a value from method. Return type is not void.

        public static void main(String[] args) {

            // int multiplication =  addition(10, 20) * 3;  // asagidaki method void le oldugu icin cagiramiyoruz.
           //  int z =  addition(100, 200);               // asagidaki method void le oldugu icin cagiramiyoruz.

        System.out.println("=================================");


        System.out.println( addition2(10, 20)  ); // addition2  void olmadigi icin cagirabildik

       int sum = addition2(10, 20);

       int multiplication = sum * 3;

        System.out.println(multiplication);
    }

               // void method

    public static void addition(int n1, int n2){  // we can not  use "void method"  outside the method
        int n3 =n1+n2;
        System.out.println(n3);
    }


              // return method

    public static int addition2(int n1, int n2){  //  void yok burada
        int n3 = n1+n2;
        return n3;  //
    }


}
