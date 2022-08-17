public class Employee {

    private static int countter;

    private Integer id;
    private String name;
    private String LastName;
    private String middleName;
    private int department;
    private int salary;

    public Employee(String name, String LastName, String middleName, int department, int salary) {
        this.name = name;
        this.LastName = LastName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        this.id = countter++;

    }

    public String getName() {
        return name;
    }

    public String getLestName() {
        return LastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getDepartment() {
            return department;
    }

    public Integer getId() {
        return this. id;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(byte department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", LastName='" + LastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }
}
