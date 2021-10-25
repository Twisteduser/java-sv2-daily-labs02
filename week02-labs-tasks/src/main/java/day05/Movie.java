
package day05;

public class Movie {

    private String title;
    private int year;
    private double rating;
    private int numOfRatings = 20;
    private int amountOfRatings = 40;

    public Movie (String title, int year){
        this.title = title;
        this.year = year;
    }

    public double rateTheMovie (int rating){
        return (double) (amountOfRatings+rating)/(numOfRatings+1);
    }



}