package seminar;

import java.util.LinkedList;

public class Branch extends BaseOrganization{
    private Organization mainOffice;
    private LinkedList<Department> departments;

    public Branch(String name, String address, Employee generalManager) {
        super(name, address, generalManager);
        this.departments = new LinkedList<>();
    }

    public void addDepartment (Department department) {
        this.departments.add(department);
        department.setBranch(this);
        System.out.println("Add departments: " + department);
    }

    @Override
    public String toString() {
        return "Branch{" +
                "name='" + this.getName() + '\'' +
                ", address='" + this.getAddress() + '\'' +
                "mainOffice=" + mainOffice +
                '}';
    }

    public void setMainOffice(Organization mainOffice) {
        this.mainOffice = mainOffice;
    }
}
