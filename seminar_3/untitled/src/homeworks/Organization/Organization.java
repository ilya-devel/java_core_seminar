package homeworks.Organization;

import java.util.LinkedList;

public class Organization extends BaseOrganization{
    private LinkedList<Employee> employees;
    private HeadManager head;
    public Organization(String name) {
        super(name);
        this.employees = new LinkedList<>();
    }
    public LinkedList<Employee> getEmployees() {
        return employees;
    }

    public HeadManager getHead() {
        return head;
    }

    public void setHead(HeadManager head) {
        this.head = head;
    }
    public void addNewEmployee (Employee employee) {
        this.employees.add(employee);
        System.out.println("Add new employee" + employee);
    }
}
