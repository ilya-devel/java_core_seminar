package main;

import seminar.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee empl1 = new Employee("Mary", "Black", "Archer", "Java-developer", "+7908102309", 75000.4D, 24);
        Employee empl2 = new Employee("Maria", "Black", "Archer", "Java-developer", "+7908112309", 75000.4D, 23);
        Employee empl3 = new Employee("Liza", "White", "Michael", "Java-developer", "+7901232309", 75000.4D, 35);
        Employee empl4 = new Employee("Daphne", "Darkblood", "Smith", "Java-developer", "+79312312309", 75000.4D, 46);
        Employee empl5 = new Employee("Fleur", "Darkwood", "Smith", "Java-developer", "+79081132309", 75000.4D, 31);
        System.out.println(empl1);
        Employee[] employees = new Employee[] {empl1, empl2, empl3, empl4, empl5};
        EmployeeUtils.upSalaryForAge(employees, 5000D, 32);
        for (Employee employee: employees) {
            System.out.println(employee);
        };
        Organization org1 = new Organization("Org1", "address 1", empl1);
        Organization org2 = new Organization("Org2", "address 2", empl2);
        Branch org1Branch = new Branch("branch 1", "address 1 1", empl1);
        Branch org2Branch = new Branch("branch 2", "address 2 1", empl3);
        Department dep1 = new Department("IT-department", "address 1 1", empl5);
        Department dep2 = new Department("IT-department", "address 2 1", empl4);

        org1Branch.addDepartment(dep1);
        org1.addBranch(org1Branch);

        System.out.println(org1);
    }
}