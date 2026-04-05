package composite;

import java.util.ArrayList;
import java.util.List;

public class Department extends OrganizationComponent {

    private List<OrganizationComponent> list = new ArrayList<>();

    public Department(String name) {
        super(name);
    }

    @Override
    public void add(OrganizationComponent c) {
        list.add(c);
    }

    @Override
    public void remove(OrganizationComponent c) {
        list.remove(c);
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "Отдел: " + name);
        for (OrganizationComponent c : list) {
            c.display(indent + "  ");
        }
    }

    @Override
    public double getSalary() {
        double total = 0;
        for (OrganizationComponent c : list) {
            total += c.getSalary();
        }
        return total;
    }

    @Override
    public int getEmployeeCount() {
        int total = 0;
        for (OrganizationComponent c : list) {
            total += c.getEmployeeCount();
        }
        return total;
    }
}
