package day04;

public class Car {

    private int liter;
    private int distance;

    public void setLiter(int liter) {
        this.liter = liter;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public double fogyasztas () {
        return (double) liter/distance*100;
    }

}