package Office_Hours.Practice_12_09_2020;

public class CybertekStudent {

    public String name;   //  instance variable
    public int age;
    public char gender;

    public static String schoolName = " Cybertek School", dreamJob = "SDET";   //  static variable
    public static boolean hasReplit = true,  hasFlipGrid =true;


    public void setInfo(String name,int age, char gender){   // burada static kullanmadik cunku, static sadece accept static variables. bu yuzden burada instance methodkullandik
        this.name =name;   // this. ====> to call instance variables or instance methods
        this.age=age;
        this.gender=gender;

    }

    public String toString() {

    return "name :"+ name +", Age: "+ age + ", GenderL: "+ gender + ", School Name: "+ schoolName +",Has Repl.it: "+ hasReplit+ ", Has FlipGrid: "+ hasFlipGrid+ ", dream job :"+ dreamJob;

    }




}
