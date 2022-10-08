public class Main {
    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Иванов Иван Иванович", 1, 70000);
        employees[1] = new Employee("Петрова Мария Петровна", 2, 75000);
        employees[2] = new Employee("Сидоров Сидор Сидорович", 3, 65000);
        employees[3] = new Employee("Ромашкина Роза Яковлевна", 4, 90000);
        employees[4] = new Employee("Семенова Вера Андреевна", 5, 80000);
        employees[5] = new Employee("Морская Марина Нептуновна", 1, 85000);
        employees[6] = new Employee("Денисова Анна Викторовна", 2, 95000);
        employees[7] = new Employee("Пупкин Василий Васильевич", 3, 88000);
        employees[8] = new Employee("Павлов Павел Петрович", 4, 75000);
        employees[9] = new Employee("Волков Дмитрий Андреевич", 5, 67000);
        printAllEmployees();
        System.out.println("Сумма затрат на зарплаты в месяц: " + calculateSumSalary());
        System.out.println("Сотрудник с максимальной зарплатой - " + getEmployeeWithMaxSalary());
        System.out.println("Сотрудник с минимальной зарплатой - " + getEmployeeWithMinSalary());
        System.out.println("Средняя зарплата составляет " + calculateAverageSalary());
        printAllEmployeesNames();
    }

    public static void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }

    }

    public static int calculateSumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static Employee getEmployeeWithMaxSalary() {
        int max = Integer.MIN_VALUE;
        Employee targetEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }

    public static Employee getEmployeeWithMinSalary() {
        int min = Integer.MAX_VALUE;
        Employee targetEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }

    public static int calculateAverageSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        int averageSalary = sum / employees.length;
        return averageSalary;
    }

    public static void printAllEmployeesNames() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getName());
            }
        }

    }
}
