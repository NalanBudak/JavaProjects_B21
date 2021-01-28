package Mentoring_Mikail;

import java.util.ArrayList;

public class HW2_Correct {

    public static void main(String[] args) {
      int[] arr = {1,22,333,44,5,65,7,8,9,10,11};
        System.out.println(evenNo(arr));

    }

    public static ArrayList<Integer> evenNo(int [] arr){
        ArrayList<Integer>list=new ArrayList<>();
        for (int i=0;i<= arr.length-1;i++){
            if (arr[i]%2!=0){
                list.add(arr[i]);
            }
        }
        return  list;
    }
}
