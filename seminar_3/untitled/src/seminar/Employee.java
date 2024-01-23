package seminar;

public class Employee {

    private String firstName;
    private String surName;
    private String patronymic;
    private String jobTitle;
    private String phoneNumber;


    private Double salary;


    private Integer age;

    public Employee(String firstName, String surName, String patronymic, String jobTitle, String phoneNumber, java.lang.Double salary, Integer age) {
        this.firstName = firstName;
        this.surName = surName;
        this.patronymic = patronymic;
        this.jobTitle = jobTitle;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    @java.lang.Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", surName='" + surName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
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
}
