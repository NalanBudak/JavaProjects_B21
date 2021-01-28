package day45_Exceptions;

public class FinallyBlock {

    public static void main(String[] args) {

        //     finally block=====> ALWAYS gets executed regardless of the exception

        //                        it is  not mandatory


        try {
            System.out.println(9 / 0);
        } catch (RuntimeException e) {
            System.out.println("Catch Block");
            //  System.exit(0);  // finally block'u durdurmak icin System.exit(0) yazabiliriz

        } finally {
            System.out.println("Finally: Closed");
        }


        System.out.println("Test Completed");

    }
}