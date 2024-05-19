package employee;
// Assignment: 4
// Author: Danielle Elnekave, ID: 208267096

/**
 * Represents an employee record.
 */
public record EmployeeRecord(int id, String name, int age, String department, String designation) {

    /**
     * Returns a string representation of the employee record.
     *
     * @return A string containing the employee's name, ID, department, and designation.
     */
    @Override
    public String toString() {
        return "EmployeeRecord Name: " + name + ", ID: " + id
                + ", Department: " + department
                + ", Designation: " + designation;
    }
}
