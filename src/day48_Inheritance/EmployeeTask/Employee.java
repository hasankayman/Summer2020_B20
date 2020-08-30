package day48_Inheritance.EmployeeTask;

public class Employee {
    public String name;
    public String jobTitle;
    public long id;
    public char gender;
    public double salary;

    public void setInfo(String name, String jobTitle, long id, char gender, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.id = id;
        this.gender = gender;
        this.salary = salary;
    }

    public String toString() {
        return "Name: " + name + ", Job Title: " + jobTitle + "ID#: " + id +
                ", Gender: " + gender + ", Salary: " + salary;

    }
}
