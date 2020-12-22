package day40_ConstructorIntro;

public class ConstructorCall {


    public ConstructorCall(){  // default constructor
        System.out.println("Default constructor");
    }

    public ConstructorCall(int a){ // burasi int constructor . once default,  sonra int  print olcak
        // ConstructorCall();  only a constructor can call another constructor

        this(); // calling the default constructor
        System.out.println("Constructor with int arg");
    }

    public ConstructorCall(String str){ // once default, sonra  int, en son string will be executed
        this(10); // default, int
        //   this();  // one constructor can ONLY call one constructor
        System.out.println("Constructor with String arg");
        //   this(10); // default, int   // constructor call MUST be at first step
    }


    public static void main(String[] args) {
        ConstructorCall obj1 = new ConstructorCall("A");

    }

    public void method4(){
        // ConstructorCall();    only a constructor can call another constructor
    }

    public static void method1(){
        //  ConstructorCall();
        System.out.println("Method 1");
    }

    public static void method2(){
        method1();
        System.out.println("Method 2");
    }

    public static void method3(){
        method1();
        method2();
        System.out.println("Method 3");
    }

/*        this:    refers to the object instances
	      this. :  to call instance variables or methods
	      this() :                        */





}
