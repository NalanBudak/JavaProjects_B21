package day23_NestedLoop;

public class NestedLoopIntro {

    public static void main(String[] args) {

    /*
        for(int i = 1; i <= 10; i++){
            System.out.print(i+" ");
        }
        System.out.println();


        for(int i = 1; i <= 10; i++){
            System.out.print(i+" ");
        }
        System.out.println();


        for(int i = 1; i <= 10; i++){
            System.out.print(i+" ");
        }
        System.out.println();


        for(int i = 1; i <= 10; i++){
            System.out.print(i+" ");
        }
        System.out.println();


        for(int i = 1; i <= 10; i++){
            System.out.print(i+" ");
        }
        System.out.println();

     */

        //  NESTED LOOP===> LOOP ICINDE ANOTHER LOOP

        for(int j = 1; j <= 5; j++){ //outer loop // line sayisini verir

            for(int i = 1; i <= 10; i++){  // inner loop . bir siradaki elementin sayisini verir
                System.out.print(i+" ");
            }

            System.out.println();
        }


        System.out.println("=============================================");

        for(int j = 1; j <= 10; j++) {

            for (int i = 1; i <= 20; i++) {
                System.out.print("*");
            }
            System.out.println();

        }





    }


}
