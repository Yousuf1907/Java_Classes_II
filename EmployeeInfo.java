import java.util.Scanner;

public class EmployeeInfo {
    private double salary;

    public void getInfo(double initial_Sal, int Work_hrs) {
        salary = initial_Sal;
        addWork(Work_hrs);
    }

    public void addWork(int Work_hrs) {
        if (Work_hrs > 6) {
            salary += 5;
        }
    }

    public void displayFinalSalary() {
        System.out.println("Final Salary: $" + salary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        EmployeeInfo employeeInfo = new EmployeeInfo();

        System.out.print("Enter initial salary: $");
        double initial_Sal = scanner.nextDouble();

        System.out.print("Enter number of hours of work per day: ");
        int Work_hrs = scanner.nextInt();

        employeeInfo.getInfo(initial_Sal, Work_hrs);
        employeeInfo.displayFinalSalary();

        scanner.close();
    }
}
