package day41_Encapsulation;

public class Data {


    public static String publicVariable = "A";
    private static String privateVariable = "B";    // private is not reacble outside class and package
    static String defaultVariable = "C";  // default access modifier

    // protected static String protectedVariable = "D";

    Data(){

    }


    public static void publicMethod(){
        System.out.println("Public Method");
    } // constructor

    private static void privateMethod(){
        System.out.println("private Method");
    }

    static void defaultMethod(){
        System.out.println("default Method");
    }




}


