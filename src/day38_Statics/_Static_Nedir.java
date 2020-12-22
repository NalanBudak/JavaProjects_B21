package day38_Statics;

public class _Static_Nedir {


    /*
        instance===> belong to the object
	                 each object has it's own copy of instances

instance :her objenin bir copy si vardir. 10 obje girilirse 10 diffrent copy verir.
static   : sadece bir copy verir. if we need only one copy we need static. one copy is faster.


----------------------------------------------
        static ===> belong to the class, static has  class members
		            there is only one copy is shared by the class and all objects of the class

		static variables
		static methods
		static block
		static class

		                static ONLY accepts static members
----------------------------------------------

        static variables ===> belong to the class.	ONLY one copy
			static called thorough to class. instance can not called through to class because instance belong to the object not class
----------------------------------------------

        static methods ====> belong to the class.

EXAMPLES  :

        CybertekStudent
		    instance: name, age, groupNumber (ogrenci sayisi birden fazla oldugu icin bizim diffrent object create etmemiz gerek. bu yuzden instance kullaniyoruz
            static :  schoolName (okulun  bir ismi olur.Birden fazla copy ye ihtiyac yoktur)

        Circle:
        	instance: r, d, area
        	static: PI


        iphone:
        	attributes:
		    	instance: model, color, price, storage
			    static: brand, operating system, madeIn, deignated


        Computer:
	    	instance: price, brand, color, ...
		    static: hasScreen, hasBattery, hasMemory

----------------------------------------------
        static initializer block ====> runs first, and only one time

        String var1  = "Cybertek"


       static {

       }
----------------------------------------------
          Static block initialize static variables regardless of the steps
          Static block run "only one time" because there is only one static copy
          Static variables can be called from anywhere as long as they are called from the Class

-------------------------------------------------
	methods: (ornek pizza class 'dan)
					customizeOrder(): allows user to set the size and toppings of Pizza
					calcCost(): returns the total cost  as double
					toString(): get the full informationa nd total cost of Pizza

*/



}
