package day48_Inheritance.EmployeeTask;

public class EmployeeObjects {
    public static void main(String[] args) {
        Tester tester1 = new Tester("Habibe", "QA Engineer", 900124541,'F',110000);

        System.out.println("Tester name = " + tester1.name);
       // System.out.println("Tester salary = " + tester1.);

        tester1.findingBugs();
        System.out.println(tester1);
        System.out.println("=================================================================================");
        Developer dev1 = new Developer("Hasan", "DevOp", 900145241, 'M', 140000);

        dev1.fixingBugs();
        System.out.println(dev1);

    }
}
