package day23_NestedLoop;

public class DoWhile {

    public static void main(String[] args) {

        /* while ===> repeated if statement.while loop checks first condition.
         eger condion  false ise asla executed olmaz*/

       // do while ===>gets executed at least once even if the condition is false. never care condition first.



        boolean condition = false;

        while(condition){ // think first
            System.out.println("Hello Batch 21"); // never executed because condition is false
        }

        System.out.println("==================================");


        do{
            System.out.println("Hello Batch 21");  // it will be executed one time because do while does  not care condition first
        }while(condition);  // do first, think later


    }

}
