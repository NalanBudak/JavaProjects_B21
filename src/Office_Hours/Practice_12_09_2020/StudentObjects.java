package Office_Hours.Practice_12_09_2020;

public class StudentObjects {

    public static void main(String[] args) {

        CybertekStudent student1= new CybertekStudent();
        student1.setInfo("Nalan",39, 'F');
      //  student1.schoolName= "Mit";
        CybertekStudent.schoolName="MIT";

        CybertekStudent student2= new CybertekStudent();
        student2.setInfo("lale",24,'F');


        System.out.println(student1);
        System.out.println(student2);



    }


}
