// --------------------------------  Employee Class  -------------------------- //
abstract class Employee{
    int id;
    String name;
    abstract public void calPayroll();
}

// -------------------------------- PayrolCal Interface  -------------------------- //
interface IPayrollCal{
    void calPayroll();
}

// --------------------------------  Hourly Employee Class  -------------------------- //
class HourlyEmp extends Employee implements IPayrollCal{

    @Override
    public void calPayroll() {
        System.out.println("Hourly Employee Payroll.\n");
    }

}

// --------------------------------  Salary Employee Class  -------------------------- //
class SalaryEmp extends Employee implements IPayrollCal{

    @Override
    public void calPayroll() {
        System.out.println("Salary Employee Payroll.\n");
    }

}

// --------------------------------  Commission Employee Class  -------------------------- //
class CommissionEmp extends SalaryEmp{

    @Override
    public void calPayroll() {
        System.out.println("Commission Employee Payroll.\n");
    }

}

// --------------------------------  main Class  -------------------------- //
class Q2
{
    public static void main(String arg[]) {
            
        Employee Hourly = new HourlyEmp();            // HourlyEmployee Object
        Employee Commissioned = new CommissionEmp();        // Commissioned Employee Object
        Employee Salary = new SalaryEmp();            // Salary Employee Object

        Hourly.calPayroll();        // calPayroll of Hourly Employee
        Commissioned.calPayroll();        // calPayroll of Commissioned Employee
        Salary.calPayroll();        // calPayroll of Salary Employee

    }
}
