public class Employee {
    String name;

    double salary;
    int workHour;
    int hireYear;
    double raise;
    double bonus;

    Employee(String name, int salary, int workHour, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHour = workHour;
        this.hireYear = hireYear;

    }

    void employeeParameters() {
        System.out.println("=======================");
        System.out.println("Name : " + this.name);
        System.out.println("=======================");
        System.out.println("Salary : " + this.salary);
        System.out.println("Working Hour : " + this.workHour);
        System.out.println("Start Year : " + this.hireYear);
    }

    double taxes() {
        if (this.salary < 1000)
            return 0;
        else
            return (this.salary * 0.03);

    }

    void printTaxes () {
        System.out.println("Taxes : " + taxes());

    }

    double salaryRaise() {
        if ((2021 - this.hireYear) < 10) {
            raise = (this.salary * 0.05);

        } else if ((10 <= (2021 - this.hireYear) && (2021 - this.hireYear < 20))) {
            raise = (this.salary * 0.10);


        } else {
            raise = (this.salary * 0.15);

        } return raise;

    }

    void printSalaryRaise () {
        System.out.println("Salary Raise : " + salaryRaise());
    }


    double bonus() {
        if ((this.workHour > 40)) {
            return this.bonus = ((this.workHour - 40) * 30);
        } else {
            return 0;
        }
    }

    void printBonus () {
        System.out.println("Bonus : " + bonus());
    }

    void EmployeeSalary() {
        System.out.println("***********************");
        System.out.println("Salary With Tax And Bonus : " + (this.salary - taxes() + bonus()));
        System.out.println("Total : " + (this.salary - taxes() + bonus() + salaryRaise()));
        System.out.println("***********************");
    }

}
