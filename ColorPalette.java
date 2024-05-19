package enums.colors;
// Assignment: 4
// Author: Danielle Elnekave, ID: 208267096

/**
 * Represents a color palette containing an array of colors.
 */
public class ColorPalette {
    private Color[] colors;

    /**
     * Constructs a color palette with the specified array of colors.
     *
     * @param colors The array of colors to be included in the color palette.
     */
    public ColorPalette(Color[] colors) {
        this.colors = colors;
    }

    /**
     * Returns the color from the color palette that matches the specified name.
     *
     * @param name The name of the color to retrieve.
     * @return The color with the specified name, or null if no such color is found.
     */
    public Color getColorByName(String name) {
        for (int i = 0; i < colors.length; i++) {
            if (colors[i].name().equals(name)) {
                return colors[i];
            }
        }
        return null;
    }
}
