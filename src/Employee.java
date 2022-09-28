public class Employee {

    private int id;
    private String fio;
    private int department;
    private double salary;
    private static int counter;


    public Employee(String fio, int department, double salary) {
        this.id = ++counter;
        this.fio = fio;
        this.department = department;
        this.salary = salary;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setDepartment(int department) {
        if (department < 0 || department > 5) throw new IllegalArgumentException("Введено невалидное значение");
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fio='" + fio + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }

}
