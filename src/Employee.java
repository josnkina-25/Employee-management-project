import java.util.Objects;
import java.util.Scanner;
public class Employee {
    protected String firstName;
    protected String lastName;
    protected String title;
    protected double payRate; //For salaried employees, this is annual salary; for hourly, this is hourly rate

    public Employee() {}
    // constructor
    public Employee(String firstName, String lastName, String title, double payRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.payRate = payRate;
    }

    public Employee(String next) {
    }

    public double calculateWeeklySalary() {
        return 0.0;

    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getTitle() {
        return title;
    }
    public double getPayRate() {
        return payRate;
    }
    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
    public void inputEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee type (salaried/hourly): ");
        String type = scanner.nextLine().toLowerCase();
        System.out.print("Enter employee first name: ");
        this.firstName = scanner.nextLine();
        System.out.print("Enter employee last name: ");
        this.lastName = scanner.nextLine();
        System.out.print("Enter employee title: ");
        this.title = scanner.nextLine();

        if (type.equals("salaried")) {
            System.out.print("Enter annual salary: ");
            this.payRate = scanner.nextDouble();
            SalaryEmp salariedEmployee = new SalaryEmp(this.firstName, this.lastName, this.title, this.payRate);
            salariedEmployee.display();
        } else if (type.equals("hourly")) {
            System.out.print("Enter hourly rate: ");
            this.payRate = scanner.nextDouble();

            System.out.print("Enter hours worked: ");
            double hoursWorked = scanner.nextDouble();

            HourlyEmp hourlyEmployee = new HourlyEmp(this.firstName, this.lastName, this.title, this.payRate, hoursWorked);
            hourlyEmployee.display();

        }else{
            System.out.println("Invalid input");
        }
    }

    @Override
    public String toString() {
        return "Employee: " + firstName + " " + lastName + ", Title: " + title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(payRate, employee.payRate) == 0 &&
                Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName) &&
                Objects.equals(title, employee.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, title, payRate);
    }
}
