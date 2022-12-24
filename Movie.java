public class Movie {
    private String name;
    private String format;
    private double rating;

    public Movie (String name, String format, double rating) {
        this.name = name;
        this.format = format;
        this.rating = rating;
    }

    public Movie (Movie source) {
        source.name = name;
        source.format = format;
        source.rating = rating;
    }

    @Override
    public String toString() {
        return this.rating + "\t" + this.format + "\t\t" + this.name;
    }
}
