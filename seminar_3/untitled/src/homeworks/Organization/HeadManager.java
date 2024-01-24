package homeworks.Organization;

public class HeadManager extends Employee{
    private Boolean isHead;
    public HeadManager(String firstName, String surName, String patronymic, String phoneNumber, Double salary, Integer age,
                       Organization organization) {
        super(firstName, surName, patronymic, "Head Manager", phoneNumber, salary, age);
        this.setOrganization(organization);
        organization.setHead(this);
        organization.addNewEmployee(this);
        this.isHead = true;
    }

    public void upSalaryForEmployees (Double bonusToSalary) {
        for (Employee employee: this.getOrganization().getEmployees()) {
            if (employee instanceof HeadManager && ((HeadManager) employee).isHead) {
                continue;
            } else {
                employee.setSalary(employee.getSalary() + bonusToSalary);
            }
        }
    }


    public Boolean getIsHead() {
        return isHead;
    }

    public void setIsHead(Boolean head) {
        isHead = head;
    }
}
