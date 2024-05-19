package employee;
// Assignment: 4
// Author: Danielle Elnekave, ID: 208267096

/**
 * Represents the payroll record of an employee.
 */
public record PayrollRecord(int id, int salary, int bonus, int tax) {

    /**
     * Calculates the total salary by adding the base salary, bonus, and subtracting the tax.
     *
     * @return The total salary after accounting for bonus and tax.
     */
    public double getTotalSalary() {
        return salary + bonus - tax;
    }

    /**
     * Returns a string representation of the payroll record.
     *
     * @return A string containing the payroll record ID and the total salary.
     */
    @Override
    public String toString() {
        return "PayrollRecord ID: " + id + ", Total Salary: " + getTotalSalary();
    }
}
