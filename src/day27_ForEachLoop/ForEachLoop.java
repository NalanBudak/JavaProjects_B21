package day27_ForEachLoop;

public class ForEachLoop {

    public static void main(String[] args) {


              // For Loop solution

        String[] names = {"Delaram", "Aysel", "Snoop", "Ayse", "Erjon"};

        for(int i = 0; i <= names.length-1; i++ ){  // i is the index num of array
            System.out.println( names[i] );  // butun  elementleri  print etmek
        }
        System.out.println("=====================================");


             // For Each Loop Solution // each loop index number 0 dan baslar .....gider.order is fixed .Asla reverse olmaz. tersden asla yazdiramayiz fpr loop taki gibi. kural boyle.

        for(String   each  : names ){  // each  represent, all the  elements in the array. Data type MUST MATCH with collection of data
            System.out.println(each);
        }

        System.out.println("=========================================");


        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12}; // data dype match with data. (data collection array burada.)

        int countEvens = 0;
        int countOdds =0;

        for(int  each  : numbers) { // each is the elements of the array.  numbers  represent  collection of data
            if (each % 2 == 0) {
                countEvens++;
            } else {
                countOdds++;
            }
        }

        System.out.println("count Odds = " + countOdds);       // consolda even da, odd da 6 olacak .

        System.out.println("count Evens = " + countEvens);



        System.out.println("=======================================================");

     // maximum and minimum number  i bulmak icin kullanilan yontem

        int[] scores = {10, 2, 3, 25, 5, 100, -5, -2, 1000, 30, 40, 56};
        int max = scores[0] ;
        int min = scores[0];
        
        for(int each  : scores){ // each represent elements  . score represent collection of data
            if(each > max){
                max = each;
            }

            if(each < min){
                min = each;

            }
        }


        System.out.println("max = " + max);
        System.out.println("min = " + min);





    }

}
