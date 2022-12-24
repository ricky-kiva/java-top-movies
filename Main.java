import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Movie[] movies = new Movie[] {
            new Movie("The Shawshank Redemption", "BlueRay", 9.2),
            new Movie("The Godfather", "BlueRay", 9.1),
            new Movie("The Godfather: Part II", "DVD", 9.0),
            new Movie("The Dark Knight", "BlueRay", 9.0),
            new Movie("Schindler's List", "DVD", 8.9),
            new Movie("The Lord of the Rings: The Return of the King", "BlueRay", 8.9),
            new Movie("Pulp Fiction", "DVD", 8.8),
            new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8)
        };

        Store store = new Store(movies);

        System.out.println("\n********************************MOVIE STORE*******************************\n");

        for (int i = 0; i < store.getStoreLength(); i++) {
            System.out.println((i+1) + ".\t" + store.getMovie(i));
        }

        Scanner scan = new Scanner(System.in);

        System.out.print("\nTo edit a list, type 'continue': ");
        String cont = scan.next();

        while (cont.equals("continue")) {

            System.out.print("\nPlease choose which index to change: ");
            int index = scan.nextInt();
            scan.nextLine();
            index -= 1;

            System.out.print("\nWhat's the name of the movie? ");
            String movieName = scan.nextLine();

            System.out.print("\nWhat's the format? ");
            String movieFormat = scan.next();

            System.out.print("\nAnd how's the rating? ");
            double movieRating = scan.nextDouble();

            store.setMovie(index, new Movie(movieName, movieFormat, movieRating));

            System.out.print("\n********************************MOVIE STORE*******************************\n");

            for (int i = 0; i < store.getStoreLength(); i++) {
                System.out.println((i+1) + ".\t" + store.getMovie(i));
            }

            System.out.print("\nTo edit a list, type 'continue': ");
            cont = scan.next();

        }

        scan.close();

    }


}
