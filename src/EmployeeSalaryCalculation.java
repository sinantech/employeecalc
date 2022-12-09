public class EmployeeSalaryCalculation {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Sinan", 7500,60,2005);

        employee1.employeeParameters();
        employee1.printTaxes();
        employee1.printSalaryRaise();
        employee1.printBonus();
        employee1.EmployeeSalary();

        Employee employee2 = new Employee("Gurhan",8500,60,2000);
        employee2.employeeParameters();
        employee2.printTaxes();
        employee2.printSalaryRaise();
        employee2.printBonus();
        employee2.EmployeeSalary();

    }
}
