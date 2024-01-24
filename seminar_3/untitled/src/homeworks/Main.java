package homeworks;

import homeworks.Organization.Employee;
import homeworks.Organization.HeadManager;
import homeworks.Organization.Organization;

import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is homework for seminar3");

        Employee mary = new Employee(
                "Mary",
                "Black",
                "Arturia",
                "Java-developer",
                "+79091005333",
                75000D,
                25
        );
        Employee liza = new Employee(
                "Liza",
                "Darkwood",
                "Marriet",
                "Java-developer",
                "+75437894545",
                63000D,
                22
        );
        LinkedList<Employee> lstEmployee = new LinkedList<>();
        lstEmployee.add(mary);
        lstEmployee.add(liza);
        System.out.println("\nСортируем список сотрудников по зарплате:");
        Collections.sort(lstEmployee);
        for (Employee empl: lstEmployee) {
            System.out.println(empl);
        }

        System.out.println();

        Organization organization = new Organization("OOO Astra");

        HeadManager roza = new HeadManager(
                "Roza",
                "Darkwood",
                "Marriet",
                "+75437894545",
                100000D,
                35,
                organization
        );
        organization.addNewEmployee(liza);
        organization.addNewEmployee(mary);
        System.out.println("\nСписок сотрудников до повышения зарплаты:");
        for (Employee empl: organization.getEmployees()) {
            System.out.println(empl + " " + empl.getSalary() + (empl instanceof HeadManager ? " HEAD" : ""));
        }
        roza.upSalaryForEmployees(10000D);
        System.out.println("\nСписок сотрудников после повышения зарплаты:");
        for (Employee empl: organization.getEmployees()) {
            System.out.println(empl + " " + empl.getSalary() + (empl instanceof HeadManager ? " HEAD" : ""));
        }
    }
}
