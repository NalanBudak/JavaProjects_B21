package Day32_LocalDate_WrapperClass;

public class ValueOfMethods {

    public static void main(String[] args) {


        // valueOf Method=====> Converts string to Wrapper Class. Wrapper class does not have case sensitivity


        String  s1 = "123";
        int num1 =   Integer.valueOf(s1); // unboxing
        // primitive  <==== wrapper class

        Integer num2 = Integer.valueOf(s1);  // none . Her ikiside Wrapper class.
        System.out.println(num1+1); // 123+1=124

        System.out.println("========================================");

        String s2 = "2.5";
        double num3 =    Double.valueOf(s2);
        System.out.println(num3+1);

        System.out.println("=======================================");

        String s3 = "False";
        boolean r1 = Boolean.valueOf(s3); // unboxing. cunku  wrapper class to  primitive = unboxing

        System.out.println(r1);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


    }

}
