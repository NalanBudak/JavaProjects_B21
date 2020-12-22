package day40_ConstructorIntro;

public class Employee {


    public String name, jobTitle, ID;     // instance variable
    public double salary;

    public Employee(String name){ // A       burasi constructor
        this.name = name;
    }

    public Employee(String name, String jobTitle) { // B: A     shortcut => right click, generate ,constructor enter
        this(name); // A
        this.jobTitle = jobTitle;
    }

    public Employee(String name, String jobTitle, String ID) { // C: B, A
        this(name, jobTitle); // B
        this.ID = ID;
    }

    public Employee(String name, String jobTitle, String ID, double salary) { // D: C, B, A
        this(name, jobTitle, ID);
        this.salary = salary;
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID='" + ID + '\'' +
                ", salary=" + salary +
                '}';
    }
}

/*
1. class Name: Employee
			instance variables:
					name, jobTitle, ID, salary
			1st constructor: initialize the name of the employee
			2d constructor: initialize the name, jobTitle of the employee
							(MUST apply constructor Call)
			3rd Constructor: initialize the name, jobTitle, ID of the employee
							(MUST apply constructor Call)
			4th Constructor: initialize all the instance of the employee
								(MUST apply constructor Call)
			Instance methods:
				toString()
 */

