package composite;

public class Contractor extends OrganizationComponent {

    private double payment;

    public Contractor(String name, double payment) {
        super(name);
        this.payment = payment;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + name + " (Contractor) - " + payment);
    }

    @Override
    public double getSalary() {
        return 0; // бюджетке кірмейді
    }

    @Override
    public int getEmployeeCount() {
        return 1;
    }
}
