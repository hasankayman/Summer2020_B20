package day48_Inheritance.EmployeeTask;

public class Tester extends Employee{
    public Tester(String name, String jobTitle, long id, char gender, double salary) {
        setInfo(name, jobTitle, id, gender, salary);
    }
    public void findingBugs() {
        System.out.println(name + " is finding bugs");
    }

}
