package day48_Inheritance.EmployeeTask;

public class Developer extends Employee{
    public Developer(String name, String jobTitle, long id, char gender, double salary) {
        setInfo(name, jobTitle, id, gender, salary);
    }
    public void fixingBugs(){
        System.out.println(name + " is fixing bugs");
    }
}
