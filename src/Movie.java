/**
 * A Movie represents a grouping of related information for a movie, such as title and genre
 * 
 * @author Suzanne Balik
 */
public class Movie {

    /** Title of movie */
    private String title;

    /** Year movie was released */
    private int year;

    /** Length of movie in minutes */
    private int length;

    /** Movie rating */
    private String rating;

    /** Movie genre */
    private String genre;

    /**
     * Constructs and initializes a movie object.
     * 
     * @param title
     *            title of movie
     * @param year
     *            year movie was released
     * @param length
     *            length of movie in minutes
     * @param rating
     *            movie rating
     * @param genre
     *            movie genre
     * @throws NullPointerException
     *             if title, rating, and/or genre is/are null
     * @throws IllegalArgumentException
     *             if year and/or length is/are not positive
     */
    public Movie(String title, int year, int length, String rating, String genre) {
        if (title == null || rating == null || genre == null) {
            throw new NullPointerException("title, rating, and/or genre is/are null");
        }
        if (year < 1 || length < 1) {
            throw new IllegalArgumentException("year and/or length is/are not positive");
        }
        this.title = title;
        this.year = year;
        this.length = length;
        this.rating = rating;
        this.genre = genre;
    }

    /**
     * Returns the title of this movie
     * 
     * @return the title of this movie
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns release year of this movie
     * 
     * @return release year of this movie
     */
    public int getYear() {
        return year;
    }

    /**
     * Returns length of this movie
     * 
     * @return length of this movie
     */
    public int getLength() {
        return length;
    }

    /**
     * Returns rating of this movie
     * 
     * @return rating of this movie
     */
    public String getRating() {
        return rating;
    }

    /**
     * Returns the genre of this movie
     * 
     * @return the genre of this movie
     */
    public String getGenre() {
        return genre;
    }
}
