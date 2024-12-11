public class HourlyEmp extends Employee {
    private double hoursWorked;

    public HourlyEmp(String firstName, String lastName, String title, double payRate, double hoursWorked) {
        super(firstName, lastName, title, payRate);
        this.hoursWorked = hoursWorked;
    }


//    @Override
//    public double calculateSalary() {
//        return payRate * hoursWorked; // Weekly pay
//    }


    @Override
    public double calculateWeeklySalary() {
        return getPayRate() * hoursWorked;
    }

    public void display() {
        System.out.println(toString());
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Bi-Weekly Pay: $" + calculateWeeklySalary());
    }
}
