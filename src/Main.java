public class Main {
    private static Employee[] employees = new Employee[10];


    public static void main(String[] args) {
        employees[0] = null;
        employees[1] = new Employee("Fam1 Name1 SName1", 1, 20000);
        employees[2] = new Employee("Fam2 Name2 SName2", 2, 35050);
        employees[3] = new Employee("Fam3 Name3 SName3", 3, 40200);
        printAllEmployee();
        System.out.println(getCalculateSumSalary());
        System.out.println(getEmployeeMinSalary());
        System.out.println(getEmployeeMaxSalary());
        System.out.println(getAverageSalaryEmployee());
        printNameAllEmployee();

    }

    public static void printAllEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static double getCalculateSumSalary() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee == null) continue;
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee getEmployeeMinSalary() {
        double min = 0;
        int index = 0;
        Employee employeeMinSalary = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                min = employees[i].getSalary();
                employeeMinSalary = employees[i];
                index = i;
                break;
            }
        }

        for (int i = index; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                employeeMinSalary = employees[i];
            }
        }
        return employeeMinSalary;
    }

    public static Employee getEmployeeMaxSalary() {
        double max = 0;
        int index = 0;
        Employee employeeMaxSalary = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                max = employees[i].getSalary();
                employeeMaxSalary = employees[i];
                index = i;
                break;
            }
        }
        for (int i = index; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                employeeMaxSalary = employees[i];
            }
        }
        return employeeMaxSalary;
    }

    public static double getAverageSalaryEmployee() {
        double sum = 0;
        int countEmp = 0;
        for (Employee emp : employees) {
            if (emp == null) continue;
            countEmp++;
            sum += emp.getSalary();
        }
        return sum/countEmp;
    }
    public static void printNameAllEmployee(){
      for (Employee empl : employees) {
          if (empl == null) continue;
          System.out.println(empl.getFio());
      }
    }
}


