import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * An Image editor that allows the user to create a copy of a PPM file in which the colors have been
 * negated, flattened, or converted to grey scale through command line arguments.
 * 
 * @author Benjamin Foreman
 */
public class ImageEditor {

    /**
     * Sets the max color value.
     */
    public static final int MAX_COLOR_VALUE = 255;

    /**
     * All the valid color values.
     */
    public static final String[] COLOR_VALUES = { "-r", "-g", "-b", "-rg", "-rb", "-gb", "-rgb" };

    /**
     * Displays a header and prompts the user for input in order to manipulate images using RGB
     * values.
     * 
     * @param args
     *            no command line arguments
     */
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Usage: java ImageEditor -n|-f -rgb infile outfile");
            System.exit(1);
        }
        Scanner data = new Scanner(System.in);
        data.nextLine();
        int width = data.nextInt();
        int height = data.nextInt();
        int[][] ppm = new int[width][];
        int count = 0;
        while (data.hasNextLine()) {
            while (data.hasNextInt()) {
                ppm[count][width * 3] += data.nextInt();
            }
            System.out.println(ppm[count]);
            count++;
            
        }
        if (args[0].substring(1, 2).equalsIgnoreCase("")) {
            greyScale(ppm);
        } else if (args[0].substring(1, 2).equalsIgnoreCase("g")) {
            
        }
    }

    /**
     * Returns a new 2D array with the same number of rows and columns as the ppm array. The color
     * value for each color that is true should be negated, as described above, in the returned
     * array. The color value for each color that is false should be unchanged in the returned
     * array. You may assume that each row in the ppm array has the same number of columns.
     * 
     * @param red
     *            is true if being edited
     * @param green
     *            is true if being edited
     * @param blue
     *            is true if being edited
     * @param ppm
     *            returns the 2D array of rgb values for the input image
     * @return the 2D array of rgb values for the edited image
     */
    public static int[][] negate(boolean red, boolean green, boolean blue, int[][] ppm) {
        return null;
    }

    /**
     * Returns a new 2D array with the same number of rows and columns as the ppm array. The color
     * value for each color that is true should be flattened, as described above, in the returned
     * array. The color value for each color that is false should be unchanged in the returned
     * array. You may assume that each row in the ppm array has the same number of columns.
     * 
     * @param red
     *            is true if being edited
     * @param green
     *            is true if being edited
     * @param blue
     *            is true if being edited
     * @param ppm
     *            returns the 2D array of rgb values for the input image
     * @return the 2D array of rgb values for the edited image
     */
    public static int[][] flatten(boolean red, boolean green, boolean blue, int[][] ppm) {
        return null;
    }

    /**
     * Copies the input ppm file to the output file, converting it to grey scale, as described
     * above.
     * 
     * @param input
     *            Scanner of a user specified file
     * @param output
     *            PrintStream of a user specified file
     */
    public static void greyScale(int[][] ppm) {
    }
}
