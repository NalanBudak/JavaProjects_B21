package Day34_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionUtility {

    public static void main(String[] args) {
        ArrayList<Character> chars =  new ArrayList<>();
        chars.add('X');
        chars.add('Z');
        chars.add('Y');
        chars.add('W');
        chars.add('A');

        System.out.println(chars);

        Collections.sort(chars);

        System.out.println(chars);

        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(70);
        scores.add(80);
        scores.add(60);
        scores.add(70);
        scores.add(50);
        scores.add(65);
        scores.add(75);

        Collections.sort(scores);

        System.out.println("Minimum Number: " + scores.get(0));
        System.out.println("Maximum Number: "+scores.get( scores.size()-1  ));




    }

}
