package day27_ForEachLoop;

public class UniqueStrings {

    public static void main(String[] args) {

        String[] arr = {"C#", "C#", "Java", "Python", "Python", "C++"};

        for(int j = 0; j <= arr.length-1; j++ ) { // here is outer loop. outer loop line 9 da baslar line 24 'e kadar devam eder

            String element = arr[j];     // buraya j koyduk cunku outer loop. i koyamazdik cunku inner loop (local loop)
            int frequency = 0;

        for (int i = 0; i <= arr.length - 1; i++) {  // inner looop
             if (arr[i].equals(element)) {
                    frequency++;
                }
            }

            if (frequency == 1) {
                System.out.print(element + " ");
            }

        }



    }

}
