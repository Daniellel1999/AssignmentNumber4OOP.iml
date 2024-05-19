package employee;
// Assignment: 4
// Author: Danielle Elnekave, ID: 208267096

/**
 * Represents the leave record of an employee.
 */
public record LeaveRecord(int totalLeaves, int leavesTaken) {

    /**
     * Calculates the number of leaves left based on the total number of leaves and the number of leaves taken.
     *
     * @return The number of leaves remaining.
     */
    public int getLeavesLeft() {
        return totalLeaves - leavesTaken;
    }

    /**
     * Returns a string representation of the leave record.
     *
     * @return A string containing the total leaves and the leaves left.
     */
    @Override
    public String toString() {
        return "LeaveRecord total leaves: " + totalLeaves + ", Total leaves left: " + getLeavesLeft();
    }
}
