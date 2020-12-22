package day40_ConstructorIntro;

public class ConstructorIntro {

   static int b;

    static {

        System.out.println("static block");
        b = 200;  //  static  has only 1 copy.bu yuzden  200, bir defa print olur. ayrica  static block ilk consola yazilir
    }

    public ConstructorIntro(int a) {
        System.out.println("Constructor with int arg");

        b = 200;  //
        this.a = a;  // if local variable and instance has same name, you have to call this.
    }

    int a;

    public static void main(String[] args) {
        System.out.println("Hello");
        //   System.out.println(a);   //  a'yi kabul etmez cunku, int a instance'dir. static does not accept instance

        int num = new ConstructorIntro(200).a; // a = 200

        ConstructorIntro obj2 = new ConstructorIntro(300); // a = 300

        ConstructorIntro obj3 = new ConstructorIntro(400); // 400


        /*  declear:

                     Access Modidifier   ClassName(parameter){    */



    }


}
