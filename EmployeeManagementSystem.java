package employee;
// Assignment: 4
// Author: Danielle Elnekave, ID: 208267096

/**
 * A simple employee management system to demonstrate the usage of employee-related classes.
 */

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create instances of AttendanceRecord
        AttendanceRecord attendanceRecord1 = new AttendanceRecord(54785, 5, 3);
        AttendanceRecord attendanceRecord2 = new AttendanceRecord(41544, 18, 17);

        // Create instances of EmployeeRecord
        EmployeeRecord employeeRecord1 = new EmployeeRecord(87754, "Amos Tamam", 36, "Administration", "IT Administrator");
        EmployeeRecord employeeRecord2 = new EmployeeRecord(36798, "Yehuda Levy", 42, "Sales", "HR Manager");

        // Create instances of LeaveRecord
        LeaveRecord leaveRecord1 = new LeaveRecord(84, 43);
        LeaveRecord leaveRecord2 = new LeaveRecord(63, 63);

        // Create instances of PayrollRecord
        PayrollRecord payrollRecord1 = new PayrollRecord(78451, 5400, 1500, 254);
        PayrollRecord payrollRecord2 = new PayrollRecord(48576, 6800, 2500, 750);

        // Print the information for each record
        System.out.println(attendanceRecord1);
        System.out.println(attendanceRecord2);
        System.out.println(employeeRecord1);
        System.out.println(employeeRecord2);
        System.out.println(leaveRecord1);
        System.out.println(leaveRecord2);
        System.out.println(payrollRecord1);
        System.out.println(payrollRecord2);
    }
}
