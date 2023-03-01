package CollectionApiEx;

public class EmployeeDetailsBean {

    private String name;
    private String employeeId;
    private double salary;

    public EmployeeDetailsBean(String name, String employeeId, double salary) {
        super();
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;

    }
}
