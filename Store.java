public class Store {

    private Movie[] movies = new Movie[10];

    public Store(Movie[] movies) {
        for (int i = 0; i < movies.length; i++) {
            this.movies[i] = new Movie(movies[i]);
        }
    }

    public Movie getMovie(int index) {
        try {
            if (this.movies[index] == null) {
                return null;
            } else {
                return new Movie(this.movies[index]);
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("We only have 10 movie!");
            return null;
        }

    }

    public void setMovie(int index, Movie movie) {
        this.movies[index] = movie;
    }


    public String toString() {
        String temp = "";
        for (Movie movie : movies) {
            temp += movie.toString() + "\n";
        }
        return temp;
    }

}
