/**
 * Purpose: Calculate a bi-monthly salary (assuming 2 pay periods per
 * month-paid 24 times per year).
 * Constructor: Parameterized
 *  Invoke the parent class constructor to initialize parameters
 *  calculateSalary() : calculates salaried employee pay
 *  display(): Output employee name, title, and bi-monthly salary
 */

public class SalaryEmp extends Employee {
    public SalaryEmp(String firstName, String lastName, String title, double payRate) {
        super(firstName, lastName, title, payRate);
    }

//    @Override
//    public double calculateSalary() {
//        return payRate / 24; // Bi-monthly salary
//    }

    @Override
    public double calculateWeeklySalary() {
        return getPayRate() / 24;
    }

    public void display() {
        System.out.println(toString());
        System.out.println("Bi-Monthly Salary: $" + calculateWeeklySalary());
    }
}
