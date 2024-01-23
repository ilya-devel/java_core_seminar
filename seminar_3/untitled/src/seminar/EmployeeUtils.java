package seminar;

public class EmployeeUtils {
    public static void upSalaryForAge (Employee[] employees, Double bonus, Integer age) {
        for (Employee employee: employees) {
            if (employee.getAge() > age) {
                employee.setSalary(employee.getSalary() + bonus);
            }
        }
    }
}
