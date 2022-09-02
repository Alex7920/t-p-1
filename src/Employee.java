public class Employee {

    private String FIO;
    private int Department;
    private float Salary;
    private static int Id;


    public int getId() { return this.Id; }
    public String getFIO() { return this.FIO; }
    public int getDepartment() { return this.Department; }
    public float getSalary() { return this.Salary; }


    public void SetFIO(String fio) { this.FIO = fio; }
    public void SetDepartment(int dept) { this.Department = dept; }
    public void SetSalary(float sal) { this.Salary = sal; }


    public Employee(String fio, int dept, float salary) {
        FIO = fio;
        Department = dept;
        Salary = salary;
        Id++;
    }

    @Override
    public String toString() {
        return "Fio: " + FIO + " Dept: " + Department + " Salary: " + Salary;
    }


    public static void main(String[] args) {
        Employee[] empl = new Employee[3];
        empl[1] = new Employee("Fam1 Name1 SName1", 1, 25500f);
        empl[2] = new Employee("Fam2 Name2 SName2", 2, 31450f);
        empl[3] = new Employee("Fam3 Name3 SName3", 3, 40200f);


        for (Employee e: empl) {
            System.out.println(e);
        }
    }
}
