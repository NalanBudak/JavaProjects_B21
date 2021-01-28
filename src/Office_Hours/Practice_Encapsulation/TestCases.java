package Office_Hours.Practice_Encapsulation;

public class TestCases {

    public static void main(String[] args) {

        Credentials c1 = new Credentials();

        System.out.println("User Name Entered: "+ c1.getUserName());
        c1.setUserName("Batch20");
        System.out.println("New User Name Entered: "+ c1.getUserName());
        System.out.println("User name Entered Again :"+ c1.getUserName());

        System.out.println("======================");

        System.out.println("Password Entered: "+ c1.getPassword());

        c1.setPassword("JavaTurtles");

        System.out.println("New {assword Entered: "+ c1.getPassword());
        System.out.println("New Password Entered Again: "+ c1.getPassword());


    }




    }


