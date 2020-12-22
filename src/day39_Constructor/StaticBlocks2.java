package day39_Constructor;

public class StaticBlocks2 {


    public static void main(String[] args) {  // last one. burada main method en son  will executed

        System.out.println("Main Method");

    }

    static {
        System.out.println("Static Block 1"); // first one
    }

    static {
        System.out.println("Static block 2"); // second
    }

    static {
        System.out.println("Static block 3"); //third
    }
}






