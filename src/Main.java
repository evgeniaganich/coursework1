public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
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

        for (int m = 0; m < employees.length; m++) {
            System.out.println(employees[m]);
        }
        int sum = 0;
        for (int n = 0; n < employees.length; n++) {
            sum += employees[n].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + sum);

        int maxCost = -1;
        for (int a = 0; a < employees.length; a++) {
            if (employees[a].getSalary() > maxCost) {
                maxCost = employees[a].getSalary();
            }
        }
        for (int b = 0; b < employees.length; b++) {
            if (employees[b].getSalary() == maxCost) {
                System.out.println("Сотрудник с максимальной зарплатой - " + employees[b].getName());
            }
            }
        int minCost = maxCost;
        for (int c = 0; c < employees.length; c++) {
            if (employees[c].getSalary() < minCost) {
                minCost = employees[c].getSalary();
            }
        }
        for (int d = 0; d < employees.length; d++) {
            if (employees[d].getSalary() == minCost) {
                System.out.println("Сотрудник с минимальной зарплатой - " + employees[d].getName());
            }
        }
        int averageSalary = sum / employees.length;
        System.out.println("Среднее значение зарплат составляет " + averageSalary);

        for (int e = 0; e < employees.length; e++) {
            System.out.println(employees[e].getName());
        }
    }
}
