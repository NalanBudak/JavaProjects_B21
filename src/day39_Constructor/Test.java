package day39_Constructor;

public class Test {


    public static void main(String[] args) {


        System.out.println(StaticBlocks.company ); // static block run one time
        System.out.println(StaticBlocks.employee1);
        System.out.println(StaticBlocks.b);
        System.out.println(StaticBlocks.isEmployeed);

        StaticBlocks.company = "Bank Of America";

        System.out.println(StaticBlocks.company );




    }

}

