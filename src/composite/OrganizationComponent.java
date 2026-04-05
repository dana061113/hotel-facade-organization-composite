package composite;

public abstract class OrganizationComponent {

    protected String name;

    public OrganizationComponent(String name) {
        this.name = name;
    }

    public void add(OrganizationComponent c) {
        throw new UnsupportedOperationException();
    }

    public void remove(OrganizationComponent c) {
        throw new UnsupportedOperationException();
    }

    public abstract void display(String indent);
    public abstract double getSalary();
    public abstract int getEmployeeCount();
}
