package composite;

public class Main {
    public static void main(String[] args) {

        Department company = new Department("Компания");

        Department it = new Department("IT");
        Department hr = new Department("HR");

        Employee e1 = new Employee("Ali", "Developer", 5000);
        Employee e2 = new Employee("Dana", "HR Manager", 4000);
        Contractor c1 = new Contractor("Outsource Dev", 3000);

        it.add(e1);
        it.add(c1);
        hr.add(e2);

        company.add(it);
        company.add(hr);

        company.display("");

        System.out.println("\nЖалпы бюджет: " + company.getSalary());
        System.out.println("Қызметкерлер саны: " + company.getEmployeeCount());
    }
}
