package day45_Constructor;

public class SalaryCalculator {
    double hourlyRate;
    int weeklyHour;
    double stateTaxRate;
    double federalTaxRate;

    public SalaryCalculator(double hourlyRate, int weeklyHour, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHour = weeklyHour;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }

    public double salary(){ return hourlyRate * weeklyHour * 48; }

    public double stateTax(){ return salary() * stateTaxRate;}

    public double federalTax() { return salary() * federalTaxRate;}

    public double salaryAfterTax() { return salary() - stateTax() - federalTax();}

    public String toString() {
        return "Salary: " + salary() + "\nState Tax: " + stateTax() + "\nFederal Tax:" + federalTax() + "\nSalary After Tax: " + salaryAfterTax();
    }
}
