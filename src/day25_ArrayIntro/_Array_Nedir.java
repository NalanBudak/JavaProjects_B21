package day25_ArrayIntro;

public class _Array_Nedir {

    /*
        ARRAY =====> ARRAY'S SIZE FIXED.YOU CAN NOT CHANGE

            regular variable ve Array variable arasindaki fark asagida gosterilmistir

   ==========================================================

            VARIABLE=======> for use store the data. Regular variable can sotore only one data.

	        	DataType  name = data;

		        int number = 100;


            ARRAY VARIABLE====> a variable that can have "multiple data"
==========================================================
	    declare array:
		DataType[] arrayName = {data1, data2, data3... };

==========================================================
	initializing the size only:
		DataType[] arrayName = new  DataType[length];

		String[] students = new String[10];

		ARRAY' SIZE IS FIXED

	length ==> total number of elements
	length -1 ==> max index
==========================================================

    3 Data Structures:
		1. Array
		2. Collection
		3. Map


Arrays Utility:

	Arrays class: in "java.util" package

			import PackageName.ClassName;
			import java.util.Arrays;


  Arrays.toString( array )====>    converts the array to String
									MUST use in order to print the entire array

  Arrays.sort(array)==========> sorts the array in ascending order

					int[] arr = {9,4,2,1, 10, 11, 0};

							  {0, 1, 2, 4, 9, 10, 11}

ascending =====> from smallest to largest
descending=====> from largest to smallest

	equals(arr1, arr2)=======> returns boolean

==========================================================

String methods:

	toCharArray()=======> returns char array from string
			str = "abcd";

			str.toCharArray() ==> {'a', 'b', 'c', 'd'}
==========================================================

	split(strValue)=======> returns String array, splits the string by given value

		str = "Today is great day";
		str.split(" "); ==> {"Today", "is", "great", "day" }



     */
}
