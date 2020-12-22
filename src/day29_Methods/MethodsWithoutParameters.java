package day29_Methods;

public class MethodsWithoutParameters {

    public static void main(String[] args) {

        // Main method===> used for  run the code top the bottom
        // Custom Method must be independent.  Method must be created within class , not inside the another method

        printHello5Times();              //step 1
        System.out.println("Muhtar");   // step 2
        printHello5Times();             // step 3
        System.out.println("Cybertek"); // step 4
        printHello5Times();            //  step 5

        MethodsWithoutParameters.printHello5Times();

        System.out.print("Odd Number: ");
        MethodsWithoutParameters2.printOddNumbers1To100();

        System.out.print("Even Numbers: ");
        MethodsWithoutParameters2.printEvenNumber1to100();

    }
    // AccessModifier  specifier   returnTYPE   MethodName (Parameter){ }
    public static void printHello5Times() {

        for(int i = 1; i < 6; i++){    // for loop is statement . it is not data.
            System.out.println("Hello"); // prints hello 5 times
        }
    }
}
/*
	    step1: print hello 5 times  (for loop)
		step2: print your name
		step3: print hello 5 times  (for loop)
		step4: print your school name
		step5: print hello 5 times   (for loop)
 */

