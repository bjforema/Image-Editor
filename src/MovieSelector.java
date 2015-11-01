import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MovieSelector {

    public static void Menu() {
        System.out.println("Movie Selector - Please enter an option below.\n");
        System.out.println("L - List all movies");
        System.out.println("Y - List movies by year");
        System.out.println("T - Search by title");
        System.out.println("S - Search by genre, rating, and maximum length");
        System.out.println("Q - Quit the program\n");
        System.out.print("Option: ");
    }

    public static void main(String[] args) {
        Scanner data = null;
        try {
            data = new Scanner(new File(args[0]));
        } catch (FileNotFoundException e) {
            System.err.println("The file does not exist!");
        }
        Movie[] movies;
        data.nextLine();
        int count = 0;
        while (data.hasNextLine()) {
            String rawLine = data.nextLine();
            Scanner line = new Scanner(rawLine);
            int countChar = 0;
            String title = "";
            while (line.hasNext()) {
                String token = line.next();
                System.out.println(token);
                while (!token.equals("\t")) {
                    title += token;
                    countChar++;
                }
            }
            System.out.println(title);
            
            
            
            //movies[count] = new Movie(title, year, lengthm rating, genre);
        }
        /*
        boolean correctInput = false;
        do {
            Scanner console = new Scanner(System.in);
            Menu();
            try {
                String userInput = console.next();
                if (userInput.substring(0, 1).equalsIgnoreCase("l")) {
                    listMovies(movies);
                } else if (userInput.substring(0, 1).equalsIgnoreCase("y")) {
                    listByYear(console, movies);
                } else if (userInput.substring(0, 1).equalsIgnoreCase("t")) {
                    searchByTitle(console, movies);
                } else if (userInput.substring(0, 1).equalsIgnoreCase("s")) {
                    search(console, movies);
                } else if (userInput.substring(0, 1).equalsIgnoreCase("q")) {
                    System.out.println("Goodbye!");
                    System.exit(1);
                } else {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.err.println("Invalid Option!");
            }
            console.close();
        } while (!correctInput);
        */
    }

    // List all movie titles the total number of movies
    public static void listMovies(Movie[] movies) {

    }

    // Prompt the user for a year and list all movie titles for that year
    public static void listByYear(Scanner console, Movie[] movies) {

    }

    // Prompt the user for part or all of title and
    // list all movie titles that contain that substring ignoring case
    public static void searchByTitle(Scanner console, Movie[] movies) {

    }

    // Prompt the user for a rating, genre, and maximum length and
    // list all movie titles that meet the criteria
    public static void search(Scanner console, Movie[] movies) {

    }
}
