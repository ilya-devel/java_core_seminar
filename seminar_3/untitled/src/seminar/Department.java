package seminar;

import java.util.LinkedList;

public class Department extends BaseOrganization{
    private Branch branch;
    private LinkedList<Employee> employees;

    public Department(String name, String address, Employee generalManager) {
        super(name, address, generalManager);
        this.employees = new LinkedList<>();
    }

    public void addEmployee (Employee employee) {
        this.employees.add(employee);
        System.out.println("Add employee: " + employee);
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }
}
