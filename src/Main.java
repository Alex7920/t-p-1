public class Main {
    private static final Employee[] EMPLOYEES = new Employee[10];


    public static void main(String[] args) {
        Employee emp1 = new Employee("Fam1 Name1 SName1", 1, 25500f);
        Employee emp2 = new Employee("Fam2 Name2 SName2", 2, 31450f);
        Employee emp3 = new Employee("Fam3 Name3 SName3", 3, 40200f);
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        EMPLOYEES[0] = emp1;

    }
    public static void printEmployees() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee);
        }
    }
    public static int calculateTotalSalary() {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            sum += employee.getSalary();
        }
        return sum;

    }
    public static Employee findEmployeeWithMinSalary() {
       Employee result = EMPLOYEES[0];
       int minSalary = (int) EMPLOYEES[0].getSalary();
       for (Employee employee : EMPLOYEES) {
           if (employee.getSalary() < minSalary) {
               minSalary = (int) employee.getSalary();
               result = employee;
           }
       }
       return result;
    }
}