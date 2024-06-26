import java.util.ArrayList;
import java.util.List;

class Brigade {
    private String brigadesName;
    private Foreman foreman;
    private List<Employee> employees;
    public static List<Brigade> brigades = new ArrayList<>();

    public Brigade(String brigadesName, Foreman foreman, List<Employee> employees) {
        this.brigadesName = brigadesName;
        this.foreman = foreman;
        this.employees = employees;
        brigades.add(this);
    }

    public static List<Brigade> getBrigades() {
       return brigades;
    }

    public String getBrigadesName() {
        return brigadesName;
    }

    public Foreman getForeman() {
        return foreman;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees.addAll(employees);
    }

    public void setEmployees(Employee employee) {
        this.employees.add(employee);
    }

    @Override
    public String toString() {
        return "Brigade{" +
                "brigadesName='" + brigadesName + '\'' +
                ", foreman=" + foreman.getName()+" "+foreman.getSurname() +
                ", employees=" + employees +
                '}';
    }

    public void deleteEmployeeFromBrigade(Employee employee) {
        employees.remove(employee);
    }

    public void setForeman(Foreman foreman) {
        this.foreman = foreman;
    }
}
