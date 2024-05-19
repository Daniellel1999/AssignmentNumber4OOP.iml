package enums.colors;
// Assignment: 4
// Author: Danielle Elnekave, ID: 208267096

/**
 * Represents a color with RGB values.
 */
public enum Color {
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    WHITE(255, 255, 255),
    BLACK(0, 0, 0);

    private int red;
    private int green;
    private int blue;

    /**
     * Constructs a color with the specified RGB values.
     *
     * @param red   The red component value (0-255).
     * @param green The green component value (0-255).
     * @param blue  The blue component value (0-255).
     */
    Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    /**
     * Returns the red component value of the color.
     *
     * @return The red component value (0-255).
     */
    public int getRed() {
        return red;
    }

    /**
     * Returns the green component value of the color.
     *
     * @return The green component value (0-255).
     */
    public int getGreen() {
        return green;
    }

    /**
     * Returns the blue component value of the color.
     *
     * @return The blue component value (0-255).
     */
    public int getBlue() {
        return blue;
    }
}
