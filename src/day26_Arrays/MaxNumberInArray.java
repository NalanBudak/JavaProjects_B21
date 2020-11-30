package day26_Arrays;

public class MaxNumberInArray {

    public static void main(String[] args) {



        int[] numbers = {-300, -100, -400,  -50,  -500,  -150, -170};
        //                0    1     2    3    4     5    6     7


        int max =numbers[0]; //-0
            //  -2147483648 bu numara integer da ki en kucuk numaradir

        for(int i = 0; i <= numbers.length-1; i++ ){
            if(numbers[i] > max){   // maximum number -50
                max = numbers[i];
            }
        }


        System.out.println("max = " + max);





    }

}
