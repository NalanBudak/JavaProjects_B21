package day45_Exceptions;


public class ExceptionHandling {

    public static void main(String[] args) {
        // StringIndexoutofBound

        String str = "Cybertek";

        try {
            System.out.println(str.substring(200, 300));

        } catch (StringIndexOutOfBoundsException e) {// name 'i  e olarak verdik . cunku prefer olan name e

            // System.out.println( e.getMessage() );
            //   e.printStackTrace(); // detail print almak icin kullaniriz
        }


        // Thread.sleep
        try {
            Thread.sleep(5000);// pause the exectution 5 seconds

        } catch (InterruptedException e) {

        }

       //
        try {
            System.out.println(100 / 0);// unchecked exception cunku 100  0 'a bolunmez
        }catch (ArithmeticException e){
            System.out.println("Unchecked exception is occured: " + e.getMessage());
            e.printStackTrace();
        }


        // Thread.sleep(5000);


        System.out.println("Test Completed");

    }




}
