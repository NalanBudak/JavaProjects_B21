package day27_ForEachLoop;

public class ReverseString {

    public static void main(String[] args) {



        String[] names = {"Delaram", "Aysel", "Snoop", "Ayse", "Erjon"}; // names represent array , eachname represent elements

               for ( String eachName: names ) { //  eachName represent ====>"Delaram", "Aysel", "Snoop", "Ayse", "Erjon"
                                                                         //   0123456    01234

            String reversedName = "";

            for(int i = eachName.length()-1; i >=0; i--  ){  // burada for each loop kullanamayiz cunku, bizim reverse yapmamiz icin last index den baslatmamiz gerek. for each loop iteration  start index number 0.
                reversedName += eachName.charAt(i);          //
            }

            System.out.println(reversedName);

        }



    }

}
