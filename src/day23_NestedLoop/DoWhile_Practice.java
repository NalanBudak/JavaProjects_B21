package day23_NestedLoop;

public class DoWhile_Practice {

    public static void main(String[] args) {


        // for loop


        for(int i =1; i <= 20; i++){
            if(i%2 !=0){
                System.out.println(i);
            }
        }


        System.out.println("====================================");

        // do while loop

        int i =1;

        do{
            if(i%2 !=0){
                System.out.println(i);
            }
         i++;
        }while( i <= 20 );



    }

}
