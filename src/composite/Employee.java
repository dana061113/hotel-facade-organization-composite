package composite;

public class Employee extends OrganizationComponent {

    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        super(name);
        this.position = position;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + name + " (" + position + ") - " + salary);
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public int getEmployeeCount() {
        return 1;
    }
}
