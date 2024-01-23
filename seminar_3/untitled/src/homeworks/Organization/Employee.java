package homeworks.Organization;

public class Employee {
    private String firstName;
    private String surName;
    private String patronymic;
    private String jobTitle;
    private String phoneNumber;
    private Double salary;
    private Integer age;
    private Organization organization;
    private Branch branch;
    private Department department;

    public Employee(String firstName, String surName, String patronymic, String jobTitle, String phoneNumber, Double salary, Integer age) {
        this.firstName = firstName;
        this.surName = surName;
        this.patronymic = patronymic;
        this.jobTitle = jobTitle;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String fullInfo() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", surName='" + surName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", organization=" + organization +
                ", branch=" + branch +
                ", department=" + department +
                '}';
    }

    @Override
    public String toString() {
        return "" + this.surName + " " + this.firstName + " " + this.patronymic;
    }
}
