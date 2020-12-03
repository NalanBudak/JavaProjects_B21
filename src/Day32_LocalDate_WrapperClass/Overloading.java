package Day32_LocalDate_WrapperClass;

public class Overloading {

                                                    //when we do decllare we canot use ... instead of []
    public static void main(String... args) {  //  Sadece parameterin icinde  bu array [] isaretinin yerine  ...  konabilir . because compailer still recognize ... as Array
        System.out.println("String");
        int[] arr1 = {1,2,3};
        main(arr1);  // int
        // ... != []

    }  // consolda sadece main method yazdirir. diger methodlari yazdirmak icin digerlerini main method un  icine  koyarsak diger methodlarda  print edilir.

    public static void main(int[] args){
        System.out.println("int");
    }

    public static void main(double... args){
        System.out.println("double");
    }

    public static void main(char[] args){
        System.out.println("char");
    }


}





