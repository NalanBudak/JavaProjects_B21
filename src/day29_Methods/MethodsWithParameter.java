package day29_Methods;

public class MethodsWithParameter {

    public static void main(String[] args) {

        int age = 35;

        eligibleToBuyAlcohol( age );    // asagidaki method tan cagiriyoruz.

        eligibleToBuyAlcohol(30); // asagidaki method tan cagiriyoruz.

        calculateAge(2018, 2015);
        calculateAge(1965, 2020);

        calculateAge(1976, 2020);

    }

    public static void eligibleToBuyAlcohol(int age){ // we need condition.that is why created if condition

        if(age >= 21){
            System.out.println("Eligible to buy alcohol");
        }else{
            System.out.println("Not Eligible to buy alcohol");
        }

    }

    public static void calculateAge(int birthYear, int currentYear){

        if(birthYear < currentYear) {
            System.out.println("Your Age is: " + (currentYear - birthYear) + " years old");
        }else{
            System.out.println("Invalid Entry");
        }

    }


}
