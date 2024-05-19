package employee;
// Assignment: 4
// Author: Danielle Elnekave, ID: 208267096

/**
 * Represents the attendance record of an employee.
 */
public record AttendanceRecord(int id, int totalWorkingDays, int daysPresent) {

    /**
     * Calculates the attendance percentage based on the total number of working days and the number of days present.
     *
     * @return The attendance percentage as a decimal value.
     */
    public double getAttendancePercentage() {
        if (totalWorkingDays == 0) {
            return 0.0;
        }

        double percentage = (double) daysPresent / totalWorkingDays * 100;
        return percentage;
    }

    /**
     * Returns a string representation of the attendance record.
     *
     * @return A string containing the attendance record ID and the attendance percentage.
     */
    @Override
    public String toString() {
        return "Attendance Record ID: " + id + ", Attendance Percentage: " + getAttendancePercentage() + "%";
    }
}
