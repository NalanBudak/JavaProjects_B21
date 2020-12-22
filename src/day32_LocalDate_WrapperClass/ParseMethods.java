package day32_LocalDate_WrapperClass;

public class ParseMethods {

    public static void main(String[] args) {


        String data1 = "123";

        System.out.println(data1+3); //1233

        int num1 = Integer.parseInt(data1);  //  none
        //            primitive   <===  primitive int (We assigned to primitive to primitive)

        Integer num2 = Integer.parseInt(data1);  // Autoboxing
        //  wrapper class <=== primitive

        System.out.println(num1+3); // 126

        System.out.println("=====================================");

        String s1 = "Hello";

        // int num3 = Integer.parseInt(s1); // integer only  accept  digits.Not string

        //   System.out.println(num3);

        System.out.println("====================================");

        String s2 = "2.5";
        double d1 = Double.parseDouble(s2);  // none, cunku (s2) stringini, double d1 e parse methodu ile assign etmistik. bu yuzden ikiside primitive oldu
        // primitive <=== primitive

        Double d2 = Double.parseDouble(s2);  // autoboxing
        // Wrapper class <=== primitive

        System.out.println(d1+1);     // 2.5 +1 = print 3.5 olacak

        System.out.println("=======================================");


        String s3 = "Maybe";
        boolean r1 = Boolean.parseBoolean(s3); // none       cunku ikiside primitive . (string prse ile primitive oldu)
        Boolean r2 = Boolean.parseBoolean(s3);  // auto boxing  ===> s3 parse ile primitive olmustu. s3 assigned to wrapper class . sonuc olarak auto boxing oldu

        System.out.println(r1); // default value of boolean is false

        String s4 = "FaLse";
        boolean r3 = Boolean.parseBoolean(s4);

        System.out.println(r3);  // not case sensitive




    }


}
