package day39_Constructor;


public class CybertekStudent {

    public String name, gender;  // instance variable
    public int age;              // instance variable

    public static String schoolName, dreamJob;      // static variable
    public static boolean hasReplIt, hasFlipGrid;   // static variable

    static{                                //  static block ta sadece static variables initialize olur , intance variable initialize olmaz.
        schoolName = "Cybertek School";
        dreamJob = "SDET";
        hasReplIt = true;
        hasFlipGrid = true;
    }

    public void setInfo(String name, String gender, int age) {  // instance vaiables' lari set etmek icin setInfo methodu kullaniyoruz
        this.name = name;
        this.gender = gender;
        this.age = age;

    }

    public String toString() {
        return "CybertekStudent{ " +
                "name= " + name + '\'' +
                ", gender=' " + gender + '\'' +
                ", age=" + age +
                ", School name= "+schoolName+
                '}';
    }
}

