public class Employee {
    private String name;
    private int Joinyr;
    private double sal;
    private String add;

    public Employee(String name, int Joinyr, double sal, String add) {
        this.name = name;
        this.Joinyr = Joinyr;
        this.sal = sal;
        this.add = add;
    }

    public String getName() {
        return name;
    }

    public int getYearOfJoining() {
        return Joinyr;
    }

    public double getSalary() {
        return sal;
    }

    public String getAddress() {
        return add;
    }

    public static void main(String[] args) {
        Employee emp_1 = new Employee("Faiz", 2004, 60000.0, "DHA");
        Employee emp_2 = new Employee("Tayyab", 2019, 50000.0, "Malir");
        Employee emp_3 = new Employee("Faizan", 1999, 55000.0, "Gulshan");

        System.out.println("Name\tYear of Joining\tSalary\tAddress");
        displayEmployeeInfo(emp_1);
        displayEmployeeInfo(emp_2);
        displayEmployeeInfo(emp_3);
    }

    public static void displayEmployeeInfo(Employee employee) {
        System.out.println(employee.getName() + "\t" +
                employee.getYearOfJoining() + "\t\t" +
                employee.getSalary() + "\t" +
                employee.getAddress());
    }
}
