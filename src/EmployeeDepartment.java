import java.util.List;
import java.util.ArrayList;

public class EmployeeDepartment {
    private static List<EmployeeDepartment> departments = new ArrayList<>();
    private static List<Employee> employeesInDepartment = new ArrayList<>();
    private String departmentName;

    public EmployeeDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    public static EmployeeDepartment createDepartment(String departmentName) throws NotUniqueException {
        for (EmployeeDepartment department : departments) {
            if (department.departmentName.equals(departmentName)) {
                throw new NotUniqueException("Department " + departmentName + " already exists!");
            }
        }
        EmployeeDepartment department = new EmployeeDepartment(departmentName);
        departments.add(department);
        return department;
    }

    public static void addEmployeesToDepartment(Employee employee) {
        employeesInDepartment.add(employee);
    }

    public static List<Employee> getEmployeesFromDepartment(EmployeeDepartment department) {
        List<Employee> employees = new ArrayList<>();
        for (Employee employee : employeesInDepartment) {
            if (employee.getDepartment().equals(department)) {
                employees.add(employee);
            }
        }
        return employees;
    }

    @Override
    public String toString() {
        return "EmployeeDepartment{" +
                "departmentName='" + departmentName + '\'' +
                '}';
    }
}

