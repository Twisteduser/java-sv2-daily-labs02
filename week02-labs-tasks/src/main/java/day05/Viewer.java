package day05;

public class Viewer {

    public double watchMovie(Movie movie, int rating) {
        return movie.rateTheMovie(rating);
    }

    public static void main(String[] args) {
        Movie movie = new Movie("Valami film",1999);
        Viewer viewer = new Viewer();

        System.out.println(movie.rateTheMovie(5));
        System.out.println(viewer.watchMovie(movie,5));

    }
}