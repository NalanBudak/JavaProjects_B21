package Office_Hours.Practice_CustomClass;

public class Task2Employee2 {

    public static void main(String[] args) {

     /*   Task2Employee employee1 =new Task2Employee();
        employee1.setInfo("a","a","a",100000, 'F');

        employee1.getInfo();

        employee1.setInfo("b","a","a",10000,'F');
        employee1.getInfo();*/


        Task2Employee employee2 =new Task2Employee();

        employee2.setName("Aziz");
     //   employee2.getName();
        System.out.println(employee2.getName());

        employee2.setCompanyName("Capital One");
     //   employee2.getCompanyName();
        System.out.println(employee2.getCompanyName());

        employee2.setJobtitle("SDET");
      //  employee2.getJobtitle();
        System.out.println(employee2.getJobtitle());

        employee2.setGender('M');
    //   employee2.getGender();
        System.out.println(employee2.getGender());

        employee2.setSalary(100000);
     //   employee2.getSalary();
        System.out.println(employee2.getSalary());

        employee2.setName("Nalan");
        employee2.getName();
        System.out.println(employee2.getName());


    }
}
