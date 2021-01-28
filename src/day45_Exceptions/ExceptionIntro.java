package day45_Exceptions;

public class ExceptionIntro {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};

        //  System.out.println(array[100]); // unexpected event ==> unchecked ==> run time  (array size is fixed. 100 olmaz burda)



        //  Thread.sleep(2000); // unwanted event ==> checked ==> compile time


   //     System.out.println( 10 / 0 );  //10 0'a bolunmez. complier check yapamaz bu yuzden unwated event


        System.out.println("Test Completed");

    }

}
