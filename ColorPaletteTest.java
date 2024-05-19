package enums.colors;
// Assignment: 4
// Author: Danielle Elnekave, ID: 208267096

/**
 * A test class for the ColorPalette class.
 */
public class ColorPaletteTest {
    public static void main(String[] args) {
        // Create an array of colors
        Color[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.WHITE, Color.BLACK};

        // Create a color palette with the array of colors
        ColorPalette palette = new ColorPalette(colors);

        // Define an array of color names
        String[] colorNames = {"RED", "GREEN", "BLUE", "WHITE", "BLACK", "GREY", "PURPLE"};

        // Iterate over the color names and retrieve the corresponding color from the palette
        for (int i = 0; i < colorNames.length; i++) {
            String name = colorNames[i];
            Color color = palette.getColorByName(name);
            if (color != null) {
                System.out.println("RGB values for " + name + ": " + color.getRed() + ", " + color.getGreen() + ", " + color.getBlue());
            } else {
                System.out.println("Color not found: " + name);
            }
        }
    }
}
